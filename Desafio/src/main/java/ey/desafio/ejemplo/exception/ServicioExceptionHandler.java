package ey.desafio.ejemplo.exception;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.validation.ConstraintViolationException;

import org.springframework.web.HttpRequestMethodNotSupportedException;

@RestControllerAdvice
public class ServicioExceptionHandler {

	/**
	 * Log de la clase.
	 */
	private static Logger log = LogManager.getLogger(ServicioExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setCodigoError("500");
		response.setMensajeError(ex.getMessage());
		log.error("[Exception] Error procesando solicitud", ex);
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public final ResponseEntity<ExceptionResponse> handleHttpMessageNotReadableException(Exception ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setCodigoError("400");
		response.setMensajeError("Bad Request");
		log.error("[Exception] Error procesando solicitud", ex);
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<ExceptionResponse> methodNotAllowed(HttpRequestMethodNotSupportedException ex) {
		ExceptionResponse resp = new ExceptionResponse();
		SubError subError = new SubError();

		subError.setField("405");
		subError.setMessage(ex.getMessage());
		resp.setCodigoError("405");
		resp.setMensajeError(ex.getMessage());
		resp.getSubErrors().add(subError);

		return new ResponseEntity<>(resp, HttpStatus.METHOD_NOT_ALLOWED);

	}

	@ExceptionHandler(ConstraintViolationException.class)
	public final ResponseEntity<ExceptionResponse> entradaObligatoria(ConstraintViolationException ex) {
		ExceptionResponse resp = new ExceptionResponse();
		SubError subError = new SubError();

		subError.setField("400");
		subError.setMessage(ex.getMessage());
		resp.setCodigoError("400");
		resp.setMensajeError("Bad Request");
		resp.getSubErrors().add(subError);

		log.error("[Exception] Error procesando solicitud ", ex);
		return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionResponse> invalidInput(MethodArgumentNotValidException ex) {
		BindingResult result = ex.getBindingResult();
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setCodigoError("400");
		exceptionResponse.setMensajeError("Atributos no validos");
		exceptionResponse.setValidationErrors(result);
		log.error("[MethodArgumentNotValidException] Error procesando solicitud: ", ex);
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);

	}
}

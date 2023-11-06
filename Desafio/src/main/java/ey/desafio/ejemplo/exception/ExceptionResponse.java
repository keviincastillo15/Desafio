package ey.desafio.ejemplo.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

public class ExceptionResponse implements Serializable {

	/**
	 * Serial de la clase.
	 */
	private static final long serialVersionUID = -2271879577327009797L;

	private String codigoError;

	private String mensajeError;

	private List<SubError> subErrors = new ArrayList<>();

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	public List<SubError> getSubErrors() {
		return subErrors;
	}

	public void setSubErrors(List<SubError> subErrors) {
		this.subErrors = subErrors;
	}

	public void setValidationErrors(Errors errors) {
		List<FieldError> fieldErrors = errors.getFieldErrors();
		fieldErrors
				.forEach(f -> subErrors.add(new SubError(f.getField(), f.getDefaultMessage(), f.getRejectedValue())));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExceptionResponse [codigoError=");
		builder.append(codigoError);
		builder.append(", mensajeError=");
		builder.append(mensajeError);
		builder.append("]");
		return builder.toString();
	}
}
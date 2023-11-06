package ey.desafio.ejemplo.controller.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import ey.desafio.ejemplo.controller.DesafioInterface;
import ey.desafio.ejemplo.model.RequestDesafio;
import ey.desafio.ejemplo.model.ResponseDesafio;
import ey.desafio.ejemplo.service.implementation.DesafioService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
public class DesafioController implements DesafioInterface{

	@Autowired
	DesafioService service;
	
	private static Logger log = LoggerFactory.getLogger(DesafioController.class);
	
	@Override
	public ResponseEntity<ResponseDesafio> getConsultaUser(@Valid @NotNull RequestDesafio request) throws Exception {
		log.info("[Desafio] [getConsultaUser]- Inicio.");
		return new ResponseEntity<>(service.getConsultaUser(request), HttpStatus.OK);
	}

}

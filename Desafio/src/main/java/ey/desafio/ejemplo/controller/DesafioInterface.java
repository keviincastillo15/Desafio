package ey.desafio.ejemplo.controller;



import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ey.desafio.ejemplo.model.RequestDesafio;
import ey.desafio.ejemplo.model.ResponseDesafio;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RequestMapping
public interface DesafioInterface {

	@PostMapping(value="/consultaUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <ResponseDesafio> getConsultaUser(@Valid @NotNull @RequestBody RequestDesafio Request ) throws Exception;
	
}

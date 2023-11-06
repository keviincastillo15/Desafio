package ey.desafio.ejemplo.service;

import ey.desafio.ejemplo.model.RequestDesafio;
import ey.desafio.ejemplo.model.ResponseDesafio;

public interface DesafioServiceInterface {

	public ResponseDesafio getConsultaUser(RequestDesafio request) throws Exception;
}

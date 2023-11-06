package ey.desafio.ejemplo.service.implementation;

import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ey.desafio.ejemplo.model.EntityModel;
import ey.desafio.ejemplo.model.RequestDesafio;
import ey.desafio.ejemplo.model.ResponseDesafio;
import ey.desafio.ejemplo.repository.InterfaceRepository;
import ey.desafio.ejemplo.service.DesafioServiceInterface;
import ey.desafio.ejemplo.util.Util;

@Service
public class DesafioService implements DesafioServiceInterface{

	@Autowired
	Util util;
	
	@Autowired
	InterfaceRepository repo;
	
	private static Logger log = LoggerFactory.getLogger(DesafioService.class);
	
	@Override
	public ResponseDesafio getConsultaUser(RequestDesafio request) throws Exception {
		
		System.out.println(request.toString()); 
		
		if (util.validaEmail(request.getEmail())) {
			log.info("[Desafio] [getConsultaUser]- Email Valido.");
		}else {
			log.info("[Desafio] [getConsultaUser]- Email invalido.");
			throw new Exception("Email Invalido");
		}
		
		if (util.validaContraseña(request.getPassword())) {
			log.info("[Desafio] [getConsultaUser]- Contraseña Valido.");
		}else {
			log.info("[Desafio] [getConsultaUser]- Contraseña invalida.");
			throw new Exception("Contraseña Invalida");
		}
		
		
		//Generador de clave unica
		  UUID uuid = UUID.randomUUID();
	      String uuidAsString = uuid.toString();
	      
	      java.util.Date fecha = new Date();
	      
	      EntityModel bd = new EntityModel();
	      
	      bd.setId(uuidAsString);
	      bd.setName(request.getName());
	      bd.setEmail(request.getEmail());
	      bd.setPassword(request.getPassword());
	      bd.setNumber(request.getPhones().getNumber());
	      bd.setCitycode(request.getPhones().getCitycode());
	      bd.setContrycode(request.getPhones().getContrycode());
	      bd.setDateCreacionUser(fecha);
	      bd.setDateActualizacionUser(fecha);
	      bd.setDateUltimoAcceso(fecha);
	      bd.setToken(uuidAsString);
	      bd.setActive(true);
	      
	      log.info("[Desafio] [getConsultaUser]- Usuario Guardado");
	      
			ResponseDesafio response = new ResponseDesafio();
	  
			response.setId(bd.getId());
			response.setDateCreacionUser(bd.getDateCreacionUser());
			response.setDateActualizacionUser(bd.getDateActualizacionUser());
			response.setDateUltimoAcceso(bd.getDateUltimoAcceso());
			response.setToken(bd.getToken());
			response.setActive(bd.isActive());
		
		
	
	
			
		return response;
	}
	


}

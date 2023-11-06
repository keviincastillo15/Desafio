package ey.desafio.ejemplo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class Util {

	//Validador de Gmail
	public Boolean validaEmail (String email) {
		Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	//Validador contraseña
	public Boolean validaContraseña (String contraseña) {
		Pattern pattern = Pattern.compile("(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");
		Matcher matcher = pattern.matcher(contraseña);
		return matcher.matches();
	}

}

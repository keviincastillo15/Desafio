package ey.desafio.ejemplo.model;

import java.util.Date;

public class ResponseDesafio {
	
	private String id;
	private Date dateCreacionUser;
	private Date dateActualizacionUser;
	private Date dateUltimoAcceso;
	private String token;
	private boolean isActive;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateCreacionUser() {
		return dateCreacionUser;
	}

	public void setDateCreacionUser(Date dateCreacionUser) {
		this.dateCreacionUser = dateCreacionUser;
	}

	public Date getDateActualizacionUser() {
		return dateActualizacionUser;
	}

	public void setDateActualizacionUser(Date dateActualizacionUser) {
		this.dateActualizacionUser = dateActualizacionUser;
	}

	public Date getDateUltimoAcceso() {
		return dateUltimoAcceso;
	}

	public void setDateUltimoAcceso(Date dateUltimoAcceso) {
		this.dateUltimoAcceso = dateUltimoAcceso;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "ResponseDesafio [id=" + id + ", dateCreacionUser=" + dateCreacionUser + ", dateActualizacionUser="
				+ dateActualizacionUser + ", dateUltimoAcceso=" + dateUltimoAcceso + ", token=" + token + ", isActive="
				+ isActive + "]";
	}

}

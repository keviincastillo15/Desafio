package ey.desafio.ejemplo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EntityModel")
public class EntityModel {

	@Id
    @GeneratedValue
	private String id;
	private String name;
	private String email;
	private String password;
	private int number;
	private int citycode;
	private int contrycode;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCitycode() {
		return citycode;
	}
	public void setCitycode(int citycode) {
		this.citycode = citycode;
	}
	public int getContrycode() {
		return contrycode;
	}
	public void setContrycode(int contrycode) {
		this.contrycode = contrycode;
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
		return "EntityModel [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", number="
				+ number + ", citycode=" + citycode + ", contrycode=" + contrycode + ", dateCreacionUser="
				+ dateCreacionUser + ", dateActualizacionUser=" + dateActualizacionUser + ", dateUltimoAcceso="
				+ dateUltimoAcceso + ", token=" + token + ", isActive=" + isActive + "]";
	}
	
	
	

}

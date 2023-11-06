package ey.desafio.ejemplo.model;

public class Phones {
	
	private int number;
	private int citycode;
	private int contrycode;
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
	
	@Override
	public String toString() {
		return "Phone [number=" + number + ", citycode=" + citycode + ", contrycode=" + contrycode + "]";
	}
	
	
}

package ey.desafio.ejemplo.exception;

import java.io.Serializable;

public class SubError implements Serializable {

	/**
	 * Serial de la clase.
	 */
	private static final long serialVersionUID = -6008807432617233524L;

	private String field;
	private String message;
	private Object rejectedValue;

	
	
	public SubError() {
		super();
	}

	public SubError(String field, String message, Object rejectedValue) {
		super();
		this.field = field;
		this.message = message;
		this.rejectedValue = rejectedValue;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getRejectedValue() {
		return rejectedValue;
	}

	public void setRejectedValue(Object rejectedValue) {
		this.rejectedValue = rejectedValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubError [field=");
		builder.append(field);
		builder.append(", message=");
		builder.append(message);
		builder.append(", rejectedValue=");
		builder.append(rejectedValue);
		builder.append("]");
		return builder.toString();
	}

}
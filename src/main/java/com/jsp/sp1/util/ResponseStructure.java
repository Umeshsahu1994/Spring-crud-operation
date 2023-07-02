package com.jsp.sp1.util;

public class ResponseStructure<T>{
	private String message;//what u want to show a msg in postman
	private int status;  //status of http which hiting
	private Object data; //whatever u r entry in json format
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	

}

package com.telnor.ws.rest.vo;

public class ObjetoUsuario {
	private String usuario;
	private String pass;
	private int   tipo;
	private boolean userValido;
	

	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo() {
		this.tipo = tipo;
	}
	public boolean isUserValido() {
		return userValido;
	}
	public void setUserValido(boolean userValido) {
		this.userValido = userValido;
	}
	
	@Override
	public String toString() {
		return "ObjetoUsuario [usuario=" + usuario + ", pass=" + pass + ", tipo=" + tipo + ", userValido=" + userValido
				+ "]";
	}
	
	
	
	
	
}

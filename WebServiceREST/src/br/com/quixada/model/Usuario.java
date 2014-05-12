package br.com.quixada.model;

import java.util.ArrayList;

public class Usuario {
	private String idUsuario;
	private String name;
	private String sexo;
	private String email;
	private String nascimento;
	private ArrayList<Denuncia> denuncias; 
	
	
	public Usuario() {
		super();
	}
	public Usuario(String name, String sexo, String email, String nascimento) {
		super();
		this.name = name;
		this.sexo = sexo;
		this.email = email;
		this.nascimento = nascimento;
	}
	
	
	public ArrayList<Denuncia> getDenuncias() {
		return denuncias;
	}
	public void setDenuncias(ArrayList<Denuncia> denuncias) {
		this.denuncias = denuncias;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", name=" + name + ", sexo="
				+ sexo + ", email=" + email + ", nascimento=" + nascimento
				+ ", denuncias=" + denuncias + "]";
	}
	
	
}

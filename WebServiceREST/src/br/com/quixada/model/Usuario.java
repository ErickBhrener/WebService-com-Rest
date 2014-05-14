package br.com.quixada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Usuario {
	@Column
	private String name;
	@Id
	@Column
	private String email;
	
	@Column
	private String senha;
	
	public Usuario() {
		super();
	}

	public Usuario(String name, String email, String senha) {
		super();
		this.name = name;
		this.email = email;
		this.senha = senha;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [name=" + name + ", email=" + email + ", senha="
				+ senha + "]";
	}
	
	
}

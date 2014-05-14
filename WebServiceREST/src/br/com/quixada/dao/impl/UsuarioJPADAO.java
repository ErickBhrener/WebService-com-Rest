package br.com.quixada.dao.impl;

import br.com.quixada.dao.UsuarioDAO;
import br.com.quixada.model.Usuario;

public class UsuarioJPADAO extends GenericJPADAO<Usuario> implements UsuarioDAO{
	public UsuarioJPADAO(){
		this.persistentClass = Usuario.class;
	}
}

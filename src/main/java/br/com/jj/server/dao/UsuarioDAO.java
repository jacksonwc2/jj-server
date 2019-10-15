package br.com.jj.server.dao;

import br.com.jj.server.model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {

	public abstract Usuario buscarPorLogin(String login);

}

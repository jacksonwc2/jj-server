package br.com.jj.server.dao.impl;

import static br.com.jj.server.model.QUsuario.usuario;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.jj.server.dao.UsuarioDAO;
import br.com.jj.server.model.Usuario;

@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements UsuarioDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@PostConstruct
	public void inicializar() {
		setEntityManager(entityManager);
	}

	@Override
	public Usuario buscarPorLogin(String login) {
		return from().where(usuario.login.eq(login)).uniqueResult(usuario);
	}

}

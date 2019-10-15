package br.com.jj.server.dao.impl;

import static br.com.jj.server.model.QEstado.estado;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.jj.server.dao.EstadoDAO;
import br.com.jj.server.model.Estado;

@Repository
public class EstadoDAOImpl extends GenericDAOImpl<Estado> implements EstadoDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@PostConstruct
	public void inicializar() {
		setEntityManager(entityManager);
	}

	@Override
	public List<Estado> adquirir() {

		return from().list(estado);
	}

	/*
	 * @Override public List<Cidade> adquirir() { List<Cidade> cidadeDois =
	 * from().list(cidade);
	 * 
	 * return cidadeDois; }
	 */

}

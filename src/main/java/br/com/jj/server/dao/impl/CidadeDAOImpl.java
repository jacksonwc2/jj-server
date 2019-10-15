package br.com.jj.server.dao.impl;

import static br.com.jj.server.model.QCidade.cidade;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.jj.server.dao.CidadeDAO;
import br.com.jj.server.model.Cidade;

@Repository
public class CidadeDAOImpl extends GenericDAOImpl<Cidade> implements CidadeDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@PostConstruct
	public void inicializar() {
		setEntityManager(entityManager);
	}

	@Override
	public List<Cidade> adquirir() {
		List<Cidade> cidadeDois = from().list(cidade);

		return cidadeDois;
	}

}

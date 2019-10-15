package br.com.jj.server.dao.impl;

import static br.com.jj.server.model.QTipoSexo.tipoSexo;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.jj.server.dao.TipoSexoDAO;
import br.com.jj.server.model.TipoSexo;

@Repository
public class TipoSexoDAOImpl extends GenericDAOImpl<TipoSexo> implements TipoSexoDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@PostConstruct
	public void inicializar() {
		setEntityManager(entityManager);
	}

	@Override
	public List<TipoSexo> adquirir() {
		return from().list(tipoSexo);
	}

}

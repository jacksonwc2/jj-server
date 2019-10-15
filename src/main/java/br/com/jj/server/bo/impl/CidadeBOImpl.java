package br.com.jj.server.bo.impl;

import java.util.List;

import javax.annotation.ManagedBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.jj.server.bo.CidadeBO;
import br.com.jj.server.dao.CidadeDAO;
import br.com.jj.server.model.Cidade;

@ManagedBean
public class CidadeBOImpl implements CidadeBO {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CidadeDAO cidadeDAO;

	@Override
	public List<Cidade> adquirir() {
		logger.info("==> Executando o método adquirir.");

		return cidadeDAO.adquirir();
	}

	@Override
	public List<Cidade> adquirirPorEstado(String estado) {
		logger.info("==> Executando o método adquirirPorEstado.");
		return null;
	}

}

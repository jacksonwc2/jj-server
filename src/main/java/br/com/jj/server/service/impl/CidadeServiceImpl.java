package br.com.jj.server.service.impl;

import java.util.List;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.jj.server.bo.CidadeBO;
import br.com.jj.server.model.Cidade;
import br.com.jj.server.service.CidadeService;

@ManagedBean
public class CidadeServiceImpl implements CidadeService {

	@Autowired
	private CidadeBO cidadeBO;

	@Override
	public List<Cidade> adquirir() {
		return cidadeBO.adquirir();
	}

	@Override
	public List<Cidade> adquirirPorEstado(String estado) {
		return cidadeBO.adquirirPorEstado(estado);
	}

}

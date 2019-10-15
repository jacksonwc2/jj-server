package br.com.jj.server.dao;

import java.util.List;

import br.com.jj.server.model.Cidade;

public interface CidadeDAO extends GenericDAO<Cidade> {

	public abstract List<Cidade> adquirir();

}

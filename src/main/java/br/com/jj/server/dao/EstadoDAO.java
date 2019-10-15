package br.com.jj.server.dao;

import java.util.List;

import br.com.jj.server.model.Estado;

public interface EstadoDAO extends GenericDAO<Estado> {

	public abstract List<Estado> adquirir();

}

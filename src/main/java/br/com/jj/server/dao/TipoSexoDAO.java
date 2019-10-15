package br.com.jj.server.dao;

import java.util.List;

import br.com.jj.server.model.TipoSexo;

public interface TipoSexoDAO extends GenericDAO<TipoSexo> {

	public abstract List<TipoSexo> adquirir();

}

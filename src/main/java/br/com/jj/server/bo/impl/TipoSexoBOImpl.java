package br.com.jj.server.bo.impl;

import java.util.List;

import javax.annotation.ManagedBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.jj.server.bo.TipoSexoBO;
import br.com.jj.server.dao.TipoSexoDAO;
import br.com.jj.server.model.TipoSexo;

@ManagedBean
public class TipoSexoBOImpl implements TipoSexoBO {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private TipoSexoDAO tipoSexoDAO;

	@Override
	public List<TipoSexo> adquirir() {
		logger.info("==> Executando o método adquirir.");

		return tipoSexoDAO.adquirir();
	}

}

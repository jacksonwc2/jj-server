package br.com.jj.server.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.jj.server.bo.ClienteBO;
import br.com.jj.server.bo.EstadoBO;
import br.com.jj.server.bo.TipoSexoBO;
import br.com.jj.server.dto.CamposCadastroClienteDTO;
import br.com.jj.server.dto.ChaveValorDTO;

@ManagedBean
public class ClienteBOImpl implements ClienteBO {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EstadoBO estadoBO;

	@Autowired
	private TipoSexoBO tipoSexoBO;

	@Override
	public CamposCadastroClienteDTO adquirirCamposCadastro() {
		logger.info("==> Executando o método adquirirCamposCadastro.");

		CamposCadastroClienteDTO camposCadastroClienteDTO = new CamposCadastroClienteDTO();
		camposCadastroClienteDTO.setEstados(this.setarEstados());
		camposCadastroClienteDTO.setTipoSexos(this.setarTipoSexo());

		return camposCadastroClienteDTO;
	}

	private List<ChaveValorDTO> setarTipoSexo() {
		logger.info("==> Executando o método setarTipoSexo.");

		List<ChaveValorDTO> retorno = new ArrayList<ChaveValorDTO>();

		tipoSexoBO.adquirir().forEach(x -> retorno.add(new ChaveValorDTO(x.getId(), x.getDescricao())));

		return retorno;
	}

	private List<ChaveValorDTO> setarEstados() {
		logger.info("==> Executando o método setarEstados.");

		List<ChaveValorDTO> retorno = new ArrayList<ChaveValorDTO>();

		estadoBO.adquirir().forEach(x -> retorno.add(new ChaveValorDTO(x.getId(), x.getDescricao())));

		return retorno;
	}

}

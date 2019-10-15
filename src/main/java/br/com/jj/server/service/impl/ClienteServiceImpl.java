package br.com.jj.server.service.impl;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.jj.server.bo.ClienteBO;
import br.com.jj.server.dto.CamposCadastroClienteDTO;
import br.com.jj.server.service.ClienteService;

@ManagedBean
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteBO clienteBO;

	@Override
	public CamposCadastroClienteDTO adquirirCamposCadastro() {
		return clienteBO.adquirirCamposCadastro();
	}

}

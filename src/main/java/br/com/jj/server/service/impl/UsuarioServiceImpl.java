package br.com.jj.server.service.impl;

import javax.annotation.ManagedBean;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.jj.server.bo.UsuarioBO;
import br.com.jj.server.dto.LoginDTO;
import br.com.jj.server.service.UsuarioService;

@ManagedBean
public class UsuarioServiceImpl implements UsuarioService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UsuarioBO usuarioBO;

	@Override
	public Boolean validarLogin(@RequestBody @Valid LoginDTO loginDTO) {
		logger.info("==> Executando o método validarLogin.");

		return usuarioBO.validarLogin(loginDTO);
	}

	@Override
	public Boolean novoUsuario(@RequestBody @Valid LoginDTO loginDTO) {
		logger.info("==> Executando o método novoUsuario.");

		return usuarioBO.novoUsuario(loginDTO);
	}

}

package br.com.jj.server.bo.impl;

import java.util.Date;

import javax.annotation.ManagedBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.jj.server.bo.UsuarioBO;
import br.com.jj.server.dao.UsuarioDAO;
import br.com.jj.server.dto.LoginDTO;
import br.com.jj.server.model.Usuario;

@ManagedBean
public class UsuarioBOImpl implements UsuarioBO {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public Boolean validarLogin(LoginDTO loginDTO) {
		logger.info("==> Executando o método validarLogin.");

		Usuario usuario = usuarioDAO.buscarPorLogin(loginDTO.getLogin());

		return usuario != null ? usuario.getSenha().equals(loginDTO.getSenha()) : Boolean.FALSE;
	}

	@Override
	public Boolean novoUsuario(LoginDTO loginDTO) {
		logger.info("==> Executando o método novoUsuario.");

		Usuario usuario = usuarioDAO.buscarPorLogin(loginDTO.getLogin());

		if (usuario == null) {
			usuario = new Usuario();
			usuario.setEmail(loginDTO.getEmail());
			usuario.setLogin(loginDTO.getLogin());
			usuario.setSenha(loginDTO.getSenha());
			usuario.setDataCadastro(new Date());
			usuario.setManutencao(new Date());

			usuario = usuarioDAO.salvar(usuario);

			return usuario != null;
		}

		return Boolean.FALSE;
	}

}

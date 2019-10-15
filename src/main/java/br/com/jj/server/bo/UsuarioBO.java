package br.com.jj.server.bo;

import br.com.jj.server.dto.LoginDTO;

public interface UsuarioBO {

	public abstract Boolean validarLogin(LoginDTO loginDTO);

	public abstract Boolean novoUsuario(LoginDTO loginDTO);

}

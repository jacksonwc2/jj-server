package br.com.jj.server.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jj.server.dto.LoginDTO;

@RestController
@RequestMapping("usuarioService")
public interface UsuarioService {

	@RequestMapping(path = "validarLogin", method = RequestMethod.POST, produces = "application/json")
	public abstract Boolean validarLogin(LoginDTO loginDTO);

	@RequestMapping(path = "novoUsuario", method = RequestMethod.POST, produces = "application/json")
	public abstract Boolean novoUsuario(LoginDTO loginDTO);

}

package br.com.jj.server.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jj.server.dto.CamposCadastroClienteDTO;

@RestController
@RequestMapping("clienteService")
public interface ClienteService {

	@RequestMapping(path = "adquirirCamposCadastro", method = RequestMethod.GET, produces = "application/json")
	public abstract CamposCadastroClienteDTO adquirirCamposCadastro();

}

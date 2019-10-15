package br.com.jj.server.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jj.server.model.Cidade;

@RestController
@RequestMapping("cidadeService")
public interface CidadeService {

	@RequestMapping(path = "adquirir", method = RequestMethod.GET, produces = "application/json")
	public abstract List<Cidade> adquirir();

	@RequestMapping(path = "adquirirPorEstado", method = RequestMethod.GET, produces = "application/json")
	public abstract List<Cidade> adquirirPorEstado(String estado);

}

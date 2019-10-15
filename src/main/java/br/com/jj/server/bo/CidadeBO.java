package br.com.jj.server.bo;

import java.util.List;

import br.com.jj.server.model.Cidade;

public interface CidadeBO {

	public abstract List<Cidade> adquirir();

	public abstract List<Cidade> adquirirPorEstado(String estado);

}

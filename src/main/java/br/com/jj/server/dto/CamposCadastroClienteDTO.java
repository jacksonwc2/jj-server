package br.com.jj.server.dto;

import java.util.List;

public class CamposCadastroClienteDTO {

	private List<ChaveValorDTO> estados;

	private List<ChaveValorDTO> tipoSexos;

	public List<ChaveValorDTO> getEstados() {
		return estados;
	}

	public void setEstados(List<ChaveValorDTO> estados) {
		this.estados = estados;
	}

	public List<ChaveValorDTO> getTipoSexos() {
		return tipoSexos;
	}

	public void setTipoSexos(List<ChaveValorDTO> tipoSexos) {
		this.tipoSexos = tipoSexos;
	}

}

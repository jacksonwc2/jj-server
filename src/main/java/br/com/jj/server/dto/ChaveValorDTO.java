package br.com.jj.server.dto;

public class ChaveValorDTO {

	private Long chave;

	public ChaveValorDTO(Long chave, String valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}

	private String valor;

	public Long getChave() {
		return chave;
	}

	public void setChave(Long chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}

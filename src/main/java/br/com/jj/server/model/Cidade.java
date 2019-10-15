package br.com.jj.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_cidade")
@SequenceGenerator(name = "gen_cidade", sequenceName = "gen_cidade", allocationSize = 1)
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_cidade")
	@GeneratedValue(generator = "gen_cidade", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_estado")
	@Getter
	@Setter
	private Long codigoEstado;

	@Column(name = "tx_descricao")
	@Getter
	@Setter
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(Long codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
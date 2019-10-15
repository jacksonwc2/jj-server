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

@Entity(name = "tb_modelo")
@SequenceGenerator(name = "gen_modelo", sequenceName = "gen_modelo", allocationSize = 1)
public class Modelo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_modelo")
	@GeneratedValue(generator = "gen_modelo", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_marca")
	@Getter
	@Setter
	private Long codigoMarca;

	@Column(name = "cd_tipoveiculo")
	@Getter
	@Setter
	private Long codigoTipoVeiculo;

	@Column(name = "tx_descricao")
	@Getter
	@Setter
	private String descricao;

}

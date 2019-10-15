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

@Entity(name = "tb_tipoveiculo")
@SequenceGenerator(name = "gen_tipoveiculo", sequenceName = "gen_tipoveiculo", allocationSize = 1)
public class TipoVeiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_tipoveiculo")
	@GeneratedValue(generator = "gen_tipoveiculo", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "tx_descricao")
	@Getter
	@Setter
	private String descricao;
}

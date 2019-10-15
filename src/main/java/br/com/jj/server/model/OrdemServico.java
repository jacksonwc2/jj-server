package br.com.jj.server.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_ordemservicoitem")
@SequenceGenerator(name = "gen_ordemservicoitem", sequenceName = "gen_ordemservicoitem", allocationSize = 1)
public class OrdemServico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_ordemservicoitem")
	@GeneratedValue(generator = "gen_ordemservicoitem", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_ordemservico")
	@Getter
	@Setter
	private Long codigoVeiculo;

	@Column(name = "nr_quantidade")
	@Getter
	@Setter
	private Long quantidade;

	@Column(name = "tx_descricao")
	@Getter
	@Setter
	private Long descricao;

	@Column(name = "vl_unitario")
	@Getter
	@Setter
	private BigDecimal valorUnitario;

}

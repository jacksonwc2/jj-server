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

@Entity(name = "tb_nfeitem")
@SequenceGenerator(name = "gen_nfeitem", sequenceName = "gen_nfeitem", allocationSize = 1)
public class NfeItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_nfeitem")
	@GeneratedValue(generator = "gen_nfeitem", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_nfe")
	@Getter
	@Setter
	private Long codigoNfe;

	@Column(name = "tx_descricao")
	@Getter
	@Setter
	private String descricao;

	@Column(name = "vl_unitario")
	@Getter
	@Setter
	private BigDecimal valorUnitario;

	@Column(name = "nr_quantidade")
	@Getter
	@Setter
	private String quantidade;

}

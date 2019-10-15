package br.com.jj.server.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_nfe")
@SequenceGenerator(name = "gen_nfe", sequenceName = "gen_nfe", allocationSize = 1)
public class Nfe implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_nfe")
	@GeneratedValue(generator = "gen_nfe", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_veiculo")
	@Getter
	@Setter
	private Long codigoVeiculo;

	@Column(name = "nr_nota")
	@Getter
	@Setter
	private Long nota;

	@Column(name = "tx_verificacao")
	@Getter
	@Setter
	private String verificacao;

	@Column(name = "dt_emissao")
	@Getter
	@Setter
	private Date emissao;

}

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

@Entity(name = "tb_ordemservico")
@SequenceGenerator(name = "gen_ordemservico", sequenceName = "gen_ordemservico", allocationSize = 1)
public class OrdemServicoItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_ordemservico")
	@GeneratedValue(generator = "gen_ordemservico", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_veiculo")
	@Getter
	@Setter
	private Long codigoVeiculo;

	@Column(name = "nr_codigo")
	@Getter
	@Setter
	private Long codigo;

	@Column(name = "dt_cadastro")
	@Getter
	@Setter
	private Date cadastro;

}

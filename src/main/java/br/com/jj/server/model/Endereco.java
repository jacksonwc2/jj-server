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

@Entity(name = "tb_endereco")
@SequenceGenerator(name = "gen_endereco", sequenceName = "gen_endereco", allocationSize = 1)
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_endereco")
	@GeneratedValue(generator = "gen_endereco", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_cidade")
	@Getter
	@Setter
	private Long codigoCidade;

	@Column(name = "tx_descricao")
	@Getter
	@Setter
	private String descricao;

}

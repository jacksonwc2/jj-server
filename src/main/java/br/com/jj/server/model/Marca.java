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

@Entity(name = "tb_marca")
@SequenceGenerator(name = "gen_marca", sequenceName = "gen_marca", allocationSize = 1)
public class Marca implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_marca")
	@GeneratedValue(generator = "gen_marca", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "tx_descricao")
	@Getter
	@Setter
	private String descricao;

}

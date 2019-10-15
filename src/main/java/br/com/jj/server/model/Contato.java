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

@Entity(name = "tb_contato")
@SequenceGenerator(name = "gen_contato", sequenceName = "gen_contato", allocationSize = 1)
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_contato")
	@GeneratedValue(generator = "gen_contato", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_tipocontato")
	@Getter
	@Setter
	private Long codigoTipoContato;

	@Column(name = "cd_cliente")
	@Getter
	@Setter
	private Long codigoCliente;

	@Column(name = "tx_descricao")
	@Getter
	@Setter
	private String descricao;

}

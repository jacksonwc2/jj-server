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

@Entity(name = "tb_documento")
@SequenceGenerator(name = "gen_documento", sequenceName = "gen_documento", allocationSize = 1)
public class Documento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_documento")
	@GeneratedValue(generator = "gen_documento", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_tipodocumento")
	@Getter
	@Setter
	private Long codigoTipoDocumento;

	@Column(name = "cd_cliente")
	@Getter
	@Setter
	private Long codigoCliente;

	@Column(name = "tx_documento")
	@Getter
	@Setter
	private String documento;

}

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

@Entity(name = "tb_veiculo")
@SequenceGenerator(name = "gen_veiculo", sequenceName = "gen_veiculo", allocationSize = 1)
public class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_veiculo")
	@GeneratedValue(generator = "gen_veiculo", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_cliente")
	@Getter
	@Setter
	private String codigoCliente;

	@Column(name = "cd_marca")
	@Getter
	@Setter
	private String codigoMarca;

	@Column(name = "tx_placa")
	@Getter
	@Setter
	private String placa;

	@Column(name = "dt_motorista")
	@Getter
	@Setter
	private Date motorista;
}

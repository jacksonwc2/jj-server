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

@Entity(name = "tb_cliente")
@SequenceGenerator(name = "gen_cliente", sequenceName = "gen_cliente", allocationSize = 1)
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_cliente")
	@GeneratedValue(generator = "gen_cliente", strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Column(name = "cd_endereco")
	@Getter
	@Setter
	private Long codigoEndereco;

	@Column(name = "cd_tiposexo")
	@Getter
	@Setter
	private Long codigoTipoSexo;

	@Column(name = "tx_nome")
	@Getter
	@Setter
	private String nome;

	@Column(name = "dt_nascimento")
	@Getter
	@Setter
	private Date dataNascimento;

}

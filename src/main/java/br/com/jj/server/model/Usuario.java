package br.com.jj.server.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "tb_usuario")
@SequenceGenerator(name = "gen_usuario", sequenceName = "gen_usuario", allocationSize = 1)
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(generator = "gen_usuario", strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "tx_login")
	private String login;

	@Column(name = "tx_senha")
	private String senha;

	@Column(name = "tx_email")
	private String email;

	@Column(name = "dt_cadastro")
	private Date dataCadastro;

	@Column(name = "dt_manutencao")
	private Date manutencao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getManutencao() {
		return manutencao;
	}

	public void setManutencao(Date manutencao) {
		this.manutencao = manutencao;
	}

}

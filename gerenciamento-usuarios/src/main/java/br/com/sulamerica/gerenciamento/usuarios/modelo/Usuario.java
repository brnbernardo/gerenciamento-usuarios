package br.com.sulamerica.gerenciamento.usuarios.modelo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false)
	private Long id;

	@Column(name="NOME", nullable=false)
	private String nome;

	@Column(name="CPF", nullable=false)
	private String cpf;

	@Column(name="SEXO", nullable=false)
	private String sexo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_NSCMT", nullable=false)
	private Date dataNascimento;

	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "ID_CARGO")
	private Cargo cargo;

	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "ID_PERFIL")
	private Perfil perfil;

	@Column(name="STATUS", nullable=false)
	private String status;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

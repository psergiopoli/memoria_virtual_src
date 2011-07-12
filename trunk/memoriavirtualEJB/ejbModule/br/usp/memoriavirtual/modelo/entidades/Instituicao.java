package br.usp.memoriavirtual.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Instituicao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id	
	private String numeroRegistro;
	@NotNull 
	@Column(unique = true)
	private String nome;
	@Column(unique = true)
	private String email;

	/**
	 * Construtor padrão
	 */
	public Instituicao() {
		super();
	}

	public Instituicao(String numRegistro, String nome) {
		this();
		this.numeroRegistro = numRegistro;
		this.nome = nome;
	
	}

	/**
	 * @return Numero de registro da instituição
	 */
	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	/**
	 * @param numeroRegistro
	 *            Define o numero de registro da instituição
	 */
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	/**
	 * @return O nome da instituição
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            Define o nome da instituição
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return O email da instituição
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email
	 *            Define o email da instituição
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}

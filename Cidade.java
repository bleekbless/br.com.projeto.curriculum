package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Cidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idCidade;
	
	@NotNull(message="Não pode ficar em branco.")
	private String nomeCidade;
	
	@ManyToOne
	@JoinColumn(name="idEstado")
	private Estado estado;
	
	@OneToMany(mappedBy="cidade")
	private List<Pessoa> pessoas; 

	public Short getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Short idCidade) {
		this.idCidade = idCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	

	
}

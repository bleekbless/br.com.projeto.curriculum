package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Frequencia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte idFrequencia;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@OneToMany(mappedBy="frequencia")
	private List<Domestico> domesticos;
	
	@OneToMany(mappedBy="frequencia")
	private List<Aula> aulas;


	public Byte getIdFrequencia() {
		return idFrequencia;
	}

	public void setIdFrequencia(Byte idFrequencia) {
		this.idFrequencia = idFrequencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Domestico> getDomesticos() {
		return domesticos;
	}

	public void setDomesticos(List<Domestico> domesticos) {
		this.domesticos = domesticos;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	
	
	

}

package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Freelancer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte idFreelancer;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@OneToMany(mappedBy="freelancer")
	private List<Servico_Pessoa> servicos;

	public Byte getIdFreelancer() {
		return idFreelancer;
	}

	public void setIdFreelancer(Byte idFreelancer) {
		this.idFreelancer = idFreelancer;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Servico_Pessoa> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico_Pessoa> servicos) {
		this.servicos = servicos;
	}
	
	
}

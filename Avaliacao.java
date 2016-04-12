package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Avaliacao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte idAvaliacao;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@OneToMany(mappedBy="avaliacao")
	private List<Pessoa_Contrata> contratos;

	public Byte getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(Byte idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Pessoa_Contrata> getContratos() {
		return contratos;
	}

	public void setContratos(List<Pessoa_Contrata> contratos) {
		this.contratos = contratos;
	}
	
	
}

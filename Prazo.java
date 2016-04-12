package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Prazo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte idPrazo;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@OneToMany(mappedBy="prazo")
	private List<Domestico> domesticos;

	public Byte getIdPrazo() {
		return idPrazo;
	}

	public void setIdPrazo(Byte idPrazo) {
		this.idPrazo = idPrazo;
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
	
	
	
}

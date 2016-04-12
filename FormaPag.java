package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class FormaPag {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte idFormaPag;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@OneToMany(mappedBy="formaPag")
	private List<Pessoa_Contrata> contratos;

	public Byte getIdFormaPag() {
		return idFormaPag;
	}

	public void setIdFormaPag(Byte idFormaPag) {
		this.idFormaPag = idFormaPag;
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

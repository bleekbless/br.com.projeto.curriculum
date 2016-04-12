package br.com.projeto.curriculum.entidade;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import java.util.List;

import javax.persistence.*;

@Entity
public class TipoTelefone {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte idTipoTelefoe;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@OneToMany(mappedBy="tipoTelefone")
	private List<Telefone> telefones;

	public Byte getIdTipoTelefoe() {
		return idTipoTelefoe;
	}

	public void setIdTipoTelefoe(Byte idTipoTelefoe) {
		this.idTipoTelefoe = idTipoTelefoe;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
}

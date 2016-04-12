package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class EstadoCivil {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte idEstadoCivil;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@OneToMany(mappedBy="estadosCivis")
	private List<Pessoa> pessoas;

	public Byte getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(Byte idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	

}

package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Sexo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idSexo;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@OneToMany(mappedBy="sexo")
	private List<Pessoa> pessoas;
	
	
	public Short getIdSexo() {
		return idSexo;
	}
	public void setIdSexo(Short idSexo) {
		this.idSexo = idSexo;
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

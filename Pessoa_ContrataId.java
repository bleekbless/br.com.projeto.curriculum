package br.com.projeto.curriculum.entidade;

import java.io.Serializable;

public class Pessoa_ContrataId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer pessoa;
	private Integer servico;
	
	
	public Integer getPessoa() {
		return pessoa;
	}
	public void setPessoa(Integer pessoa) {
		this.pessoa = pessoa;
	}
	public Integer getServico() {
		return servico;
	}
	public void setServico(Integer servico) {
		this.servico = servico;
	}
	
	
	@Override
	public int hashCode(){
		return pessoa + servico;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Pessoa_ContrataId){
			Pessoa_ContrataId pessoaContrataId = (Pessoa_ContrataId) obj;
			return pessoaContrataId.pessoa == pessoa && pessoaContrataId.servico == servico;
		}
		return false;
	}
	
	
	
}

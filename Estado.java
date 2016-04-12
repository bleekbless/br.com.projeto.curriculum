package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Estado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte idEstado;
	
	@NotNull(message="Campo Estado não pode ficar em branco")
	private String nomeEstado;
	
	@NotNull(message="Campo sigla não pode ficar em branco")
	@Size(max=2, min=2)
	private String sigla;
	
	@OneToMany(mappedBy="estado")
	private List<Cidade> cidades;
	
	
	public Byte getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Byte idEstado) {
		this.idEstado = idEstado;
	}
	public String getNomeEstado() {
		return nomeEstado;
	}
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	
}

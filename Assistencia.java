package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;

import br.com.projeto.curriculum.entidade.assistencia.*;


@Entity
public class Assistencia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idAssistencia; 
	
	@ManyToOne
	@JoinColumn(name="idMarca")
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="idProblema")
	private Problema problema;
	
	@ManyToOne
	@JoinColumn(name="idPrazo")
	private Prazo prazo;
	
	@OneToMany(mappedBy="assistencia")
	private List<Servico_Pessoa> servicos;

	public Integer getIdAssistencia() {
		return idAssistencia;
	}

	public void setIdAssistencia(Integer idAssistencia) {
		this.idAssistencia = idAssistencia;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Problema getProblema() {
		return problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}

	public Prazo getPrazo() {
		return prazo;
	}

	public void setPrazo(Prazo prazo) {
		this.prazo = prazo;
	}
	
	
	

	
}

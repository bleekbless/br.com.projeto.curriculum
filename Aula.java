package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;

import br.com.projeto.curriculum.entidade.aula.*;

@Entity
public class Aula {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idAula;
	
	@ManyToOne
	@JoinColumn(name="idTipoEspAula")
	private TipoEspAula tipoAula;
	
	@ManyToOne
	@JoinColumn(name="idLocalAula")
	private LocalAula local;
	
	@ManyToOne
	@JoinColumn(name="idQtdAlunos")
	private QtdAlunos qtdAlunos;
	
	@ManyToOne
	@JoinColumn(name="idNivel")
	private NivelAlunos nivel;
	
	@ManyToOne
	@JoinColumn(name="idFrequencia")
	private Frequencia frequencia;
	
	@ManyToOne
	@JoinColumn(name="idPrazo")
	private Prazo prazo;
	
	@OneToMany(mappedBy="aula")
	private List<Servico_Pessoa> servicos;
	

	public Integer getIdAula() {
		return idAula;
	}

	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}

	public TipoEspAula getTipoAula() {
		return tipoAula;
	}

	public void setTipoAula(TipoEspAula tipoAula) {
		this.tipoAula = tipoAula;
	}

	public LocalAula getLocal() {
		return local;
	}

	public void setLocal(LocalAula local) {
		this.local = local;
	}

	public QtdAlunos getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(QtdAlunos qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public NivelAlunos getNivel() {
		return nivel;
	}

	public void setNivel(NivelAlunos nivel) {
		this.nivel = nivel;
	}

	public Frequencia getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}

	public Prazo getPrazo() {
		return prazo;
	}

	public void setPrazo(Prazo prazo) {
		this.prazo = prazo;
	}
	
	

}

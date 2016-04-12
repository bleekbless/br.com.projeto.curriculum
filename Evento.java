package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.projeto.curriculum.entidade.evento.*;


@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEvento;
	
	@NotNull(message="Campo Duração não pode ficar em branco")
	@ManyToOne
	@JoinColumn(name="idDuracao")
	private Duracao duracao;
	
	@NotNull(message="Campo Tipo de Evento não pode ficar em branco")
	@ManyToOne
	@JoinColumn(name="idTipoEvento")
	private TipoEvento tipoEvento;
	
	@ManyToOne
	@JoinColumn(name="idQtdConvidados")
	private QuantidadeConvidados qtdConvidados;
	
	@ManyToOne
	@JoinColumn(name="idTipoMusical")
	private TipoMusical tipoMusical;
	
	@ManyToOne
	@JoinColumn(name="idTipoAnimador")
	private TipoAnimador tipoAnimador;
	
	@ManyToOne
	@JoinColumn(name="idTipoLocal")
	private TipoLocal tipoLocal;
	
	@ManyToOne
	@JoinColumn(name="idTipoFotografia")
	private TipoFotografia tipoFotografia;
	
	private Byte qtdCriancas;
	
	private boolean sistemaSom;
	
	@ManyToMany
	@JoinTable(name="FormatoFoto_Evento", joinColumns=@JoinColumn(name="idEvento"),
									      inverseJoinColumns=@JoinColumn(name="idFormatoFoto"))
	@Size(min=1, max=5)
	private List<FormatoFoto> formatos;

	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public Duracao getDuracao() {
		return duracao;
	}

	public void setDuracao(Duracao duracao) {
		this.duracao = duracao;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public QuantidadeConvidados getQtdConvidados() {
		return qtdConvidados;
	}

	public void setQtdConvidados(QuantidadeConvidados qtdConvidados) {
		this.qtdConvidados = qtdConvidados;
	}

	public TipoMusical getTipoMusical() {
		return tipoMusical;
	}

	public void setTipoMusical(TipoMusical tipoMusical) {
		this.tipoMusical = tipoMusical;
	}

	public TipoAnimador getTipoAnimador() {
		return tipoAnimador;
	}

	public void setTipoAnimador(TipoAnimador tipoAnimador) {
		this.tipoAnimador = tipoAnimador;
	}

	public TipoLocal getTipoLocal() {
		return tipoLocal;
	}

	public void setTipoLocal(TipoLocal tipoLocal) {
		this.tipoLocal = tipoLocal;
	}

	public TipoFotografia getTipoFotografia() {
		return tipoFotografia;
	}

	public void setTipoFotografia(TipoFotografia tipoFotografia) {
		this.tipoFotografia = tipoFotografia;
	}

	public Byte getQtdCriancas() {
		return qtdCriancas;
	}

	public void setQtdCriancas(Byte qtdCriancas) {
		this.qtdCriancas = qtdCriancas;
	}

	public boolean isSistemaSom() {
		return sistemaSom;
	}

	public void setSistemaSom(boolean sistemaSom) {
		this.sistemaSom = sistemaSom;
	}

	public List<FormatoFoto> getFormatos() {
		return formatos;
	}

	public void setFormatos(List<FormatoFoto> formatos) {
		this.formatos = formatos;
	}
	
	
	

}

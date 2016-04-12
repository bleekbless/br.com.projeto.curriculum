package br.com.projeto.curriculum.entidade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import br.com.projeto.curriculum.entidade.domestico.*;

@Entity
public class Domestico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDomestico;
	
	@ManyToOne
	@JoinColumn(name="idPrazo")
	@NotNull(message="Campo prazo não pode ficar em branco")
	private Prazo prazo;
	
	@ManyToOne
	@JoinColumn(name="idFrequencia", nullable =  true)
	private Frequencia frequencia;
	
	@ManyToOne
	@JoinColumn(name="idPeriodo", nullable = true)
	private Periodo periodo;
	
	@ManyToOne
	@JoinColumn(name="idFreqDiarista", nullable = true)
	private FrequenciaDiarista freqDiarista;
	
	@ManyToOne
	@JoinColumn(name="idComida", nullable = true)
	private Comida comida;
	
	@ManyToOne
	@JoinColumn(name="idRazao", nullable = true)
	private RazaoServMotorista razao;
	
	@ManyToOne
	@JoinColumn(name="idTipoVeiculo", nullable = true)
	private TipoVeiculo tipoVeiculo; // para servicos de motorista
	
	@ManyToOne
	@JoinColumn(name="idLocal", nullable = true)
	private Local local;
	
	private Byte numCriancas;
	
	private Byte numBanheiros;
	
	private Byte numComodos;
	
	private Byte numPiscinas; // para servico de limpador de piscinas
	
	private Byte numPessoas; 
	
	private Short areaPiscina; // para servico de limpador de piscinas.

	public Integer getIdDomestico() {
		return idDomestico;
	}

	public void setIdDomestico(Integer idDomestico) {
		this.idDomestico = idDomestico;
	}

	public Prazo getPrazo() {
		return prazo;
	}

	public void setPrazo(Prazo prazo) {
		this.prazo = prazo;
	}

	public Frequencia getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public FrequenciaDiarista getFreqDiarista() {
		return freqDiarista;
	}

	public void setFreqDiarista(FrequenciaDiarista freqDiarista) {
		this.freqDiarista = freqDiarista;
	}

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}

	public RazaoServMotorista getRazao() {
		return razao;
	}

	public void setRazao(RazaoServMotorista razao) {
		this.razao = razao;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Byte getNumCriancas() {
		return numCriancas;
	}

	public void setNumCriancas(Byte numCriancas) {
		this.numCriancas = numCriancas;
	}

	public Byte getNumBanheiros() {
		return numBanheiros;
	}

	public void setNumBanheiros(Byte numBanheiros) {
		this.numBanheiros = numBanheiros;
	}

	public Byte getNumComodos() {
		return numComodos;
	}

	public void setNumComodos(Byte numComodos) {
		this.numComodos = numComodos;
	}

	public Byte getNumPiscinas() {
		return numPiscinas;
	}

	public void setNumPiscinas(Byte numPiscinas) {
		this.numPiscinas = numPiscinas;
	}

	public Byte getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(Byte numPessoas) {
		this.numPessoas = numPessoas;
	}

	public Short getAreaPiscina() {
		return areaPiscina;
	}

	public void setAreaPiscina(Short areaPiscina) {
		this.areaPiscina = areaPiscina;
	}

	
	
}

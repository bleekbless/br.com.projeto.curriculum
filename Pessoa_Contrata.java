package br.com.projeto.curriculum.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@IdClass(Pessoa_ContrataId.class)
public class Pessoa_Contrata implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte contadorServico;

	@Id
	@ManyToOne
	@JoinColumn(name="idPessoa")
	private Pessoa pessoa;
	
	@Id
	@ManyToOne
	@JoinColumn(name="idServico")
	private Servico_Pessoa servico;
	
	@ManyToOne
	@JoinColumn(name="idAvaliacao")
	private Avaliacao avaliacao;
	
	@ManyToOne
	@JoinColumn(name="idFormaPag")
	private FormaPag formaPag;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date dataInicial;
	
	@Temporal(TemporalType.DATE)
	private Date dataFinal;
	
	private Float valorPago;
	
	@NotNull(message="Minímo 1 parcela.")
	@Size(min=1)
	private Byte parcelas;
	
	
	public Byte getContadorServico() {
		return contadorServico;
	}
	public void setContadorServico(Byte contadorServico) {
		this.contadorServico = contadorServico;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Servico_Pessoa getServico() {
		return servico;
	}
	public void setServico(Servico_Pessoa servico) {
		this.servico = servico;
	}
	public Avaliacao getAvalicao() {
		return avaliacao;
	}
	public void setAvalicao(Avaliacao avalicao) {
		this.avaliacao = avalicao;
	}
	public FormaPag getFormaPag() {
		return formaPag;
	}
	public void setFormaPag(FormaPag formaPag) {
		this.formaPag = formaPag;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Float getValorPago() {
		return valorPago;
	}
	public void setValorPago(Float valorPago) {
		this.valorPago = valorPago;
	}
	public Byte getParcelas() {
		return parcelas;
	}
	public void setParcelas(Byte parcelas) {
		this.parcelas = parcelas;
	}
	
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	
}

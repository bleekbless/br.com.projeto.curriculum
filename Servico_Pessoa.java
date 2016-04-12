package br.com.projeto.curriculum.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Servico_Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idServico;
	
	@ManyToOne
	@JoinColumn(name="idPessoa")
	@NotNull(message="Campo Pessoa não pode ficar em branco")
	private Pessoa pessoa; // Freelancer que oeferece algum servico
	
	@ManyToOne
	@JoinColumn(name="idTipoServicoEspecifico")
	@NotNull(message="Campo Tipo de Serviço não pode ficar em branco")
	private TipoServicoEspecifico tipoServicoEspecifico;
	
	@ManyToOne
	@JoinColumn(name="idFreelancer")
	@NotNull(message="Campo tipo de serviço oferecido não pode ficar em branco")
	private Freelancer freelancer;
	
	@ManyToOne
	@JoinColumn(name="idAula", nullable=true)
	private Aula aula;
	
	@ManyToOne
	@JoinColumn(name="idAssistencia", nullable=true)
	private Assistencia assistencia;
	
	@ManyToOne
	@JoinColumn(name="idDesignTec", nullable=true)
	private DesignTec designTec;
	
	@ManyToOne
	@JoinColumn(name="idDomestico", nullable=true)
	private Domestico domestico;
	
	@ManyToOne
	@JoinColumn(name="idEvento", nullable=true)
	private Evento evento;
	
	@Temporal(TemporalType.DATE)
	@NotNull(message="É preciso informar a data que esse serviço vai começar a valer.")
	private Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	
	@OneToMany(mappedBy="servico")
	private List<Pessoa_Contrata> contratos;
	
	public Integer getIdServico() {
		return idServico;
	}
	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public TipoServicoEspecifico getTipoServicoEspecifico() {
		return tipoServicoEspecifico;
	}
	public void setTipoServicoEspecifico(TipoServicoEspecifico tipoServicoEspecifico) {
		this.tipoServicoEspecifico = tipoServicoEspecifico;
	}
	public Freelancer getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}
	public Aula getAula() {
		return aula;
	}
	public void setAula(Aula aula) {
		this.aula = aula;
	}
	public Assistencia getAssistencia() {
		return assistencia;
	}
	public void setAssistencia(Assistencia assistencia) {
		this.assistencia = assistencia;
	}
	public DesignTec getDesignTec() {
		return designTec;
	}
	public void setDesignTec(DesignTec designTec) {
		this.designTec = designTec;
	}
	public Domestico getDomestico() {
		return domestico;
	}
	public void setDomestico(Domestico domestico) {
		this.domestico = domestico;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public List<Pessoa_Contrata> getContratos() {
		return contratos;
	}
	public void setContratos(List<Pessoa_Contrata> contratos) {
		this.contratos = contratos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idServico == null) ? 0 : idServico.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico_Pessoa other = (Servico_Pessoa) obj;
		if (idServico == null) {
			if (other.idServico != null)
				return false;
		} else if (!idServico.equals(other.idServico))
			return false;
		return true;
	}
	
	
	
	
}

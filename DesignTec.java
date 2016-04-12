package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;


import br.com.projeto.curriculum.entidade.design.ConhecimentoEsp;
import br.com.projeto.curriculum.entidade.design.Plataforma;
import br.com.projeto.curriculum.entidade.design.Software;
import br.com.projeto.curriculum.entidade.design.TipoEspDesign;
import br.com.projeto.curriculum.entidade.design.TipoProjeto;

@Entity
public class DesignTec {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDesignTec;
	
	@ManyToOne
	@JoinColumn(name="idPrazo")
	private Prazo prazo;
	
	@ManyToOne
	@JoinColumn(name="idTipoEspDesign")
	private TipoEspDesign tipoEspDesign;
	
	@ManyToOne
	@JoinColumn(name="idPlataforma")
	private Plataforma plataforma;
	
	@ManyToOne
	@JoinColumn(name="idSoftware")
	private Software software ;
	
	@ManyToOne
	@JoinColumn(name="idConhecimentoEsp")
	private ConhecimentoEsp conhecimentoEsp;
	
	@ManyToOne
	@JoinColumn(name="idTipoPrjeto")
	private TipoProjeto tipoProjeto;
	
	@OneToMany(mappedBy="designTec")
	private List<Servico_Pessoa> servicos;

	public Integer getIdDesignTec() {
		return idDesignTec;
	}

	public void setIdDesignTec(Integer idDesignTec) {
		this.idDesignTec = idDesignTec;
	}

	public Prazo getPrazo() {
		return prazo;
	}

	public void setPrazo(Prazo prazo) {
		this.prazo = prazo;
	}

	public TipoEspDesign getTipoEspDesign() {
		return tipoEspDesign;
	}

	public void setTipoEspDesign(TipoEspDesign tipoEspDesign) {
		this.tipoEspDesign = tipoEspDesign;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	public ConhecimentoEsp getConhecimentoEsp() {
		return conhecimentoEsp;
	}

	public void setConhecimentoEsp(ConhecimentoEsp conhecimentoEsp) {
		this.conhecimentoEsp = conhecimentoEsp;
	}

	public TipoProjeto getTipoProjeto() {
		return tipoProjeto;
	}

	public void setTipoProjeto(TipoProjeto tipoProjeto) {
		this.tipoProjeto = tipoProjeto;
	}
	
	
	
	

}

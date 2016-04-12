package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class TipoServicoEspecifico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idTipoServicoEspecifico;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="idTipoServico")
	private TipoServico tipoServico;
	
	@OneToMany(mappedBy="tipoServicoEspecifico")
	private List<Servico_Pessoa> servicos;

	public Short getIdTipoServicoEspecifico() {
		return idTipoServicoEspecifico;
	}

	public void setIdTipoServicoEspecifico(Short idTipoServicoEspecifico) {
		this.idTipoServicoEspecifico = idTipoServicoEspecifico;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}

package br.com.projeto.curriculum.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class TipoServico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte idTipoServico;
	
	@NotNull(message="Campo Descrição não pode ficar em branco")
	private String descricao;
	
	@OneToMany(mappedBy="tipoServico")
	private List<TipoServicoEspecifico> servicosEspecificos;

	public Byte getIdTipoServico() {
		return idTipoServico;
	}

	public void setIdTipoServico(Byte idTipoServico) {
		this.idTipoServico = idTipoServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<TipoServicoEspecifico> getServicosEspecificos() {
		return servicosEspecificos;
	}

	public void setServicosEspecificos(List<TipoServicoEspecifico> servicosEspecificos) {
		this.servicosEspecificos = servicosEspecificos;
	}
	
	
}

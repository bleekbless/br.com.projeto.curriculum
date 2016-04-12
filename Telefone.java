package br.com.projeto.curriculum.entidade;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;

@Entity
public class Telefone {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte contadorTelefone;
	
	@Id
	@ManyToOne
	@JoinColumn(name="idPessoa")
	private Pessoa pessoa;
	
	@NotNull(message="Campo Numero de Telefone não pode ficar em branco")
	@Size(max=14, min=8)
	private Long numeroTel;
	
	@ManyToOne
	@JoinColumn(name="idTipoTelefone")
	private TipoTelefone tipoTelefone;
	
	
	public Byte getContadorTelefone() {
		return contadorTelefone;
	}
	public void setContadorTelefone(Byte contadorTelefone) {
		this.contadorTelefone = contadorTelefone;
	}
	public Long getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(Long numeroTel) {
		this.numeroTel = numeroTel;
	}
	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}

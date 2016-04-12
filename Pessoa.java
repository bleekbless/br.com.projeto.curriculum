package br.com.projeto.curriculum.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.*;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPessoa;
	
	@ManyToOne
	@JoinColumn(name="idCidade")
	private Cidade cidade;
	
	@ManyToOne
	@JoinColumn(name="idSexo")
	private Sexo sexo;
	
	@ManyToOne
	@JoinColumn(name="idEstadoCivil")
	private EstadoCivil estadosCivis;
	
	@NotNull
	private String nomePessoa;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@CPF
	@NotNull(message="Campo CPF não pode ficar em branco")
	@Size(max=12, min=12)
	private Long CPF;
	
	@NotNull(message="Campo RG não pode ficar em branco")
	private String RG;
	
	@NotNull(message="Campo ORG não pode ficar em branco")
	private String orgaoEmissor;
	
	@NotNull(message="Campo Lagradouro não pode ficar em branco")
	private String logradouro;
	
	@NotNull(message="Campo Numero não pode ficar em branco")
	private Short numeroCasa;
	
	@NotNull(message="Campo CEP não pode ficar em branco")
	private Long CEP;
	
	@NotNull(message="Campo Bairro não pode ficar em branco")
	private String bairro;
	
	private String complemento;
	
	@Email
	@NotNull(message="Campo EMAIL não pode ficar em branco")
	private String email;
	
	@OneToMany(mappedBy="pessoa")
	private List<Pessoa_Contrata> contratos;
	
	
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public Cidade getIdCidade() {
		return cidade;
	}
	public void setIdCidade(Cidade idCidade) {
		this.cidade = idCidade;
	}
	public Sexo getIdSexo() {
		return sexo;
	}
	public void setIdSexo(Sexo idSexo) {
		this.sexo = idSexo;
	}
	public EstadoCivil getIdEstadoCivil() {
		return estadosCivis;
	}
	public void setIdEstadoCivil(EstadoCivil idEstadoCivil) {
		this.estadosCivis = idEstadoCivil;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Long getCPF() {
		return CPF;
	}
	public void setCPF(Long cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Short getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(Short numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public Long getCEP() {
		return CEP;
	}
	public void setCEP(Long cEP) {
		CEP = cEP;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	

}

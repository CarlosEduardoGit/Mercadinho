package com.api.mercadinhovirtual.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FUNCIONARIOS")
public class Funcionario implements Serializable{
	
	private static final Long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private int matriculaFuncionario;
	private String nomeDoFuncionario;
	private String password;
	private String role;
	private int idadeFuncionario;
	private Date dataNascimentoFuncionario;
	private String estadoCivil;
	private String identidadeFuncionario;
	private Date dataDeExpedicaoFuncionario;
	private String orgaoExpedidorFuncionario;
	private String cpfFuncionario;
	private String ctpsFuncionarioNumero; // ctps - carteira de trabalho
	private String ctpsFuncionarioSerie; // ctps - carteira de trabalho
	private String numeroDeInscricaoFuncionario;// Título de Eleitor
	private String zonaFuncionario;//título de Eleitor
	private String naturalidadeFuncionario;
	private String nacionalidadeFuncionario;
	private String nomeDoPaiFuncionario;
	private String nomeDaMaeFuncionario;
	private String telefoneDoFuncionario;
	private String tamanhoCamisaFuncionario;
	private int tamanhoCalcaFuncionario;
	private int tamanhoSapatoFuncionario;
	private String enderecoFuncionario;
	private int numeroResidencialFuncionario;
	private String complementoFuncionario;
	private String cepFuncionario;
	private String estadoFuncionario;
	private String cidadeFuncionario;
	private String bairroFuncionario;
	
	// Construtor Vazio
	public Funcionario() {}

	
	// Construtor Completo
	public Funcionario(Long codigo, int matriculaFuncionario, String nomeDoFuncionario, String password, String role,
			int idadeFuncionario, Date dataNascimentoFuncionario, String estadoCivil, String identidadeFuncionario,
			Date dataDeExpedicaoFuncionario, String orgaoExpedidorFuncionario, String cpfFuncionario,
			String ctpsFuncionarioNumero,String ctpsFuncionarioSerie , String numeroDeInscricaoFuncionario, String zonaFuncionario,
		    String naturalidadeFuncionario,
			String nacionalidadeFuncionario, String nomeDoPaiFuncionario, String nomeDaMaeFuncionario,
			String telefoneDoFuncionario, String tamanhoCamisaFuncionario, int tamanhoCalcaFuncionario,
			int tamanhoSapatoFuncionario, String enderecoFuncionario, int numeroResidencialFuncionario,
			String complementoFuncionario, String cepFuncionario, String estadoFuncionario, String cidadeFuncionario,
			String bairroFuncionario) {
		
		this.codigo = codigo;
		this.matriculaFuncionario = matriculaFuncionario;
		this.nomeDoFuncionario = nomeDoFuncionario;
		this.password = password;
		this.role = role;
		this.idadeFuncionario = idadeFuncionario;
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
		this.estadoCivil = estadoCivil;
		this.identidadeFuncionario = identidadeFuncionario;
		this.dataDeExpedicaoFuncionario = dataDeExpedicaoFuncionario;
		this.orgaoExpedidorFuncionario = orgaoExpedidorFuncionario;
		this.cpfFuncionario = cpfFuncionario;
		this.ctpsFuncionarioNumero = ctpsFuncionarioNumero;
		this.ctpsFuncionarioSerie = ctpsFuncionarioSerie;
		this.numeroDeInscricaoFuncionario = numeroDeInscricaoFuncionario;
		this.zonaFuncionario = zonaFuncionario;
		this.naturalidadeFuncionario = naturalidadeFuncionario;
		this.nacionalidadeFuncionario = nacionalidadeFuncionario;
		this.nomeDoPaiFuncionario = nomeDoPaiFuncionario;
		this.nomeDaMaeFuncionario = nomeDaMaeFuncionario;
		this.telefoneDoFuncionario = telefoneDoFuncionario;
		this.tamanhoCamisaFuncionario = tamanhoCamisaFuncionario;
		this.tamanhoCalcaFuncionario = tamanhoCalcaFuncionario;
		this.tamanhoSapatoFuncionario = tamanhoSapatoFuncionario;
		this.enderecoFuncionario = enderecoFuncionario;
		this.numeroResidencialFuncionario = numeroResidencialFuncionario;
		this.complementoFuncionario = complementoFuncionario;
		this.cepFuncionario = cepFuncionario;
		this.estadoFuncionario = estadoFuncionario;
		this.cidadeFuncionario = cidadeFuncionario;
		this.bairroFuncionario = bairroFuncionario;
	}

	
	// Gets e Sets
	public Long getCodigoFuncionario() {
		return codigo;
	}


	public void setCodigoFuncionario(Long codigo) {
		this.codigo = codigo;
	}


	public int getMatriculaFuncionario() {
		return matriculaFuncionario;
	}


	public void setMatriculaFuncionario(int matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}


	public String getNomeDoFuncionario() {
		return nomeDoFuncionario;
	}


	public void setNomeDoFuncionario(String nomeDoFuncionario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
	}
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}


	public void setroleRole(String role) {
		this.role = role;
	}
	
	
	public int getIdadeFuncionario() {
		return idadeFuncionario;
	}


	public void setIdadeFuncionario(int idadeFuncionario) {
		this.idadeFuncionario = idadeFuncionario;
	}


	public Date getDataNascimentoFuncionario() {
		return dataNascimentoFuncionario;
	}


	public void setDataNascimentoFuncionario(Date dataNascimentoFuncionario) {
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getIdentidadeFuncionario() {
		return identidadeFuncionario;
	}


	public void setIdentidadeFuncionario(String identidadeFuncionario) {
		this.identidadeFuncionario = identidadeFuncionario;
	}


	public Date getDataDeExpedicaoFuncionario() {
		return dataDeExpedicaoFuncionario;
	}


	public void setDataDeExpedicaoFuncionario(Date dataDeExpedicaoFuncionario) {
		this.dataDeExpedicaoFuncionario = dataDeExpedicaoFuncionario;
	}


	public String getOrgaoExpedidorFuncionario() {
		return orgaoExpedidorFuncionario;
	}


	public void setOrgaoExpedidorFuncionario(String orgaoExpedidorFuncionario) {
		this.orgaoExpedidorFuncionario = orgaoExpedidorFuncionario;
	}


	public String getCpfFuncionario() {
		return cpfFuncionario;
	}


	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}


	public String getCtpsFuncionarioNumero() {
		return ctpsFuncionarioNumero;
	}


	public void setCtpsFuncionarioNumero(String ctpsFuncionarioNumero) {
		this.ctpsFuncionarioNumero = ctpsFuncionarioNumero;
	}

	public String getCtpsFuncionarioSerie() {
		return ctpsFuncionarioSerie;
	}


	public void setCtpsFuncionarioSerie(String ctpsFuncionarioSerie) {
		this.ctpsFuncionarioSerie = ctpsFuncionarioSerie;
	}

	public String getNumeroDeInscricaoFuncionario() {
		return numeroDeInscricaoFuncionario;
	}


	public void setNumeroDeInscricaoFuncionario(String numeroDeInscricaoFuncionario) {
		this.numeroDeInscricaoFuncionario = numeroDeInscricaoFuncionario;
	}


	public String getZonaFuncionario() {
		return zonaFuncionario;
	}


	public void setZonaFuncionario(String zonaFuncionario) {
		this.zonaFuncionario = zonaFuncionario;
	}

	public String getNaturalidadeFuncionario() {
		return naturalidadeFuncionario;
	}


	public void setNaturalidadeFuncionario(String naturalidadeFuncionario) {
		this.naturalidadeFuncionario = naturalidadeFuncionario;
	}


	public String getNacionalidadeFuncionario() {
		return nacionalidadeFuncionario;
	}


	public void setNacionalidadeFuncionario(String nacionalidadeFuncionario) {
		this.nacionalidadeFuncionario = nacionalidadeFuncionario;
	}


	public String getNomeDoPaiFuncionario() {
		return nomeDoPaiFuncionario;
	}


	public void setNomeDoPaiFuncionario(String nomeDoPaiFuncionario) {
		this.nomeDoPaiFuncionario = nomeDoPaiFuncionario;
	}


	public String getNomeDaMaeFuncionario() {
		return nomeDaMaeFuncionario;
	}


	public void setNomeDaMaeFuncionario(String nomeDaMaeFuncionario) {
		this.nomeDaMaeFuncionario = nomeDaMaeFuncionario;
	}


	public String getTelefoneDoFuncionario() {
		return telefoneDoFuncionario;
	}


	public void setTelefoneDoFuncionario(String telefoneDoFuncionario) {
		this.telefoneDoFuncionario = telefoneDoFuncionario;
	}


	public String getTamanhoCamisaFuncionario() {
		return tamanhoCamisaFuncionario;
	}


	public void setTamanhoCamisaFuncionario(String tamanhoCamisaFuncionario) {
		this.tamanhoCamisaFuncionario = tamanhoCamisaFuncionario;
	}


	public int getTamanhoCalcaFuncionario() {
		return tamanhoCalcaFuncionario;
	}


	public void setTamanhoCalcaFuncionario(int tamanhoCalcaFuncionario) {
		this.tamanhoCalcaFuncionario = tamanhoCalcaFuncionario;
	}


	public int getTamanhoSapatoFuncionario() {
		return tamanhoSapatoFuncionario;
	}


	public void setTamanhoSapatoFuncionario(int tamanhoSapatoFuncionario) {
		this.tamanhoSapatoFuncionario = tamanhoSapatoFuncionario;
	}


	public String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}


	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}


	public int getNumeroResidencialFuncionario() {
		return numeroResidencialFuncionario;
	}


	public void setNumeroResidencialFuncionario(int numeroResidencialFuncionario) {
		this.numeroResidencialFuncionario = numeroResidencialFuncionario;
	}


	public String getComplementoFuncionario() {
		return complementoFuncionario;
	}


	public void setComplementoFuncionario(String complementoFuncionario) {
		this.complementoFuncionario = complementoFuncionario;
	}


	public String getCepFuncionario() {
		return cepFuncionario;
	}


	public void setCepFuncionario(String cepFuncionario) {
		this.cepFuncionario = cepFuncionario;
	}


	public String getEstadoFuncionario() {
		return estadoFuncionario;
	}


	public void setEstadoFuncionario(String estadoFuncionario) {
		this.estadoFuncionario = estadoFuncionario;
	}


	public String getCidadeFuncionario() {
		return cidadeFuncionario;
	}


	public void setCidadeFuncionario(String cidadeFuncionario) {
		this.cidadeFuncionario = cidadeFuncionario;
	}


	public String getBairroFuncionario() {
		return bairroFuncionario;
	}


	public void setBairroFuncionario(String bairroFuncionario) {
		this.bairroFuncionario = bairroFuncionario;
	}
}

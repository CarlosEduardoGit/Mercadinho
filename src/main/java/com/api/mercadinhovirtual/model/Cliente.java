package com.api.mercadinhovirtual.model;

import java.util.Date;

public class Cliente {
	private Short codigoCliente;
	private String nomeDoCliente;
	private Date dataNascimentoCliente;
	private String cpfCliente;
	private String telefoneDoCliente;
	private String enderecoCliente;
	private int numeroResidencialCliente;
	private String complementoCliente;
	private String cepCliente;
	private String estadoCliente;
	private String cidadeCliente;
	private String bairroCliente;
	
	// Construtor Vazio
	public Cliente() {}
	
	
	// Construtor Completo
	public Cliente(Short codigoCliente, String nomeDoCliente, Date dataNascimentoCliente, String cpfCliente,
			String telefoneDoCliente, String enderecoCliente, int numeroResidencialCliente, String complementoCliente,
			String cepCliente, String estadoCliente, String cidadeCliente, String bairroCliente) {
		super();
		this.codigoCliente = codigoCliente;
		this.nomeDoCliente = nomeDoCliente;
		this.dataNascimentoCliente = dataNascimentoCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneDoCliente = telefoneDoCliente;
		this.enderecoCliente = enderecoCliente;
		this.numeroResidencialCliente = numeroResidencialCliente;
		this.complementoCliente = complementoCliente;
		this.cepCliente = cepCliente;
		this.estadoCliente = estadoCliente;
		this.cidadeCliente = cidadeCliente;
		this.bairroCliente = bairroCliente;
	}


	// Gets e Sets
	public Short getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(Short codigoCliente) {
		this.codigoCliente = codigoCliente;
	}


	public String getNomeDoCliente() {
		return nomeDoCliente;
	}


	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}


	public Date getDataNascimentoCliente() {
		return dataNascimentoCliente;
	}


	public void setDataNascimentoCliente(Date dataNascimentoCliente) {
		this.dataNascimentoCliente = dataNascimentoCliente;
	}


	public String getCpfCliente() {
		return cpfCliente;
	}


	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}


	public String getTelefoneDoCliente() {
		return telefoneDoCliente;
	}


	public void setTelefoneDoCliente(String telefoneDoCliente) {
		this.telefoneDoCliente = telefoneDoCliente;
	}


	public String getEnderecoCliente() {
		return enderecoCliente;
	}


	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}


	public int getNumeroResidencialCliente() {
		return numeroResidencialCliente;
	}


	public void setNumeroResidencialCliente(int numeroResidencialCliente) {
		this.numeroResidencialCliente = numeroResidencialCliente;
	}


	public String getComplementoCliente() {
		return complementoCliente;
	}


	public void setComplementoCliente(String complementoCliente) {
		this.complementoCliente = complementoCliente;
	}


	public String getCepCliente() {
		return cepCliente;
	}


	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}


	public String getEstadoCliente() {
		return estadoCliente;
	}


	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}


	public String getCidadeCliente() {
		return cidadeCliente;
	}


	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}


	public String getBairroCliente() {
		return bairroCliente;
	}


	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}

}


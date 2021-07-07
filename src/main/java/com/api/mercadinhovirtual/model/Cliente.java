package com.api.mercadinhovirtual.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Cliente implements Serializable{
	
    private static final Long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String nomeDoCliente;
	private String password;
	private String role;
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
	public Cliente(Long codigo, String nomeDoCliente, String password, String role, Date dataNascimentoCliente, String cpfCliente,
			String telefoneDoCliente, String enderecoCliente, int numeroResidencialCliente, String complementoCliente,
			String cepCliente, String estadoCliente, String cidadeCliente, String bairroCliente) {
		
		this.codigo = codigo;
		this.nomeDoCliente = nomeDoCliente;
		this.password = password;
		this.role = role;
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
	public Long getCodigoCliente() {
		return codigo;
	}


	public void setCodigoCliente(Long codigoCliente) {
		this.codigo = codigoCliente;
	}


	public String getNomeDoCliente() {
		return nomeDoCliente;
	}


	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
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

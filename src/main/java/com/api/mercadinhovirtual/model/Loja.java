package com.api.mercadinhovirtual.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="LOJAS")
public class Loja implements Serializable{
	
	private static final Long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	@NonNull
	private String razaoSocialLoja;
	@NonNull
	private String nomeFantasiaLoja;
	@NonNull
	private Date dataInicioDasAtividadesLoja;
	@NonNull
	private String cnpjLoja;
	private String inscricaoMunicipalLoja;
	private String inscricaoEstadualLoja;
	private String atividadePrincipalcnaeLoja;
	@NonNull
	private String enderecoLoja;
	@NonNull
	private int numeroLoja;
	private String bairroLoja;
	private String cidadeLoja;
	private String estadoLoja;
	private String telefoneComercial;
	private String celularLoja;
	private String whatsAppComercialLoja;
	private String emailLoja;
	private String siteLoja;
	private String facebookLoja;
	private String instagramLoja;
	private String linkedinLoja;
	private String youtubeLoja;
	private String lojaAtiva; // tipo boolean não existe no SQLSERVER
	
	
	// Construtor Vazio
	public Loja() {}

	
	// Construtor Completo	
	public Loja(Long codigo, String razaoSocialLoja, String nomeFantasiaLoja, Date dataInicioDasAtividadesLoja,
			String cnpjLoja, String inscricaoMunicipalLoja, String inscricaoEstadualLoja,
			String atividadePrincipalcnaeLoja, String enderecoLoja, int numeroLoja, String bairroLoja,
			String cidadeLoja, String estadoLoja, String telefoneComercial, String celularLoja,
			String whatsAppComercialLoja, String emailLoja, String siteLoja, String facebookLoja, String instagramLoja,
			String linkedinLoja, String youtubeLoja, String lojaAtiva) {
	
		this.codigo = codigo;
		this.razaoSocialLoja = razaoSocialLoja;
		this.nomeFantasiaLoja = nomeFantasiaLoja;
		this.dataInicioDasAtividadesLoja = dataInicioDasAtividadesLoja;
		this.cnpjLoja = cnpjLoja;
		this.inscricaoMunicipalLoja = inscricaoMunicipalLoja;
		this.inscricaoEstadualLoja = inscricaoEstadualLoja;
		this.atividadePrincipalcnaeLoja = atividadePrincipalcnaeLoja;
		this.enderecoLoja = enderecoLoja;
		this.numeroLoja = numeroLoja;
		this.bairroLoja = bairroLoja;
		this.cidadeLoja = cidadeLoja;
		this.estadoLoja = estadoLoja;
		this.telefoneComercial = telefoneComercial;
		this.celularLoja = celularLoja;
		this.whatsAppComercialLoja = whatsAppComercialLoja;
		this.emailLoja = emailLoja;
		this.siteLoja = siteLoja;
		this.facebookLoja = facebookLoja;
		this.instagramLoja = instagramLoja;
		this.linkedinLoja = linkedinLoja;
		this.youtubeLoja = youtubeLoja;
		this.lojaAtiva = lojaAtiva;
	}

	
	// Métodos Gets e Sets
	public Long getCodigo() {
	   return codigo;
	}


	public void setCodigo(Long codigo) {
	   this.codigo = codigo;
	}


	public String getRazaoSocialLoja() {
		return razaoSocialLoja;
	}


	public void setRazaoSocialLoja(String razaoSocialLoja) {
		this.razaoSocialLoja = razaoSocialLoja;
	}


	public String getNomeFantasiaLoja() {
		return nomeFantasiaLoja;
	}


	public void setNomeFantasiaLoja(String nomeFantasiaLoja) {
		this.nomeFantasiaLoja = nomeFantasiaLoja;
	}


	public Date getDataInicioDasAtividadesLoja() {
		return dataInicioDasAtividadesLoja;
	}


	public void setDataInicioDasAtividadesLoja(Date dataInicioDasAtividadesLoja) {
		this.dataInicioDasAtividadesLoja = dataInicioDasAtividadesLoja;
	}


	public String getCnpjLoja() {
		return cnpjLoja;
	}


	public void setCnpjLoja(String cnpjLoja) {
		this.cnpjLoja = cnpjLoja;
	}


	public String getInscricaoMunicipalLoja() {
		return inscricaoMunicipalLoja;
	}


	public void setInscricaoMunicipalLoja(String inscricaoMunicipalLoja) {
		this.inscricaoMunicipalLoja = inscricaoMunicipalLoja;
	}


	public String getInscricaoEstadualLoja() {
		return inscricaoEstadualLoja;
	}


	public void setInscricaoEstadualLoja(String inscricaoEstadualLoja) {
		this.inscricaoEstadualLoja = inscricaoEstadualLoja;
	}


	public String getAtividadePrincipalcnaeLoja() {
		return atividadePrincipalcnaeLoja;
	}


	public void setAtividadePrincipalcnaeLoja(String atividadePrincipalcnaeLoja) {
		this.atividadePrincipalcnaeLoja = atividadePrincipalcnaeLoja;
	}


	public String getEnderecoLoja() {
		return enderecoLoja;
	}


	public void setEnderecoLoja(String enderecoLoja) {
		this.enderecoLoja = enderecoLoja;
	}


	public int getNumeroLoja() {
		return numeroLoja;
	}


	public void setNumeroLoja(int numeroLoja) {
		this.numeroLoja = numeroLoja;
	}


	public String getBairroLoja() {
		return bairroLoja;
	}


	public void setBairroLoja(String bairroLoja) {
		this.bairroLoja = bairroLoja;
	}


	public String getCidadeLoja() {
		return cidadeLoja;
	}


	public void setCidadeLoja(String cidadeLoja) {
		this.cidadeLoja = cidadeLoja;
	}


	public String getEstadoLoja() {
		return estadoLoja;
	}


	public void setEstadoLoja(String estadoLoja) {
		this.estadoLoja = estadoLoja;
	}


	public String getTelefoneComercial() {
		return telefoneComercial;
	}


	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}


	public String getCelularLoja() {
		return celularLoja;
	}


	public void setCelularLoja(String celularLoja) {
		this.celularLoja = celularLoja;
	}


	public String getWhatsAppComercialLoja() {
		return whatsAppComercialLoja;
	}


	public void setWhatsAppComercialLoja(String whatsAppComercialLoja) {
		this.whatsAppComercialLoja = whatsAppComercialLoja;
	}


	public String getEmailLoja() {
		return emailLoja;
	}


	public void setEmailLoja(String emailLoja) {
		this.emailLoja = emailLoja;
	}


	public String getSiteLoja() {
		return siteLoja;
	}


	public void setSiteLoja(String siteLoja) {
		this.siteLoja = siteLoja;
	}


	public String getFacebookLoja() {
		return facebookLoja;
	}


	public void setFacebookLoja(String facebookLoja) {
		this.facebookLoja = facebookLoja;
	}


	public String getInstagramLoja() {
		return instagramLoja;
	}


	public void setInstagramLoja(String instagramLoja) {
		this.instagramLoja = instagramLoja;
	}


	public String getLinkedinLoja() {
		return linkedinLoja;
	}


	public void setLinkedinLoja(String linkedinLoja) {
		this.linkedinLoja = linkedinLoja;
	}


	public String getYoutubeLoja() {
		return youtubeLoja;
	}


	public void setYoutubeLoja(String youtubeLoja) {
		this.youtubeLoja = youtubeLoja;
	}


	public String isLojaAtiva() {
		return lojaAtiva;
	}


	public void setLojaAtiva(String lojaAtiva) {
		this.lojaAtiva = lojaAtiva;
	}
}

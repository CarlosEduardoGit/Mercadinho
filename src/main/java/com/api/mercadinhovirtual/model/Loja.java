package com.api.mercadinhovirtual.model;

import java.util.Date;

public class Loja {

	private Short codigoLoja;
	private String razaoSocialLoja;
	private String nomeFantasiaLoja;
	private Date dataInicioDaAtividadesLoja;
	private String cnpjLoja;
	private String inscricaoMunicipalLoja;
	private String inscricaoEstadualLoja;
	private String atividadePrincipalcnaeLoja;
	private String enderecoLoja;
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
	private boolean lojaAtiva;
	
	
	// Construtor Vazio
	public Loja() {}

	
	// Construtor Completo	
	public Loja(Short codigoLoja, String razaoSocialLoja, String nomeFantasiaLoja, Date dataInicioDaAtividadesLoja,
			String cnpjLoja, String inscricaoMunicipalLoja, String inscricaoEstadualLoja,
			String atividadePrincipalcnaeLoja, String enderecoLoja, int numeroLoja, String bairroLoja,
			String cidadeLoja, String estadoLoja, String telefoneComercial, String celularLoja,
			String whatsAppComercialLoja, String emailLoja, String siteLoja, String facebookLoja, String instagramLoja,
			String linkedinLoja, String youtubeLoja, boolean lojaAtiva) {
	
		this.codigoLoja = codigoLoja;
		this.razaoSocialLoja = razaoSocialLoja;
		this.nomeFantasiaLoja = nomeFantasiaLoja;
		this.dataInicioDaAtividadesLoja = dataInicioDaAtividadesLoja;
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
	public Short getCodigoLoja() {
		return codigoLoja;
	}


	public void setCodigoLoja(Short codigoLoja) {
		this.codigoLoja = codigoLoja;
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


	public Date getDataInicioDaAtividadesLoja() {
		return dataInicioDaAtividadesLoja;
	}


	public void setDataInicioDaAtividadesLoja(Date dataInicioDaAtividadesLoja) {
		this.dataInicioDaAtividadesLoja = dataInicioDaAtividadesLoja;
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


	public boolean isLojaAtiva() {
		return lojaAtiva;
	}


	public void setLojaAtiva(boolean lojaAtiva) {
		this.lojaAtiva = lojaAtiva;
	}
	
	

}

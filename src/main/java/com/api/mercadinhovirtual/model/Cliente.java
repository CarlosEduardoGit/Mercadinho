package com.api.mercadinhovirtual.model;

import java.io.Serializable;

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
	
	
	// Construtor Vazio
		public Cliente() {}
		
		
	// Gets e Sets
	public Long getCodigoCliente() {
		return codigo;
	}


	public void setCodigoCliente(Long codigo) {
		this.codigo = codigo;
	}


	public String getNomeDoCliente() {
		return nomeDoCliente;
	}


	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
}

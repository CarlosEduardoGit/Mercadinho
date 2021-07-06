package com.api.mercadinhovirtual.model;

import java.io.Serializable;

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
	
	
	// Construtor Vazio
	public Funcionario() {}
	
	
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
}

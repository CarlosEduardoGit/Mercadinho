package com.api.mercadinhovirtual.repository;

import org.springframework.data.repository.CrudRepository;

import com.api.mercadinhovirtual.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Short> {
	
	public Funcionario findByCodigo(Short codigoFuncionario);
	
}

/*
 public interface CursoRepository extends JpaRepository <Funcionario, Short>{}
 */
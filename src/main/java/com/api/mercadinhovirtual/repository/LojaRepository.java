package com.api.mercadinhovirtual.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.mercadinhovirtual.model.Funcionario;
import com.api.mercadinhovirtual.model.Loja;

public interface LojaRepository extends CrudRepository<Loja, Short>{

	public Loja findByCodigo(Short codigoLoja);

}

/*
public interface CursoRepository extends JpaRepository <Loja, Short>{}
*/
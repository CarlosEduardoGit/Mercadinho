package com.api.mercadinhovirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.mercadinhovirtual.model.Funcionario;
import com.api.mercadinhovirtual.model.Loja;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	public Funcionario findByCodigo(Long codigo);
	
}

package com.api.mercadinhovirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.mercadinhovirtual.model.Cliente;
import com.api.mercadinhovirtual.model.Funcionario;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	public Cliente findByCodigo(Long codigo);
	
}

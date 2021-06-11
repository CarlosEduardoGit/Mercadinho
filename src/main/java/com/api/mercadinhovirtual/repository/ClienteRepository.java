package com.api.mercadinhovirtual.repository;

import org.springframework.data.repository.CrudRepository;

import com.api.mercadinhovirtual.model.Cliente;
import com.api.mercadinhovirtual.model.Funcionario;

public interface ClienteRepository extends CrudRepository<Cliente, Short>{

	public Cliente findByCodigo(Short codigoCliente);
	
}

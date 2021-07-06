package com.api.mercadinhovirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import com.api.mercadinhovirtual.model.Loja;


public interface LojaRepository extends JpaRepository<Loja, Long>{

	public Loja findByCodigo(Long codigo);

}
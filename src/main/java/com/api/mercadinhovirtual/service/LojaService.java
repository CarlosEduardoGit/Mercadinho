package com.api.mercadinhovirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.repository.LojaRepository;

@Service
public class LojaService {
	
	@Autowired
	private LojaRepository lojaRepository;
	
	
	
	public List<Loja> listar() {
		return lojaRepository.findAll();
	}
	
	public Loja buscarPorCodigo(Long codigo) {
		return lojaRepository.findById(codigo).get();
	}

	public Loja salvar(Loja loja) {
		return lojaRepository.save(loja);
		
	}
}

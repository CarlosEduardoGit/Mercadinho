package com.api.mercadinhovirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mercadinhovirtual.mensagens.RecursoNaoEncontradoException;
import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.repository.LojaRepository;

@Service
public class LojaService {
	
	@Autowired
	private LojaRepository lojaRepository;
	
	
	public Iterable<Loja> listar() {
		Iterable<Loja> resultado = lojaRepository.findAll();
		return resultado;
		
	}
	
	public Loja buscarPorCodigo(Short id) {
		Optional<Loja> buscar = lojaRepository.findById(id);
		
		if(buscar.isEmpty()) {
			throw new RecursoNaoEncontradoException();
		}
		
		Loja loja = buscar.get();
		return loja;
	}
	
	public Loja inserir(Loja loja) {
		Loja lojaSalva = lojaRepository.save(loja);
		return lojaSalva;
		
	}
	
	public Loja editar(Loja loja) {
		Loja lojaEditado = lojaRepository.save(loja);
		return lojaEditado;
	}
	
	public Loja excluir(Short id) {
		Optional<Loja> excluir = lojaRepository.findById(id);
		
		lojaRepository.delete(excluir.get());
		return excluir.get();
	}
}

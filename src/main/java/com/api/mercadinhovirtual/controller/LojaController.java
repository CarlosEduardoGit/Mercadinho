package com.api.mercadinhovirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.api.mercadinhovirtual.mensagens.RecursoNaoEncontradoException;
import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.service.LojaService;

@RestController
@RequestMapping("/api/v1/lojas")
public class LojaController {
	 
	
	@Autowired
	private LojaService lojaService;
	
	
	@GetMapping
	public Iterable<Loja> listarLoja(){ // o que é Iterable
		Iterable<Loja> listarTodasLojas = lojaService.listar();
		return listarTodasLojas;
	}
	
	
	@GetMapping("/{id}")
	public Loja buscarLojaPorCodigo(@PathVariable Short id) {
		try {
			Loja lojaPorCodigo = lojaService.buscarPorCodigo(id);
			return lojaPorCodigo;
			
		}catch(RecursoNaoEncontradoException excecao) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Loja não encontrada", excecao);
		}
	}
	
	
	@PostMapping
	//@ResponseStatus(HttpStatus.CREATED)
	public Loja inserirLoja(@RequestBody Loja loja) {
		Loja inserirLoja = lojaService.inserir(loja);
		return inserirLoja;
	}
	
	
	@PutMapping
	//@ResponseStatus(HttpStatus.CREATED)
	public Loja editarLoja(@RequestBody Loja loja) {
		Loja editarLoja = lojaService.editar(loja);
		return editarLoja;
		
	}
	
	
	@DeleteMapping("/{id}")
	//@ResponseStatus(HttpStatus.ACCEPTED)
	public Loja excluirLoja(@PathVariable Short id) {
		try {
			Loja excluirLoja = lojaService.excluir(id);
			return excluirLoja;
		} catch(RecursoNaoEncontradoException excecao) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Loja não pode ser excluida ou não existe", excecao);
		}
	}	

}

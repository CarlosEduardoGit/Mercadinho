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
import com.api.mercadinhovirtual.model.Funcionario;
import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.service.FuncionarioService;
import com.api.mercadinhovirtual.service.LojaService;

@RestController
@RequestMapping("/api/v1/funcionario")
public class FuncionarioController {
		 
		
		@Autowired
		private FuncionarioService funcionarioService;
		
		
		@GetMapping
		public Iterable<Funcionario> listarFuncionario(){ // o que é Iterable
			Iterable<Funcionario> listarTodosFuncionarios = funcionarioService.listar();
			return listarTodosFuncionarios;
		}
		
		
		@GetMapping("/{id}")
		public Funcionario buscarFuncionarioPorCodigo(@PathVariable Short id) {
			try {
				Funcionario funcionarioPorCodigo = funcionarioService.buscarPorCodigo(id);
				return funcionarioPorCodigo;
				
			}catch(RecursoNaoEncontradoException excecao) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Funcionario(a) não encontrado(a)", excecao);
			}
		}
		
		
		@PostMapping
		//@ResponseStatus(HttpStatus.CREATED)
		public Funcionario inserirFuncionario(@RequestBody Funcionario funcionario) {
			Funcionario inserirFuncionario = funcionarioService.inserir(funcionario);
			return inserirFuncionario;
		}
		
		
		@PutMapping
		//@ResponseStatus(HttpStatus.CREATED)
		public Funcionario editarFuncionario(@RequestBody Funcionario funcionario) {
			Funcionario editarFuncionario = funcionarioService.editar(funcionario);
			return editarFuncionario;
			
		}
		
		
		@DeleteMapping("/{id}")
		//@ResponseStatus(HttpStatus.ACCEPTED)
		public Funcionario excluirFuncionario(@PathVariable Short id) {
			try {
				Funcionario excluirFuncionario = funcionarioService.excluir(id);
				return excluirFuncionario;
			} catch(RecursoNaoEncontradoException excecao) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Funcionario(a) não pode ser excluido(a) ou não existe", excecao);
			}
		}	

	
}

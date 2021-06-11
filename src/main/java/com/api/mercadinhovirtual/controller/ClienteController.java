package com.api.mercadinhovirtual.controller;

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
import com.api.mercadinhovirtual.model.Cliente;
import com.api.mercadinhovirtual.model.Funcionario;
import com.api.mercadinhovirtual.service.ClienteService;
import com.api.mercadinhovirtual.service.FuncionarioService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping
	public Iterable<Cliente> listarCliente(){ 
		Iterable<Cliente> listarTodosClientes = clienteService.listar();
		return listarTodosClientes;
	}
	
	
	@GetMapping("/{id}")
	public Cliente buscarClientePorCodigo(@PathVariable Short id) {
		try {
			Cliente clientePorCodigo = clienteService.buscarPorCodigo(id);
			return clientePorCodigo;
			
		}catch(RecursoNaoEncontradoException excecao) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Funcionario(a) não encontrado(a)", excecao);
		}
	}
	
	
	@PostMapping
	//@ResponseStatus(HttpStatus.CREATED)
	public Cliente inserirCliente(@RequestBody Cliente cliente) {
		Cliente inserirCliente = clienteService.inserir(cliente);
		return inserirCliente;
	}
	
	
	@PutMapping
	//@ResponseStatus(HttpStatus.CREATED)
	public Cliente editarCliente(@RequestBody Cliente cliente) {
		Cliente editarCliente = clienteService.editar(cliente);
		return editarCliente;
		
	}
	
	
	@DeleteMapping("/{id}")
	//@ResponseStatus(HttpStatus.ACCEPTED)
	public Cliente excluirCliente(@PathVariable Short id) {
		try {
			Cliente excluirCliente = clienteService.excluir(id);
			return excluirCliente;
		} catch(RecursoNaoEncontradoException excecao) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Funcionario(a) não pode ser excluido(a) ou não existe", excecao);
		}
	}	

}

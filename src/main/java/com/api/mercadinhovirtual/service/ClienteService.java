package com.api.mercadinhovirtual.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mercadinhovirtual.mensagens.RecursoNaoEncontradoException;
import com.api.mercadinhovirtual.model.Cliente;
import com.api.mercadinhovirtual.model.Funcionario;
import com.api.mercadinhovirtual.repository.ClienteRepository;
import com.api.mercadinhovirtual.repository.FuncionarioRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Iterable<Cliente> listar() {
		Iterable<Cliente> resultado = clienteRepository.findAll();
		return resultado;
		
	}
	
	public Cliente buscarPorCodigo(Short id) {
		Optional<Cliente> buscar = clienteRepository.findById(id);
		
		if(buscar.isEmpty()) {
			throw new RecursoNaoEncontradoException();
		}
		
		Cliente cliente = buscar.get();
		return cliente;
	}
	
	public Cliente inserir(Cliente cliente) {
		Cliente clienteSalva = clienteRepository.save(cliente);
		return clienteSalva;
		
	}
	
	public Cliente editar(Cliente cliente) {
		Cliente clienteEditado = clienteRepository.save(cliente);
		return clienteEditado;
	}
	
	public Cliente excluir(Short id) {
		Optional<Cliente> excluir = clienteRepository.findById(id);
		
		clienteRepository.delete(excluir.get());
		return excluir.get();
	}

}

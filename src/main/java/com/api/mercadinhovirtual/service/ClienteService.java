package com.api.mercadinhovirtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mercadinhovirtual.model.Cliente;
import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
	public Cliente buscarPorCodigo(Long codigo) {
		return clienteRepository.findById(codigo).get();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public Loja inserir(Loja loja) {
	    //return clienteRepository.save(loja);
		
	//}
	
}

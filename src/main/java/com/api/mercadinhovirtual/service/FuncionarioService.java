package com.api.mercadinhovirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mercadinhovirtual.mensagens.RecursoNaoEncontradoException;
import com.api.mercadinhovirtual.model.Funcionario;
import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.repository.FuncionarioRepository;
import com.api.mercadinhovirtual.repository.LojaRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	public Iterable<Funcionario> listar() {
		Iterable<Funcionario> resultado = funcionarioRepository.findAll();
		return resultado;
		
	}
	
	public Funcionario buscarPorCodigo(Short id) {
		Optional<Funcionario> buscar = funcionarioRepository.findById(id);
		
		if(buscar.isEmpty()) {
			throw new RecursoNaoEncontradoException();
		}
		
		Funcionario funcionario = buscar.get();
		return funcionario;
	}
	
	public Funcionario inserir(Funcionario funcionario) {
		Funcionario funcionarioSalva = funcionarioRepository.save(funcionario);
		return funcionarioSalva;
		
	}
	
	public Funcionario editar(Funcionario funcionario) {
		Funcionario funcionarioEditado = funcionarioRepository.save(funcionario);
		return funcionarioEditado;
	}
	
	public Funcionario excluir(Short id) {
		Optional<Funcionario> excluir = funcionarioRepository.findById(id);
		
		funcionarioRepository.delete(excluir.get());
		return excluir.get();
	}

}

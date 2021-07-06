package com.api.mercadinhovirtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mercadinhovirtual.model.Funcionario;
import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.repository.FuncionarioRepository;
import com.api.mercadinhovirtual.repository.LojaRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	
	
	public List<Funcionario> listar() {
		return funcionarioRepository.findAll();
	}
	
	public Funcionario buscarPorCodigo(Long codigo) {
		return funcionarioRepository.findById(codigo).get();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public Funcionario inserir(Funcionario funcionario) {
	    //return funcionarioRepository.save(funcionario);
		
	//}
}

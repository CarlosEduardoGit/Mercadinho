package com.api.mercadinhovirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.mercadinhovirtual.model.Funcionario;
import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.repository.FuncionarioRepository;
import com.api.mercadinhovirtual.service.FuncionarioService;

@RestController
@RequestMapping("/api/v1/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	
	
	
}

package com.api.mercadinhovirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.api.mercadinhovirtual.model.Funcionario;

import com.api.mercadinhovirtual.service.FuncionarioService;

@RestController
@RequestMapping("/api/v1/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	
	
	@GetMapping("/listar")
	public ModelAndView Funcionarios() {
		ModelAndView mv = new ModelAndView("funcionarios");
		List<Funcionario> funcionarios = funcionarioService.listar();
		mv.addObject( "funcionarios", funcionarios );
		return mv;
	}
	
	@GetMapping("/{codigo}")
	public ModelAndView FuncionarioPorId(@PathVariable Long codigo) {
		ModelAndView mv = new ModelAndView("funcionarioDetalhado");
		Funcionario funcionario = funcionarioService.buscarPorCodigo(codigo);
		mv.addObject( "funcionario", funcionario );
		return mv;
	}
	
	@GetMapping("/inserir")
	public ModelAndView FuncionarioForm() {
		ModelAndView mv = new ModelAndView("funcionarioForm");
		return mv;
	}
	
	@PostMapping("/inserir")
	public ModelAndView SalvarFuncionario(@Validated Funcionario funcionario, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			ModelAndView mv = new ModelAndView("funcionarioForm");
			return mv;
		}
		funcionarioService.salvar(funcionario);
		ModelAndView mv = new ModelAndView("funcionarios");
		List<Funcionario> funcionarios = funcionarioService.listar();
		mv.addObject( "funcionarios", funcionarios );
		return mv;
	}
}

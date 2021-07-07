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

import com.api.mercadinhovirtual.model.Cliente;
import com.api.mercadinhovirtual.model.Funcionario;
import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.repository.FuncionarioRepository;
import com.api.mercadinhovirtual.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	
	
	@GetMapping("/listar")
	public ModelAndView Clientes() {
		ModelAndView mv = new ModelAndView("clientes");
		List<Cliente> clientes = clienteService.listar();
		mv.addObject( "clientes", clientes );
		return mv;
	}
	
	@GetMapping("/{codigo}")
	public ModelAndView ClientePorId(@PathVariable Long codigo) {
		ModelAndView mv = new ModelAndView("clienteDetalhado");
		Cliente cliente = clienteService.buscarPorCodigo(codigo);
		mv.addObject( "cliente", cliente );
		return mv;
	}
	
	@GetMapping("/inserir")
	public ModelAndView ClienteForm() {
		ModelAndView mv = new ModelAndView("clienteForm");
		return mv;
	}
	
	@PostMapping("/inserir")
	public ModelAndView SalvarCliente(@Validated Cliente cliente, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			ModelAndView mv = new ModelAndView("clienteForm");
			return mv;
		}
		clienteService.salvar(cliente);
		ModelAndView mv = new ModelAndView("clientes");
		List<Cliente> clientes = clienteService.listar();
		mv.addObject( "clientes", clientes );
		return mv;
	}
}

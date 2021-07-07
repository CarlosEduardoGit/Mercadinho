package com.api.mercadinhovirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import com.api.mercadinhovirtual.model.Loja;
import com.api.mercadinhovirtual.repository.LojaRepository;
import com.api.mercadinhovirtual.service.LojaService;

@RestController
@RequestMapping("/api/v1/lojas")
public class LojaController {
	 
	@Autowired
	private LojaService lojaService;
	
	
	
	@GetMapping("/listar")
	public ModelAndView Lojas() {
		ModelAndView mv = new ModelAndView("lojas");
		List<Loja> lojas = lojaService.listar();
		mv.addObject( "lojas", lojas );
		return mv;
	}
	
	@GetMapping("/{codigo}")
	public ModelAndView LojaPorId(@PathVariable Long codigo) {
		ModelAndView mv = new ModelAndView("lojaDetalhada");
		Loja loja = lojaService.buscarPorCodigo(codigo);
		mv.addObject( "loja", loja );
		return mv;
	}
	
	@GetMapping("/inserir")
	public ModelAndView LojaForm() {
		ModelAndView mv = new ModelAndView("lojaForm");
		return mv;
	}
	
	@PostMapping("/inserir")
	public ModelAndView SalvarLoja(@Validated Loja loja, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			ModelAndView mv = new ModelAndView("lojaForm");
			return mv;
		}
		lojaService.salvar(loja);
		ModelAndView mv = new ModelAndView("lojas");
		List<Loja> lojas = lojaService.listar();
		mv.addObject( "lojas", lojas );
		return mv;
	}
}

package br.com.chiarella.desafios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.chiarella.desafios.domain.Funcionario;
import br.com.chiarella.desafios.service.DesafioService;

@RestController
public class DesafioController {
	
	@Autowired
	private DesafioService desafioService;
	

	// Metodo para calculo do salario passado o ID do caolaborador
	@ResponseBody
	@GetMapping(value = "/reajusteSalarial/{id}")
	public ResponseEntity<String>  calcularReajuste(@PathVariable("id") Long id){
		return new ResponseEntity<String>(desafioService.reajusteSalarial(id), HttpStatus.OK);
	}
		
	@ResponseBody
	@GetMapping(value = "/about")
	public ResponseEntity<String> about(){
		return new ResponseEntity<String>("Aplicação BACK-END calculo de salario RAIA", HttpStatus.OK);
	}	
	
	@ResponseBody
	@GetMapping(value = "/funcionario/{id}")
	public ResponseEntity<Funcionario> buscaPorId(@PathVariable("id") Long id){
		return new ResponseEntity<Funcionario>(desafioService.buscaPorId(id), HttpStatus.OK);
	}
	
	@ResponseBody
	@GetMapping(value = "/funcionarios")
	public ResponseEntity<List<Funcionario>> buscaTodos(){
		return new ResponseEntity<List<Funcionario>>(desafioService.buscaTodos(), HttpStatus.OK);
	}
	
	@ResponseBody
	@GetMapping(value = "/salarios")
	public ResponseEntity<Double>  somaSalario(){
		return new ResponseEntity<Double>(desafioService.somaSalario(), HttpStatus.OK);
	}
	
	@ResponseBody
	@GetMapping(value = "/salario/{id}")
	public ResponseEntity<Double> salarioPorId(@PathVariable("id") Long id){
		return new ResponseEntity<Double>(desafioService.salarioPorId(id), HttpStatus.OK);
	}
	@ResponseBody
	@GetMapping(value="/delete/{id}")
 	public ResponseEntity<Void> delete(@PathVariable Long id){
		desafioService.delete(id);
		return ResponseEntity.noContent().build();
	}
}

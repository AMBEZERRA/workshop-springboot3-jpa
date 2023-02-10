package com.aulaSpringBoot.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaSpringBoot.course.entities.Category;
import com.aulaSpringBoot.course.services.CategoryService;
// Essa classe vai disponibilizar para mim um recurso web correspondente a entidade Category


// anotação  de rqeuisições 
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	// criar um metodo pra receber resposta da requisição web endpoint pra acessar usuario 	
	// contrlolador de site que responde no caminho users 
	
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}

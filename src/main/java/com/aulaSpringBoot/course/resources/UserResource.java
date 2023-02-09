package com.aulaSpringBoot.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaSpringBoot.course.entities.User;
// Essa classe vai disponibilizar para mim um recurso web correspondente a entidade User


// anotação  de rqeuisições 
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	// criar um metodo pra receber resposta da requisição web endpoint pra acessar usuario 	
	// contrlolador de site que responde no caminho users 
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@.com", "99999999", "123456");
		return ResponseEntity.ok().body(u);
		
	}
}

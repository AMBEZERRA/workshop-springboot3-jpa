package com.aulaSpringBoot.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaSpringBoot.course.entities.Order;
import com.aulaSpringBoot.course.services.OrderService;
// Essa classe vai disponibilizar para mim um recurso web correspondente a entidade Order

// anotação  de rqeuisições 
@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	// criar um metodo pra receber resposta da requisição web endpoint pra acessar
	// usuario
	// contrlolador de site que responde no caminho users

	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}

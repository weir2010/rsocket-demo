package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PersonDTO;
import com.example.demo.service.PersonService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/{id}")
	public Mono<PersonDTO> get(@PathVariable("id") Long id) {
		return personService.get(id);
	}
}

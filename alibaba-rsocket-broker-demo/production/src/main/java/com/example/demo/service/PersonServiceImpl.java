package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.rsocket.RSocketService;
import com.example.demo.entity.Person;
import com.example.demo.entity.PersonDTO;
import com.example.demo.repository.PersonRepository;

import reactor.core.publisher.Mono;

@RSocketService(serviceInterface = PersonService.class)
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Mono<PersonDTO> get(Long id) {
		Mono<Person> mono = personRepository.findById(id);
		Person person = mono.block();
		PersonDTO dto = new PersonDTO();
		BeanUtils.copyProperties(person, dto);
		return Mono.just(dto);
	}
}

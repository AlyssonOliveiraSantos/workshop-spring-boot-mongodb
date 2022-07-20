package com.educandoweb.mongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.mongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		
		User maria = new User("1", "Maria Silva", "maria@gmail.com");
		User joao = new User("2", "João Marcos", "joão@gmail.com");
		User davi = new User("3", "Davi Henrrique", "davi@gmail.com");
		List <User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(maria, joao, davi));
		
		return ResponseEntity.ok().body(list);
		
	}

}

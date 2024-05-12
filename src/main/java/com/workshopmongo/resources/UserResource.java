package com.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User teste1 = new User("1", "teste1", "teste1@gmail.com");
		User teste2 = new User("2", "teste2", "teste2@gmail.com");
	
		List<User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(teste1, teste2));
		
		return ResponseEntity.ok().body(list);
	}

}

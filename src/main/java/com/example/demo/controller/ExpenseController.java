package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class ExpenseController {

	@GetMapping("sayHello")
	public String sayHello() {
		return "hello";
	}
	
	//user details 
	@GetMapping("users")
	public ResponseEntity<List<User>>  getAllUsers() {			
        return new ResponseEntity<List<User>>(User.users, new HttpHeaders(), HttpStatus.OK);
	}
	@PostMapping("user/add")
	public ResponseEntity<User>  registerUser(@RequestBody User user) {
			user.setId(User.users.size()+1);
			User.users.add(user);		
        return new ResponseEntity<User>(user, new HttpHeaders(), HttpStatus.OK);
	}
	@PutMapping({"user/edit/{id}", "/edit/{id}"})
	public ResponseEntity<User>  UpdateUser(@RequestBody User user,@PathVariable("id") long id) {	
		if(user.getId() == 0)
		{
			user.setId(User.users.size()+1);
			User.users.add(user);
		} else {
			 Optional<User> op = User.users.stream().filter(t ->t.getId() == user.getId()).findFirst();
			 if(op.isPresent()) {
				 User user2 = op.get();
				 user2.setFirstName(user.getFirstName());
				 user2.setEmail(user.getEmail());
				 user2.setLastName(user.getLastName());
				 user.setId(user2.getId());
			 }
		}
        return new ResponseEntity<User>(user, new HttpHeaders(), HttpStatus.OK);
	}
	@DeleteMapping("user/{id}")
	public HttpStatus deleteUser(@PathVariable("id") long id) {		
		 Optional<User> op = User.users.stream().filter(t ->t.getId() ==id).findFirst();
		 if(op.isPresent()) {
			 User user2 = op.get();
			 User.users.remove(user2);
		 }
        return HttpStatus.OK;
	}
}

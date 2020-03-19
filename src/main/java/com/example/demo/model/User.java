package com.example.demo.model;

import java.util.ArrayList;

public class User {
	
public static ArrayList<User> users =new ArrayList<>();
private long id;
private String email;
private String password;
private String firstName;
private String lastName;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

public User(long id, String email, String password, String firstName, String lastName) {
	super();
	this.id = id;
	this.email = email;
	this.password = password;
	this.firstName = firstName;
	this.lastName = lastName;
}

static {
	users.add(new User(1,"kore.arvind@gmail.com","test112","arvnd","kore"));
	users.add(new User(2,"arvindkore@gmail.com","test112","arvnd 2","kore"));
	users.add(new User(3,"kore.arvind@test.com","test112","arvnd 3","kore"));
	users.add(new User(4,"kore.arvind@mailinator.com","test112","arvnd 4","kore"));
}

}

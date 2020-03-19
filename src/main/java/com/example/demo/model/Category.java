package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.repository.TYPE;

public class Category {

public static List<Category> categories = new ArrayList<>();

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;

private String expenseName;
private TYPE isCredit;
public String getExpenseName() {
	return expenseName;
}

public Category(long id, String expenseName, TYPE isCredit) {
	super();
	this.expenseName = expenseName;
	this.isCredit = isCredit;
}

public void setExpenseName(String expenseName) {
	this.expenseName = expenseName;
}
public TYPE getIsCredit() {
	return isCredit;
}
public void setIsCredit(TYPE isCredit) {
	this.isCredit = isCredit;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

static {
	categories.add(new Category(1,"Rent",TYPE.CREDIT));
	categories.add(new Category(2,"Rent",TYPE.DEBIT));
	categories.add(new Category(3,"Grossory",TYPE.DEBIT));
}
}

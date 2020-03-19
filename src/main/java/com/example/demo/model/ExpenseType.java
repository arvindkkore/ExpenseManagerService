package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.repository.TYPE;

public class ExpenseType {

public static List<ExpenseType>  expenseTypes = new ArrayList<>();

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;

private String expenseName;
private TYPE isCredit;
public String getExpenseName() {
	return expenseName;
}

public ExpenseType(long id,String expenseName, TYPE isCredit) {
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
	expenseTypes.add(new ExpenseType(1,"Rent",TYPE.CREDIT));
	expenseTypes.add(new ExpenseType(2,"Rent",TYPE.DEBIT));
	expenseTypes.add(new ExpenseType(3,"Grossory",TYPE.DEBIT));
}
}

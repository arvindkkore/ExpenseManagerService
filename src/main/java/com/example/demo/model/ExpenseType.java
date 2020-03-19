package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ExpenseType {

public static List<ExpenseType>  expenseTypes = new ArrayList<>();
private long id;
private String expenseName;
private Boolean isCredit;
public String getExpenseName() {
	return expenseName;
}

public ExpenseType(long id,String expenseName, Boolean isCredit) {
	super();
	this.expenseName = expenseName;
	this.isCredit = isCredit;
}

public void setExpenseName(String expenseName) {
	this.expenseName = expenseName;
}
public Boolean getIsCredit() {
	return isCredit;
}
public void setIsCredit(Boolean isCredit) {
	this.isCredit = isCredit;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

static {
	expenseTypes.add(new ExpenseType(1,"Rent",false));
	expenseTypes.add(new ExpenseType(2,"Rent",true));
	expenseTypes.add(new ExpenseType(3,"Grossory",false));
}
}

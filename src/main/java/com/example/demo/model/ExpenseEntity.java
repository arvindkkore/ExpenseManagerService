package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpenseEntity {

	public static List<ExpenseEntity> expenses = new ArrayList<>();
	private long id;
    private String expenseName;
	private Date expense_date;
	private ExpenseType expenseType;
	private User user;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getExpenseName() {
		return expenseName;
	}
	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}
	public Date getExpense_date() {
		return expense_date;
	}
	public void setExpense_date(Date expense_date) {
		this.expense_date = expense_date;
	}
	public ExpenseType getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public ExpenseEntity(long id, String expenseName, Date expense_date, ExpenseType expenseType) {
		super();
		this.id = id;
		this.expenseName = expenseName;
		this.expense_date = expense_date;
		this.expenseType = expenseType;
	}

	static {
		
	}
	
	
}

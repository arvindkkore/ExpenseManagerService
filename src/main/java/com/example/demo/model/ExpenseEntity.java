package com.example.demo.model;

import java.util.Date;

public class ExpenseEntity {

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
	
	
}

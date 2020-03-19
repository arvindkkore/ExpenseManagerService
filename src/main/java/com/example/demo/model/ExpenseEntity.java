package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExpenseEntity {

	public static List<ExpenseEntity> expenses = new ArrayList<>();
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    private String expenseName;
	private Date expense_date;
	private ExpenseType expenseType;
	private UserEntity user;
	private double amount;
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
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public ExpenseEntity(long id, String expenseName, Date expense_date,double amount, ExpenseType expenseType) {
		super();
		this.id = id;
		this.expenseName = expenseName;
		this.expense_date = expense_date;
		this.amount = amount;
		this.expenseType = expenseType;
	}

	static {
		
	}
	
	
	
}

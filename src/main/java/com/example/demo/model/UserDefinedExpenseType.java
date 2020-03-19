package com.example.demo.model;

public class UserDefinedExpenseType {
	private String expenseName;
	private Boolean isCredit;
	private User user;
	public String getExpenseName() {
		return expenseName;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}

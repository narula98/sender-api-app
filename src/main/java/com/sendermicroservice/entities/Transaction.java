package com.sendermicroservice.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	private String accountNumber;
	private String type;
	private String amount;
	private String currency;
	private String accountFrom;
	

	public Transaction(String accountNumber, String type, String amount, String currency, String accountFrom) {
		super();
		this.accountNumber = accountNumber;
		this.type = type;
		this.amount = amount;
		this.currency = currency;
		this.accountFrom = accountFrom;
	}


	@Override
	public int hashCode() {
		return Objects.hash(accountFrom, accountNumber, amount, currency, type);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(accountFrom, other.accountFrom) && Objects.equals(accountNumber, other.accountNumber)
				&& Objects.equals(amount, other.amount) && Objects.equals(currency, other.currency)
				&& Objects.equals(type, other.type);
	}


	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", type=" + type + ", amount=" + amount + ", currency="
				+ currency + ", accountFrom=" + accountFrom + "]";
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getcurrency() {
		return currency;
	}


	public void setcurrency(String currency) {
		this.currency = currency;
	}


	public String getAccountFrom() {
		return accountFrom;
	}


	public void setAccountFrom(String accountFrom) {
		this.accountFrom = accountFrom;
	}


	public Transaction() {
		// TODO Auto-generated constructor stub
	}

}

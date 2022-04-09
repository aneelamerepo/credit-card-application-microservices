package com.creditcard.domain;

import java.util.Objects;
import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by aneelame
 * Date: 29/Mar/2022
 * This is domain object.
 */
@Entity
@Table(name = "card")
@Access(value=AccessType.FIELD)
public class CreditCard implements Serializable{

	private static final long serialVersionUID = -7474838713815803531L;

	private @Id @GeneratedValue Long id;

	@Column(name="cardNumber")
	private String cardNumber;

	@Column(name="card_h_name")
	private String name;

	@Column(name="balance")
	String balance;

	@Column(name="card_limit")
	String limit;


	CreditCard() {}

	public CreditCard(String name, String cardNumber, String limit, String balance) {

		this.name = name;
		this.cardNumber = cardNumber;
		this.limit = limit;
		this.balance = balance;
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getLimit() {
		return this.limit;
	}

	public String getBalance() {
		return this.balance;
	}


	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof CreditCard))
			return false;
		CreditCard card = (CreditCard) o;
		return Objects.equals(this.id, card.id) && Objects.equals(this.name, card.name)
				&& Objects.equals(this.cardNumber, card.cardNumber) && Objects.equals(this.limit, card.limit)
				&& Objects.equals(this.balance, card.balance);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name, this.cardNumber, this.limit, this.balance);
	}

	@Override
	public String toString() {
		return "Card {" +
				"id=" + this.id +
				", name='" + name + '\'' +
				", cardNumber='" + cardNumber + '\'' +
				", limit='" + limit + '\'' +
				", balance='" + balance + '\'' +
				'}';
	}
}
package com.healthCallPayment.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
@Id
@Column(name="payment_id")
private int payment_id;
@Column(name="payment_user_id")
private String payment_user_id;
@Column(name="payment_price")
private String payment_price;
@Column(name="payment_book_id")

private String payment_book_id;
public int getPayment_id() {
	return payment_id;
}
public void setPayment_id(int payment_id) {
	this.payment_id = payment_id;
}
public String getPayment_user_id() {
	return payment_user_id;
}
public void setPayment_user_id(String payment_user_id) {
	this.payment_user_id = payment_user_id;
}
public String getPayment_price() {
	return payment_price;
}
public void setPayment_price(String payment_price) {
	this.payment_price = payment_price;
}
public String getPayment_book_id() {
	return payment_book_id;
}
public void setPayment_book_id(String payment_book_id) {
	this.payment_book_id = payment_book_id;
}
}

package com.microservices.currencyexchange.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Exchange_Value")
public class ExchangeValue {
	@Id
	@Column(name="id")
	private long id;
	@Column(name="currency_from")
private String from;
	@Column(name="currency_to")
private String to;
	@Column(name="converstional_multiplte")
private BigDecimal ConverstionalMultiplte;
	@Column(name="port")
private int port;
public ExchangeValue() {
	
}

public ExchangeValue(long id, String from, String to, BigDecimal converstionalMultiplte) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	ConverstionalMultiplte = converstionalMultiplte;
}

public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public BigDecimal getConverstionalMultiplte() {
	return ConverstionalMultiplte;
}
public void setConverstionalMultiplte(BigDecimal converstionalMultiplte) {
	ConverstionalMultiplte = converstionalMultiplte;
}

@Override
public String toString() {
	return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", ConverstionalMultiplte="
			+ ConverstionalMultiplte + ", port=" + port + "]";
}


}

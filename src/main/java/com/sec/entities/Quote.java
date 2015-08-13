package com.sec.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@Entity
@Table(name="Quote")
@XmlRootElement
public class Quote {

	@Id
	@TableGenerator(table="Quote_IDs",initialValue=1,allocationSize=1 ,name = "quote_id_gen")
	@GeneratedValue(strategy=GenerationType.TABLE, generator="quote_id_gen")
	private long id;
	@Column
	private String name;
	@Column
	private Float amount;
	@Column
	private String item;
	@Column
	private int quantity;
	
	
	public Quote() {
	}
	
	public Quote(String name, Float amount, String item, int quantity) {
		this.name = name;
		this.amount = amount;
		this.item = item;
		this.quantity = quantity;
	}
		
	
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public Float getAmount() {
		return amount;
	}
	@XmlElement
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public String getItem() {
		return item;
	}
	
	@XmlElement
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	
	@XmlElement
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}
	@XmlElement
	public void setId(long id) {
		this.id = id;
	}
	
}

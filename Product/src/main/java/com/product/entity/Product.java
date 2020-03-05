package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="product")
@Table(name="product")
public class Product{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productid;
	private String name;
	private String catagory;
	private Double  price;
	public Product(String name, String catagory, Double price) {
		super();
		this.name = name;
		this.catagory = catagory;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", catagory=" + catagory + ", price=" + price
				+ "]";
	}

	

}

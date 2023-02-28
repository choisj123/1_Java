package com.hw3.model.vo;

import java.util.Objects;

public class Product {
	//필드
	private String brand;
	private String name;
	private String color;
	private int price;
	
	//생성자
	public Product() {}

	public Product(String brand, String name, String color, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	
	
	
	@Override
	public String toString() {
		return "brand = " + brand + ", name = " + name + ", color = " + color + ", price = " + price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, color, name, price);
	}
	
	@Override
	public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if(getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return Objects.equals(other, other.brand) && Objects.equals(color, other.color)
					&& Objects.equals(name, other.name) && Objects.equals(price, other.price);
		
	}
	
	
	@Override
	public Product clone() {
		return new Product(this.brand, this.name, this.color, this.price ) ;
	}

	
	
}

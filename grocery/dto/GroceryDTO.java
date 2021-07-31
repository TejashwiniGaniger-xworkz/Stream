package com.xworkz.grocery.dto;

import java.io.Serializable;

public class GroceryDTO implements Serializable, Comparable<GroceryDTO>{
	
	private String name;
	private float price;
	private String type;
	private int quantity;
	private boolean quality;
	private String brand;
	private String expireDate;
	private String manufactureDate;
	private boolean organic;
	private boolean veg;
	private String barCodeNo;
	
	public GroceryDTO() {

	}

	public GroceryDTO(String name, float price, String type, int quantity, boolean quality, String brand,
			String expireDate, String manufactureDate, boolean organic, boolean veg, String barCodeNo) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.quality = quality;
		this.brand = brand;
		this.expireDate = expireDate;
		this.manufactureDate = manufactureDate;
		this.organic = organic;
		this.veg = veg;
		this.barCodeNo = barCodeNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public boolean isOrganic() {
		return organic;
	}

	public void setOrganic(boolean organic) {
		this.organic = organic;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public String getBarCodeNo() {
		return barCodeNo;
	}

	public void setBarCodeNo(String barCodeNo) {
		this.barCodeNo = barCodeNo;
	}

	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", price=" + price + ", type=" + type + ", quantity=" + quantity
				+ ", quality=" + quality + ", brand=" + brand + ", expireDate=" + expireDate + ", manufactureDate="
				+ manufactureDate + ", organic=" + organic + ", veg=" + veg + ", barCodeNo=" + barCodeNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barCodeNo == null) ? 0 : barCodeNo.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((expireDate == null) ? 0 : expireDate.hashCode());
		result = prime * result + ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (organic ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + (quality ? 1231 : 1237);
		result = prime * result + quantity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + (veg ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryDTO other = (GroceryDTO) obj;
		if (barCodeNo == null) {
			if (other.barCodeNo != null)
				return false;
		} else if (!barCodeNo.equals(other.barCodeNo))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (expireDate == null) {
			if (other.expireDate != null)
				return false;
		} else if (!expireDate.equals(other.expireDate))
			return false;
		if (manufactureDate == null) {
			if (other.manufactureDate != null)
				return false;
		} else if (!manufactureDate.equals(other.manufactureDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (organic != other.organic)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (quality != other.quality)
			return false;
		if (quantity != other.quantity)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (veg != other.veg)
			return false;
		return true;
	}

	@Override
	public int compareTo(GroceryDTO o) {
	  int max = o.getQuantity();
	  if(this.quantity==max)
		  return 0;
	  if(this.quantity > max)
         return 1;
	  if(this.quantity < max)
		  return -1;
		return 0;
	}
	
	

}

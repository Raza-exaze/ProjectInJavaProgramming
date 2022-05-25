package com.DataBase.HibernatePersistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class JavaBean
{
	@Id
	@Column(name="country")
	private String country;
	@Column(name="City")
	private String city;
	
	public JavaBean()
	{
		
	}
	
	public JavaBean(String country,String city)
	{
		this.country=country;
		this.city=city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "JavaBean [country=" + country + ", city=" + city + "]";
	}
	
}

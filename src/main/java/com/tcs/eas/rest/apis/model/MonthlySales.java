package com.tcs.eas.rest.apis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "Kafka_SalesMonth")
public class MonthlySales {

	@Id
	@Column(name = "MONTH")
	private String month;

	@Column(unique = false, name = "COUNT")
	private int count;

	@Column(unique = false, name = "REVENUE")
	private int revenue;

	/**
	 * 
	 */
	public MonthlySales() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param month
	 * @param count
	 * @param revenue
	 */
	public MonthlySales(String month, int count, int revenue) {
		super();
		this.month = month;
		this.count = count;
		this.revenue = revenue;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

}

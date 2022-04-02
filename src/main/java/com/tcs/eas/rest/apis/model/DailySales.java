package com.tcs.eas.rest.apis.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "Kafka_SalesDay")
public class DailySales {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DATE")
	private Date date;

	@Column(unique = false, name = "COUNT")
	private int count;

	@Column(unique = false, name = "REVENUE")
	private int revenue;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	/**
	 * @param date
	 * @param count
	 * @param revenue
	 */
	public DailySales(Date date, int count, int revenue) {
		super();
		this.date = date;
		this.count = count;
		this.revenue = revenue;
	}

	/**
	 * 
	 */
	public DailySales() {
		super();
		// TODO Auto-generated constructor stub
	}

}

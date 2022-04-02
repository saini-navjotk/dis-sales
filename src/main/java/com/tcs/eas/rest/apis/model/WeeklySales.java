package com.tcs.eas.rest.apis.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "Kafka_SalesWeek")
public class WeeklySales {

	@EmbeddedId
	private WeeklySalesPK weeklySalesPK;

	@Column(unique = false, name = "COUNT")
	private int count;

	@Column(unique = false, name = "REVENUE")
	private int revenue;

	/**
	 * 
	 */
	public WeeklySales() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param weeklySalesPK
	 * @param count
	 * @param revenue
	 */
	public WeeklySales(WeeklySalesPK weeklySalesPK, int count, int revenue) {
		super();
		this.weeklySalesPK = weeklySalesPK;
		this.count = count;
		this.revenue = revenue;
	}

	public WeeklySalesPK getWeeklySalesPK() {
		return weeklySalesPK;
	}

	public void setWeeklySalesPK(WeeklySalesPK weeklySalesPK) {
		this.weeklySalesPK = weeklySalesPK;
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

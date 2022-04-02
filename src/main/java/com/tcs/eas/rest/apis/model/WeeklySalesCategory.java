package com.tcs.eas.rest.apis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity(name = "Kafka_SalesCategoryWeek")
public class WeeklySalesCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3099139306550410959L;

	@EmbeddedId
	private WeeklySalesCategoryPK weeklySalesCategoryPK;

	@Column(unique = false, name = "COUNT")
	private int count;

	@Column(unique = false, name = "REVENUE")
	private int revenue;

	/**
	 * 
	 */
	public WeeklySalesCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param count
	 * @param revenue
	 */
	public WeeklySalesCategory(WeeklySalesCategoryPK weeklySalesCategoryPK, int count, int revenue) {
		super();
		this.weeklySalesCategoryPK = weeklySalesCategoryPK;
		this.count = count;
		this.revenue = revenue;
	}

	public WeeklySalesCategoryPK getWeeklySalesCategoryPK() {
		return weeklySalesCategoryPK;
	}

	public void setWeeklySalesCategoryPK(WeeklySalesCategoryPK weeklySalesCategoryPK) {
		this.weeklySalesCategoryPK = weeklySalesCategoryPK;
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

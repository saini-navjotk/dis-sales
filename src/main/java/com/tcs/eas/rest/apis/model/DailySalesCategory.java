package com.tcs.eas.rest.apis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity(name = "Kafka_SalesCategoryDay")
public class DailySalesCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3099139306550410959L;

	@EmbeddedId
	private DailySalesCategoryPK dailySalesCategoryPK;

	@Column(unique = false, name = "COUNT")
	private int count;

	@Column(unique = false, name = "REVENUE")
	private int revenue;

	/**
	 * 
	 */
	public DailySalesCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param count
	 * @param revenue
	 */
	public DailySalesCategory(DailySalesCategoryPK dailySalesCategoryPK, int count, int revenue) {
		super();
		this.dailySalesCategoryPK = dailySalesCategoryPK;
		this.count = count;
		this.revenue = revenue;
	}

	public DailySalesCategoryPK getDailySalesCategoryPK() {
		return dailySalesCategoryPK;
	}

	public void setDailySalesCategoryPK(DailySalesCategoryPK dailySalesCategoryPK) {
		this.dailySalesCategoryPK = dailySalesCategoryPK;
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

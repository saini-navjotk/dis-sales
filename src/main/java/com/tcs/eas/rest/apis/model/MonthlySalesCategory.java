package com.tcs.eas.rest.apis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity(name = "Kafka_SalesCategoryMonth")
public class MonthlySalesCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3099139306550410959L;

	@EmbeddedId
	private MonthlySalesCategoryPK monthlySalesCategoryPK;

	@Column(unique = false, name = "COUNT")
	private int count;

	@Column(unique = false, name = "REVENUE")
	private int revenue;

	/**
	 * 
	 */
	public MonthlySalesCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param count
	 * @param revenue
	 */
	public MonthlySalesCategory(MonthlySalesCategoryPK monthlySalesCategoryPK, int count, int revenue) {
		super();
		this.monthlySalesCategoryPK = monthlySalesCategoryPK;
		this.count = count;
		this.revenue = revenue;
	}

	public MonthlySalesCategoryPK getMonthlySalesCategoryPK() {
		return monthlySalesCategoryPK;
	}

	public void setMonthlySalesCategoryPK(MonthlySalesCategoryPK monthlySalesCategoryPK) {
		this.monthlySalesCategoryPK = monthlySalesCategoryPK;
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

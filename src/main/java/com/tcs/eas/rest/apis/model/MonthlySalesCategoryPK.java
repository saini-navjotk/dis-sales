package com.tcs.eas.rest.apis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Embeddable
public class MonthlySalesCategoryPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8748274098220932478L;

	@Column(name = "MONTH")
	private String month;

	@Column(name = "CATEGORY")
	private String category;

	/**
	 * 
	 */
	public MonthlySalesCategoryPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param month
	 * @param category
	 */
	public MonthlySalesCategoryPK(String month, String category) {
		super();
		this.month = month;
		this.category = category;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

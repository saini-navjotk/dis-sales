package com.tcs.eas.rest.apis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Embeddable
public class WeeklySalesCategoryPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8748274098220932478L;

	@Column(name = "MONTH")
	private String month;
	
	@Column(name = "WEEK")
	private int week;

	@Column(name = "CATEGORY")
	private String category;

	/**
	 * 
	 */
	public WeeklySalesCategoryPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param month
	 * @param week
	 * @param category
	 */
	public WeeklySalesCategoryPK(String month, int week, String category) {
		super();
		this.month = month;
		this.week = week;
		this.category = category;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



}

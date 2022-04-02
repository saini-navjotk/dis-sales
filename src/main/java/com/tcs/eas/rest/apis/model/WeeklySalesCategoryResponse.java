package com.tcs.eas.rest.apis.model;

import io.swagger.annotations.ApiModel;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@ApiModel
public class WeeklySalesCategoryResponse {

	private String month;

	private int week;

	private String category;

	private int count;

	private int revenue;

	/**
	 * 
	 */
	public WeeklySalesCategoryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param month
	 * @param week
	 * @param category
	 * @param count
	 * @param revenue
	 */
	public WeeklySalesCategoryResponse(String month, int week, String category, int count, int revenue) {
		super();
		this.month = month;
		this.week = week;
		this.category = category;
		this.count = count;
		this.revenue = revenue;
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

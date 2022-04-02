package com.tcs.eas.rest.apis.model;

import java.sql.Date;

import io.swagger.annotations.ApiModel;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@ApiModel
public class DailySalesCategoryResponse {

	private Date date;

	private String category;

	private int count;

	private int revenue;

	/**
	 * 
	 */
	public DailySalesCategoryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param date
	 * @param category
	 * @param count
	 * @param revenue
	 */
	public DailySalesCategoryResponse(Date date, String category, int count, int revenue) {
		super();
		this.date = date;
		this.category = category;
		this.count = count;
		this.revenue = revenue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

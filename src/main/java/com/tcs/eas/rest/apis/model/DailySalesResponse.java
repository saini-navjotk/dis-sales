package com.tcs.eas.rest.apis.model;

import java.sql.Date;
import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel
public class DailySalesResponse {

	private Date date;

	private int count;

	private int revenue;

	private List<DailySalesCategoryResponse> categories;

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

	public List<DailySalesCategoryResponse> getCategories() {
		return categories;
	}

	public void setCategories(List<DailySalesCategoryResponse> categories) {
		this.categories = categories;
	}

	/**
	 * 
	 */
	public DailySalesResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param date
	 * @param count
	 * @param revenue
	 * @param categories
	 */
	public DailySalesResponse(Date date, int count, int revenue, List<DailySalesCategoryResponse> categories) {
		super();
		this.date = date;
		this.count = count;
		this.revenue = revenue;
		this.categories = categories;
	}

}

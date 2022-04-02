package com.tcs.eas.rest.apis.model;

import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel
public class WeeklySalesResponse {

	private String month;

	private int week;

	private int count;

	private int revenue;

	private List<WeeklySalesCategoryResponse> categories;

	/**
	 * 
	 */
	public WeeklySalesResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param month
	 * @param week
	 * @param count
	 * @param revenue
	 * @param categories
	 */
	public WeeklySalesResponse(String month, int week, int count, int revenue,
			List<WeeklySalesCategoryResponse> categories) {
		super();
		this.month = month;
		this.week = week;
		this.count = count;
		this.revenue = revenue;
		this.categories = categories;
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

	public List<WeeklySalesCategoryResponse> getCategories() {
		return categories;
	}

	public void setCategories(List<WeeklySalesCategoryResponse> categories) {
		this.categories = categories;
	}

}

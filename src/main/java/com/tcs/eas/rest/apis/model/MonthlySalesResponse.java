package com.tcs.eas.rest.apis.model;

import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel
public class MonthlySalesResponse {

	private String month;

	private int count;

	private int revenue;

	private List<MonthlySalesCategoryResponse> categories;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
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

	public List<MonthlySalesCategoryResponse> getCategories() {
		return categories;
	}

	public void setCategories(List<MonthlySalesCategoryResponse> categories) {
		this.categories = categories;
	}

	/**
	 * 
	 */
	public MonthlySalesResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param month
	 * @param count
	 * @param revenue
	 * @param categories
	 */
	public MonthlySalesResponse(String month, int count, int revenue, List<MonthlySalesCategoryResponse> categories) {
		super();
		this.month = month;
		this.count = count;
		this.revenue = revenue;
		this.categories = categories;
	}

}

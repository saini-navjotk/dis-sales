package com.tcs.eas.rest.apis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Embeddable
public class WeeklySalesPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3932076664008563358L;

	@Column(name = "MONTH")
	private String month;

	@Column(name = "WEEK")
	private int week;

	/**
	 * 
	 */
	public WeeklySalesPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param month
	 * @param count
	 */
	public WeeklySalesPK(String month, int week) {
		super();
		this.month = month;
		this.week = week;
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

}

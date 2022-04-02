package com.tcs.eas.rest.apis.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Embeddable
public class DailySalesCategoryPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8748274098220932478L;

	@Column(name = "DATE")
	private Date date;

	@Column(name = "CATEGORY")
	private String category;

	/**
	 * 
	 */
	public DailySalesCategoryPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param date
	 * @param category
	 */
	public DailySalesCategoryPK(Date date, String category) {
		super();
		this.date = date;
		this.category = category;
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

}

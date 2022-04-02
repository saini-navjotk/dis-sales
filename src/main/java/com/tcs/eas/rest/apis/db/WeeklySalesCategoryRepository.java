package com.tcs.eas.rest.apis.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.eas.rest.apis.model.WeeklySalesCategory;
import com.tcs.eas.rest.apis.model.WeeklySalesCategoryPK;

public interface WeeklySalesCategoryRepository extends JpaRepository<WeeklySalesCategory, WeeklySalesCategoryPK> {
	
	public List<WeeklySalesCategory> findByWeeklySalesCategoryPKMonthAndWeeklySalesCategoryPKWeek(String month, int week);

}

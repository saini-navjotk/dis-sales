package com.tcs.eas.rest.apis.db;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.eas.rest.apis.model.DailySalesCategory;
import com.tcs.eas.rest.apis.model.DailySalesCategoryPK;

public interface DailySalesCategoryRepository extends JpaRepository<DailySalesCategory, DailySalesCategoryPK> {
	
	public List<DailySalesCategory> findByDailySalesCategoryPKDate(Date date);

}

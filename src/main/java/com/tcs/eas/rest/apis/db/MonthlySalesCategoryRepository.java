package com.tcs.eas.rest.apis.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.eas.rest.apis.model.MonthlySalesCategory;
import com.tcs.eas.rest.apis.model.MonthlySalesCategoryPK;

public interface MonthlySalesCategoryRepository extends JpaRepository<MonthlySalesCategory, MonthlySalesCategoryPK> {
	
	public List<MonthlySalesCategory> findByMonthlySalesCategoryPKMonth(String month);

}

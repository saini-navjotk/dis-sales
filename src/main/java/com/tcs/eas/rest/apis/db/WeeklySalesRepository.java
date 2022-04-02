package com.tcs.eas.rest.apis.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.eas.rest.apis.model.WeeklySales;
import com.tcs.eas.rest.apis.model.WeeklySalesPK;

public interface WeeklySalesRepository extends JpaRepository<WeeklySales, WeeklySalesPK> {

}

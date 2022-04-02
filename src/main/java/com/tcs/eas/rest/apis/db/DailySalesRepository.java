package com.tcs.eas.rest.apis.db;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.eas.rest.apis.model.DailySales;

public interface DailySalesRepository extends JpaRepository<DailySales, Date> {

}

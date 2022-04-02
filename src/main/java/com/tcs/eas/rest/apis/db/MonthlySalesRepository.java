package com.tcs.eas.rest.apis.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.eas.rest.apis.model.MonthlySales;

public interface MonthlySalesRepository extends JpaRepository<MonthlySales, String> {

}

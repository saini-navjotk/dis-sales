package com.tcs.eas.rest.apis.controller;

import java.sql.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.eas.rest.apis.db.DailySalesDaoService;
import com.tcs.eas.rest.apis.db.MonthlySalesDaoService;
import com.tcs.eas.rest.apis.db.WeeklySalesDaoService;
import com.tcs.eas.rest.apis.exception.SalesInfoNotFound;
import com.tcs.eas.rest.apis.log.LoggingService;
import com.tcs.eas.rest.apis.model.DailySalesResponse;
import com.tcs.eas.rest.apis.model.MonthlySalesResponse;
import com.tcs.eas.rest.apis.model.WeeklySalesResponse;
import com.tcs.eas.rest.apis.utility.Utility;

@RestController
@RequestMapping("api/v1/dis/sales")
public class SalesController {

	@Autowired
	private DailySalesDaoService dailySalesDaoService;

	@Autowired
	private MonthlySalesDaoService monthlySalesDaoService;
	
	@Autowired
	private WeeklySalesDaoService weeklySalesDaoService;

	@Autowired
	LoggingService loggingService;

	@GetMapping(value = "/day/{dayValue}")
	public ResponseEntity<DailySalesResponse> getDailySales(@PathVariable Date dayValue,
			@RequestHeader Map<String, String> headers) {

		DailySalesResponse dailySalesResponse = dailySalesDaoService.getDailySalesByDate(dayValue);

		if (dailySalesResponse == null) {
			throw new SalesInfoNotFound("Daily Sales for date: " + dayValue + " does not exist");
		}

		loggingService.writeProcessLog("GET", "DailySales", "getDailySales by id", dailySalesResponse);
		return ResponseEntity.status(200).headers(Utility.getCustomResponseHeaders(headers)).body(dailySalesResponse);
	}
	

	@GetMapping(value = "/month/{monthValue}")
	public ResponseEntity<MonthlySalesResponse> getMonthlySales(@PathVariable String monthValue,
			@RequestHeader Map<String, String> headers) {

		MonthlySalesResponse monthlySalesResponse = monthlySalesDaoService.getMonthlySalesByMonth(monthValue);

		if (monthlySalesResponse == null) {
			throw new SalesInfoNotFound("Monthly Sales for month: " + monthValue + " does not exist");
		}

		loggingService.writeProcessLog("GET", "MonthlySales", "getMonthlySales by id", monthlySalesResponse);
		return ResponseEntity.status(200).headers(Utility.getCustomResponseHeaders(headers)).body(monthlySalesResponse);
	}
	
	@GetMapping(value = "/week/{monthValue}/{weekValue}")
	public ResponseEntity<WeeklySalesResponse> getWeeklySales(@PathVariable String monthValue, @PathVariable int weekValue,
			@RequestHeader Map<String, String> headers) {

		WeeklySalesResponse weeklySalesResponse = weeklySalesDaoService.getWeeklySalesByMonth(monthValue, weekValue);

		if (weeklySalesResponse == null) {
			throw new SalesInfoNotFound("Weekly Sales for month: " + monthValue + " and week: " + weekValue + " does not exist");
		}

		loggingService.writeProcessLog("GET", "WeeklySales", "getWeeklySales by id", weeklySalesResponse);
		return ResponseEntity.status(200).headers(Utility.getCustomResponseHeaders(headers)).body(weeklySalesResponse);
	}

}

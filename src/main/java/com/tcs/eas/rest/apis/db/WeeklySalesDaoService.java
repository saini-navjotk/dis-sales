package com.tcs.eas.rest.apis.db;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.eas.rest.apis.model.WeeklySales;
import com.tcs.eas.rest.apis.model.WeeklySalesCategory;
import com.tcs.eas.rest.apis.model.WeeklySalesCategoryResponse;
import com.tcs.eas.rest.apis.model.WeeklySalesPK;
import com.tcs.eas.rest.apis.model.WeeklySalesResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WeeklySalesDaoService {

	@Autowired
	private WeeklySalesRepository weeklySalesRepository;

	@Autowired
	private WeeklySalesCategoryRepository weeklySalesCategoryRepository;

	public WeeklySalesResponse getWeeklySalesByMonth(String month, int week) {

		WeeklySales weeklySales = null;
		WeeklySalesResponse weeklySalesResponse = null;
		List<WeeklySalesCategoryResponse> categories = null;

		List<WeeklySalesCategory> weeklySalesCategories = weeklySalesCategoryRepository
				.findByWeeklySalesCategoryPKMonthAndWeeklySalesCategoryPKWeek(month, week);
		if (weeklySalesCategories != null) {
			categories = weeklySalesCategories.stream()
					.map(c -> new WeeklySalesCategoryResponse(c.getWeeklySalesCategoryPK().getMonth(),
							c.getWeeklySalesCategoryPK().getWeek(), c.getWeeklySalesCategoryPK().getCategory(), c.getCount(), c.getRevenue()))
					.collect(Collectors.toList());
		}

		
		Optional<WeeklySales> optionalWeeklySales = weeklySalesRepository.findById(new WeeklySalesPK(month, week));
		if (optionalWeeklySales.isPresent()) {
			weeklySales = optionalWeeklySales.get();
			weeklySalesResponse = new WeeklySalesResponse();
			weeklySalesResponse.setMonth(weeklySales.getWeeklySalesPK().getMonth());
			weeklySalesResponse.setWeek(weeklySales.getWeeklySalesPK().getWeek());
			weeklySalesResponse.setCount(weeklySales.getCount());
			weeklySalesResponse.setRevenue(weeklySales.getRevenue());
			weeklySalesResponse.setCategories(categories);
		}

		return weeklySalesResponse;
	}

}

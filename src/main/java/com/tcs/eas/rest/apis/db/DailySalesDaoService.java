package com.tcs.eas.rest.apis.db;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.eas.rest.apis.model.DailySales;
import com.tcs.eas.rest.apis.model.DailySalesCategory;
import com.tcs.eas.rest.apis.model.DailySalesCategoryResponse;
import com.tcs.eas.rest.apis.model.DailySalesResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DailySalesDaoService {

	@Autowired
	private DailySalesRepository dailySalesRepository;

	@Autowired
	private DailySalesCategoryRepository dailySalesCategoryRepository;

	public DailySalesResponse getDailySalesByDate(Date date) {

		DailySales dailySales = null;
		DailySalesResponse dailySalesResponse = null;
		List<DailySalesCategoryResponse> categories = null;

		List<DailySalesCategory> dailySalesCategories = dailySalesCategoryRepository
				.findByDailySalesCategoryPKDate(date);
		if (dailySalesCategories != null) {
			categories = dailySalesCategories.stream()
					.map(c -> new DailySalesCategoryResponse(c.getDailySalesCategoryPK().getDate(),
							c.getDailySalesCategoryPK().getCategory(), c.getCount(), c.getRevenue()))
					.collect(Collectors.toList());
		}

		Optional<DailySales> optionalDailySales = dailySalesRepository.findById(date);
		if (optionalDailySales.isPresent()) {
			dailySales = optionalDailySales.get();
			dailySalesResponse = new DailySalesResponse();
			dailySalesResponse.setDate(dailySales.getDate());
			dailySalesResponse.setCount(dailySales.getCount());
			dailySalesResponse.setRevenue(dailySales.getRevenue());
			dailySalesResponse.setCategories(categories);
		}

		return dailySalesResponse;
	}

}

package com.tcs.eas.rest.apis.db;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.eas.rest.apis.model.MonthlySales;
import com.tcs.eas.rest.apis.model.MonthlySalesCategory;
import com.tcs.eas.rest.apis.model.MonthlySalesCategoryResponse;
import com.tcs.eas.rest.apis.model.MonthlySalesResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MonthlySalesDaoService {

	@Autowired
	private MonthlySalesRepository monthlySalesRepository;

	@Autowired
	private MonthlySalesCategoryRepository monthlySalesCategoryRepository;

	public MonthlySalesResponse getMonthlySalesByMonth(String month) {

		MonthlySales monthlySales = null;
		MonthlySalesResponse monthlySalesResponse = null;
		List<MonthlySalesCategoryResponse> categories = null;

		List<MonthlySalesCategory> monthlySalesCategories = monthlySalesCategoryRepository
				.findByMonthlySalesCategoryPKMonth(month);
		if (monthlySalesCategories != null) {
			categories = monthlySalesCategories.stream()
					.map(c -> new MonthlySalesCategoryResponse(c.getMonthlySalesCategoryPK().getMonth(),
							c.getMonthlySalesCategoryPK().getCategory(), c.getCount(), c.getRevenue()))
					.collect(Collectors.toList());
		}

		Optional<MonthlySales> optionalMonthlySales = monthlySalesRepository.findById(month);
		if (optionalMonthlySales.isPresent()) {
			monthlySales = optionalMonthlySales.get();
			monthlySalesResponse = new MonthlySalesResponse();
			monthlySalesResponse.setMonth(monthlySales.getMonth());
			monthlySalesResponse.setCount(monthlySales.getCount());
			monthlySalesResponse.setRevenue(monthlySales.getRevenue());
			monthlySalesResponse.setCategories(categories);
		}

		return monthlySalesResponse;
	}

}

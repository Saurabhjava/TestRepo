package com.lnt.microservices;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

		@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
		public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
			return new CurrencyConversionBean(1000l, from, to,BigDecimal.valueOf(65), quantity, BigDecimal.valueOf(1000), 8100);
		}
}

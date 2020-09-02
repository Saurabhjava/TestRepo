package com.lnt.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.microservices.bean.LimitConfiguration;

@RestController
public class LimitsController {
	@Autowired
	private Configuration cfg;
	@GetMapping("/limits")
	public LimitConfiguration getLimitsFromConfig() {
		return new LimitConfiguration(cfg.getMaximum(),cfg.getMinimum());
	}
}

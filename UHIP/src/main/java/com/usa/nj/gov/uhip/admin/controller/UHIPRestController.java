package com.usa.nj.gov.uhip.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usa.nj.gov.uhip.util.UHIPPropsProperties;

@RestController
public class UHIPRestController {
	Logger logger = LoggerFactory.getLogger(UHIPRestController.class);

	@Autowired
	private UHIPPropsProperties appProps;

	@GetMapping("/uhips")
	public String get() {

		logger.info("This is get method in RestController");
		return "welcome";
	}
}
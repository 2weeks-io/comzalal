package com.weeks.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weeks.dto.ItemDto;
import com.weeks.service.ItemService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception{
		
		int itemId = 1;
		ItemDto itemDto = itemService.getItemDto(itemId);
		
		logger.info("hello test");
		
		return "home";
	}
	
}

package com.weeks.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weeks.dao.ItemDao;
import com.weeks.dto.ItemDto;

@Service
public class ItemService {

	private static final Logger logger = LoggerFactory.getLogger(ItemService.class);
	
	@Autowired
	private ItemDao itemDao;
	
    /*
     ** 메인페이지 게시글 페이징 조회
     */
    public ItemDto getItemDto(int itemId) throws Exception{
    	ItemDto itemDto = new ItemDto();
    	try {
    		itemDto = itemDao.getItemDto(itemId);
    	} catch(Exception e) {
    		System.err.println(e.getMessage());
    	}
    	
    	return itemDto;
    }
	
}

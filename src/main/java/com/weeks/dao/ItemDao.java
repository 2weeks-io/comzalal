package com.weeks.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weeks.dto.ItemDto;

@Repository
public class ItemDao {

	@Autowired
    private SqlSession sqlSession;
	
    private static final String Namespace = "com.week.mapper.itemMapper";
    
    //게시글 작성
    public ItemDto getItemDto(int itemId){
    	return sqlSession.selectOne(Namespace+".getItemDto", itemId);
    }
	
}

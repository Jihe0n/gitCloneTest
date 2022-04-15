package com.reffics.groupware.svc.login.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.reffics.groupware.svc.login.model.ComentDto;

import com.reffics.groupware.svc.login.model.BoardDto;



@Mapper
@Repository
public interface BoardMapper {
	
	
	int updateBoard(BoardDto boardDto);
	
	int deleteComment(String seq);
	
	List<BoardDto> boardSearch(String title);
	
	int insertBoard(BoardDto boardDto);
	
	int deleteBoard(String seq);
	
	int insertComment(ComentDto comentDto);
	
	List<BoardDto> selectNow();
	
	List<ComentDto> selectComment(String seq);
	
}

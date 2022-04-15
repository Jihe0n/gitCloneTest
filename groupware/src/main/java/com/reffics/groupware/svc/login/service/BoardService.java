package com.reffics.groupware.svc.login.service;



import java.util.List;

import com.reffics.groupware.svc.login.model.ComentDto;
import com.reffics.groupware.svc.login.model.BoardDto;


public interface BoardService {
	
	public int updateBoard(BoardDto boardDto);

	public List<BoardDto> boardSearch(String title);

	public int deleteBoard(String seq);
	
	public int deleteComment(String seq);

	public int insertBoard(BoardDto boardDto);

	public int insertComment(ComentDto comentDto);

	public List<BoardDto> selectNow();

	public List<ComentDto> selectComment(String seq);



}

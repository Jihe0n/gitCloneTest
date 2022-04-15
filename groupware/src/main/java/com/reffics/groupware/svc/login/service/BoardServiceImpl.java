package com.reffics.groupware.svc.login.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.reffics.groupware.svc.login.model.BoardDto;
import com.reffics.groupware.svc.login.model.ComentDto;
import com.reffics.groupware.svc.login.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardMapper boardMapper;
	
	

	@Override
	public int insertBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub

		return boardMapper.insertBoard(boardDto);
	}

	@Override
	public List<BoardDto> selectNow() {
		// TODO Auto-generated method stub
		return boardMapper.selectNow();
	}

	@Override
	public int insertComment(ComentDto comentDto) {
		// TODO Auto-generated method stub
		return boardMapper.insertComment(comentDto);
	}

	@Override
	public List<ComentDto> selectComment(String seq) {
		// TODO Auto-generated method stub
		return boardMapper.selectComment(seq);
	}

	@Override
	public int deleteBoard(String seq) {
		// TODO Auto-generated method stub
		return boardMapper.deleteBoard(seq);
	}

	@Override
	public List<BoardDto> boardSearch(String title) {
		// TODO Auto-generated method stub
		return boardMapper.boardSearch(title);
	}

	@Override
	public int deleteComment(String seq) {
		// TODO Auto-generated method stub
		return boardMapper.deleteComment(seq);
	}

	@Override
	public int updateBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return boardMapper.updateBoard(boardDto);
	}

}

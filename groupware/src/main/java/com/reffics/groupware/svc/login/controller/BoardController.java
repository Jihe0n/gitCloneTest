package com.reffics.groupware.svc.login.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reffics.groupware.svc.login.service.BoardService;

import com.reffics.groupware.svc.login.model.BoardDto;
import com.reffics.groupware.svc.login.model.ComentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;

	

	@GetMapping("/boardGet") 
	public List<BoardDto> boardSelect() {
		
//		boardService.

		return boardService.selectNow();
	}

	@GetMapping("/boardSearch")
	public List<BoardDto> boardSearch(String title) {

		return boardService.boardSearch(title);

	}

	@PostMapping("/deleteComment") 
	public int deleteComment(@RequestBody String seq) {

		seq = seq.substring(0, seq.length()-1);
		return boardService.deleteComment(seq);

	}


	@PostMapping("/updateBoard") 
	public int updateBoard(@RequestBody BoardDto boardDto) {

		return boardService.updateBoard(boardDto) ;

	}


	@PostMapping("/boardPost") 
	public int insertBoard(@RequestBody BoardDto boardDto) {

		return boardService.insertBoard(boardDto) ;
	}

	@PostMapping("/deleteBoard") 
	public int deleteBoard(@RequestBody String seq) {

		seq = seq.substring(0, seq.length()-1);
		return boardService.deleteBoard(seq);
	}



	@PostMapping("/commentPost") 
	public int insertComment(@RequestBody ComentDto comentDto) {
		System.out.println("insert comment");
		System.out.println(comentDto.toString());
		return boardService.insertComment(comentDto) ;
	}


	@GetMapping("/commentGet")
	public List<ComentDto> selectComment(String seq) {
		System.out.println("select comment : " + seq);
		return boardService.selectComment(seq);
	}


}











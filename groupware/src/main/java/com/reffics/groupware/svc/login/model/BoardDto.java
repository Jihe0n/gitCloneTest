package com.reffics.groupware.svc.login.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardDto { // 공지 리스트 
	

	private String notiSeq;  // 순번
	private String fixStaticsCode; // 확정 상태코드
	private String lnpSeq;
	private String title;  // 제목
	private String bdy;  // 본문
	private String staDate; // 시작일자
	private String endDate;  // 종료일자
	private String actFileNm1; // 첨부파일명 1 
	private String strgActFileNm1;
	private String actFileNm2; // 첨부파일명2
	private String strgActFileNm2;
	private String actFileNm3; // 첨부파일명3
	private String strgActFileNm3;
	private String enterId;
	private String createId;	
	private String createDt;
	private String modId;
	private String modDt;
}

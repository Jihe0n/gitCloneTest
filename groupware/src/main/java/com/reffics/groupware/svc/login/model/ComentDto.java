package com.reffics.groupware.svc.login.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ComentDto {
	private String notiSeq; 
	private String boardSeq; 
	private String boardMsg; 
	private String enterId; 
	private String createId; 
	private String createDt; 
	private String modId; 
	private String modDt; 
}

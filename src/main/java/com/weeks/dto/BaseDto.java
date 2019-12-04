package com.weeks.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BaseDto {
	
	public BaseDto() {
		this.pageSize = 5;
	}
	
	private int pageNum;          //가지고올 페이지 번호
	private int pageSize;         //페이지 사이즈
	private int start;            //가지고올 번호 시작 다음
	private int end;              //가지고올 번호 마지막
	private String regpeId;       //등록자
	private String modpeId;       //변경자
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date   regDts;        //등록일
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date   modDts;        //변경일
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getRegpeId() {
		return regpeId;
	}
	public void setRegpeId(String regpeId) {
		this.regpeId = regpeId;
	}
	public String getModpeId() {
		return modpeId;
	}
	public void setModpeId(String modpeId) {
		this.modpeId = modpeId;
	}
	public Date getRegDts() {
		return regDts;
	}
	public void setRegDts(Date regDts) {
		this.regDts = regDts;
	}
	public Date getModDts() {
		return modDts;
	}
	public void setModDts(Date modDts) {
		this.modDts = modDts;
	}
	}

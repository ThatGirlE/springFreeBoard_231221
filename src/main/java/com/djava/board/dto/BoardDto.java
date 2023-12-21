package com.djava.board.dto;

import java.sql.Timestamp;

public class BoardDto {

	// 배달통 객체 dao -> db로 넘겨주는 배달통역할
	private int bnum; //게시판 글번호
	private String bname; // 게시판 글쓴이
	private String btitle; // 글 제목
	private String bcontent; // 글 내용
	private int bhit;  // 글 조회수
	private int bgroup; // 덧글 그룹
	private int bstep; // 덧글 계층
	private int bindent; // 덧글 들여쓰기
	private Timestamp bdate; //글쓴 날짜 시간
	
	
	public BoardDto(int bnum, String bname, String btitle, String bcontent, int bhit, int bgroup, int bstep,
			int bindent, Timestamp bdate) {
		super();
		this.bnum = bnum;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bhit = bhit;
		this.bgroup = bgroup;
		this.bstep = bstep;
		this.bindent = bindent;
		this.bdate = bdate;
	}
	
	
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public int getBhit() {
		return bhit;
	}
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	public int getBgroup() {
		return bgroup;
	}
	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}
	public int getBstep() {
		return bstep;
	}
	public void setBstep(int bstep) {
		this.bstep = bstep;
	}
	public int getBindent() {
		return bindent;
	}
	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	
	
	
	
}

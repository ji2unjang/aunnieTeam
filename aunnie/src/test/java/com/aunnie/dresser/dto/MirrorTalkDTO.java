package com.aunnie.dresser.dto;

public class MirrorTalkDTO {

	private int talk_no;
	private int t_like;
	private int t_views;
	private String t_title;
	private int t_writer;
	private String t_contents;
	private String t_img_path;
	
	
	
	public MirrorTalkDTO() {
		super();
	}



	public MirrorTalkDTO(int talk_no, int t_like, int t_views, String t_title, int t_writer, String t_contents,
			String t_img_path) {
		super();
		this.talk_no = talk_no;
		this.t_like = t_like;
		this.t_views = t_views;
		this.t_title = t_title;
		this.t_writer = t_writer;
		this.t_contents = t_contents;
		this.t_img_path = t_img_path;
	}



	public int getTalk_no() {
		return talk_no;
	}



	public void setTalk_no(int talk_no) {
		this.talk_no = talk_no;
	}



	public int getT_like() {
		return t_like;
	}



	public void setT_like(int t_like) {
		this.t_like = t_like;
	}



	public int getT_views() {
		return t_views;
	}



	public void setT_views(int t_views) {
		this.t_views = t_views;
	}



	public String getT_title() {
		return t_title;
	}



	public void setT_title(String t_title) {
		this.t_title = t_title;
	}



	public int getT_writer() {
		return t_writer;
	}



	public void setT_writer(int t_writer) {
		this.t_writer = t_writer;
	}



	public String getT_contents() {
		return t_contents;
	}



	public void setT_contents(String t_contents) {
		this.t_contents = t_contents;
	}



	public String getT_img_path() {
		return t_img_path;
	}



	public void setT_img_path(String t_img_path) {
		this.t_img_path = t_img_path;
	}
	
	
	
	
	
}

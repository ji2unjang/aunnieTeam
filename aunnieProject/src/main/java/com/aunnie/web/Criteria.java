package com.aunnie.web;

public class Criteria {
	private int page; //current page num.
	private int perPageNum;//the number of rows per page.
	private int totalCount;//the number of 'selectAll()'
	private int startPage;//pagination start #.
	private int endPage;//pagination end #.
	private boolean prev;// possible? page-1
	private boolean next;// possible? page+1
	private int displayPageNum = 5; //The number of items showing 
	
	public Criteria() {
		this.page=1;
		this.perPageNum=10;
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		
		int totalPages = totalCount%perPageNum==0? totalCount/perPageNum:totalCount/perPageNum+1;
		System.out.println("total Pages:: "+ totalPages);
		
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}
	
	public int getStartNo(){
		return (page-1)*perPageNum;
	}
	
	public int getEndNo(){
		return (page-1)*perPageNum+perPageNum;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "page="+page+" perPageNum="+perPageNum+" startNo="+getStartNo()+" endNo="+getEndNo();
	}
}

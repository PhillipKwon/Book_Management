package com.kkm.java;

public class Book {

	private int bookNum;
	private String bookTitle;
	private String bookCategory;
	private String bookDate;
	private boolean bookRental;

	public Book(int bookNum, String bookTitle, String bookCategory, String bookDate, Boolean bookRental) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		this.bookCategory = bookCategory;
		this.bookDate = bookDate;
		this.bookRental = bookRental;
	}

	// 도서 번호
	public int getNum() {
		return bookNum;
	}

	public void setNum(int bookNum) {
		this.bookNum = bookNum;
	}

	// 도서 제목
	public String getTitle() {
		return bookTitle;
	}

	public void setTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	// 도서 카데고리
	public String getCategory() {
		return bookCategory;
	}
	public void setCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	// 도서 입고 날짜
	public String getDate() {
		return bookDate;
	}
	public void setDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public boolean isRental() {
		return bookRental;
	}

	public void setRental(boolean bookRental) {
		this.bookRental = bookRental;
	}

	public String toString() {
		return "Book{ [번호 : " + this.bookNum + "] [제목 : " + this.bookTitle + "] [장르 : " + this.bookCategory + "] [입고 날짜 : "
				+ this.bookDate + "] [대여 가능 여부: " + this.bookRental +"] }";
	}

}
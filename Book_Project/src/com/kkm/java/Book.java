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

	// ���� ��ȣ
	public int getNum() {
		return bookNum;
	}

	public void setNum(int bookNum) {
		this.bookNum = bookNum;
	}

	// ���� ����
	public String getTitle() {
		return bookTitle;
	}

	public void setTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	// ���� ī����
	public String getCategory() {
		return bookCategory;
	}
	public void setCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	// ���� �԰� ��¥
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
		return "Book{ [��ȣ : " + this.bookNum + "] [���� : " + this.bookTitle + "] [�帣 : " + this.bookCategory + "] [�԰� ��¥ : "
				+ this.bookDate + "] [�뿩 ���� ����: " + this.bookRental +"] }";
	}

}
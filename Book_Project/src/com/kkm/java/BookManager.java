package com.kkm.java;

import java.util.Scanner;

public class BookManager {

	Scanner reader = new Scanner(System.in);
	
	Book[] books = new Book[100];
	boolean isRun = true;
	
	int selNo = 0;
	
	int count = 100;
	
	public BookManager() {
//		run();
		goManage();
	}
	
	public void run() {
		while(isRun) {
			System.out.println("========================================================\n");
			System.out.println("   1. 책 관리 | 2. 종료  \n");
			System.out.println("========================================================\n");
			selNo = getSelectNum("번호를 선택하세요 > ");
			
			switch(selNo) {
			case 1:
				goManage();
				break;
				
			case 2:
				goClose();
				break;
				
			default :
				System.out.println("등록된 메뉴가 이닙니다.");
			}
		}
	}

	//책관리 
	public void goManage() {
		System.out.println("  책 관리 모드로 전환합니다.");
		
		boolean isManage = true;
		
		while(isManage) {
			System.out.println("===============================================================================\n");
			System.out.println("   [1]책 등록 | [2]책 수정 | [3]책 삭제 | [4]책 리스트 | [5]책 대여하기 | [6]뒤로가기 | [7]뒤로가기    \n");
			System.out.println("===============================================================================\n");
			selNo = getSelectNum("번호를 선택하세요 > ");
			
			switch(selNo) {
			case 1: 
				CreateBook();
				break;
			case 2: 
				UpdateBook();
				break;
			case 3:
				DeleteBook();
				break;
			case 4:
				ShowBookList();
				break;
			case 5:
				BorrowBook();
				break;
			case 6:
				ReturnBook();
				break;
			case 7: 
				System.out.println("책 관리 모드를 종료합니다.");
				isManage = false;
				break;
			default : 
				System.out.println("등록된 메뉴가 이닙니다.");
			}//switch end
		}//while end
	}//goManage end
	
	//프로그램 종료
	public void goClose() {
		System.out.println("도서 관리 프로그램을 종료합니다.");
		isRun = false;
	}
	//도서 등록
	public void CreateBook() {
		System.out.println("1. 도서 등록");;
		String title = getData("등록할 도서의 제목을 입력해주세요 > ");
		String category = getData("등록할 도서의 장르를 입력해주세요 > ");
		String date = getData("등록할 도서의 입고 날짜를 입력해주세요 > ");
		Boolean rental = true;
		 
		for(int i = 0; i < books.length; i++) {
			if(books[i] == null) {
				count = i+1;
				books[i] = new Book(count, title, category, date, rental);
				System.out.println("등록 완료");
				break;
			}
		}
	}
	//도서 목록 출력
	public void ShowBookList() {
		System.out.println("4. 도서 목록");
		for(Book b : books) {
			if(b != null) {
				printBookinfo(b);
			}
		}
		
	}
	//도서 정보 수정
	public void UpdateBook() {
		System.out.println("2. 도서 수정");
		int bookNum = getSelectNum("수정할 도서의 관리번호를 입력하세요 > ");
		
		Book b = findBook(bookNum);
		
		if(b == null) {
			System.out.println("입력하신 관리번호의 책이 존재하지 않습니다.");
			return;
		}
		
		boolean isUpdate = true;
		
		while(isUpdate) {
			System.out.println("===============================================");
			System.out.println("1. 제목 수정 | 2. 장르 수정 | 3. 입고 날짜 수정 | 4. 뒤로 가기");
			System.out.println("===============================================");
			
			selNo = getSelectNum("번호 입력 > ");
			
			switch(selNo) {
			case 1:
				String title = getData("제목을 수정해주세요 > ");
				b.setTitle(title);
				System.out.println("제목 수정 완료");
				break;
			case 2:
				String category = getData("장르를 수정해주세요 > ");
				b.setCategory(category);
				System.out.println("장르 수정 완료");
				break;
			case 3:
				String date = getData("입고 날짜를 수정해주세요 > ");
				b.setDate(date);
				break;
			case 4:
				System.out.println("수정메뉴 종료");
				isUpdate = false;
				break;
			}
		}
	}
	
	//도서 목록에서 책 정보 삭제
	public void DeleteBook() {
		System.out.println("3. 도서 정보 삭제");
		int bookNum = getSelectNum("삭제할 도서의 관리번호를 입력하세요 > ");
		
		Book b = findBook(bookNum);
		
		if(b == null) {
			System.out.println("입력하신 관리번호의 책이 존재하지 않습니다.");
			return;
		}
		for(int i = 0;i < books.length; i++) {
			if(books[i] != null && books[i].getNum() == bookNum) {
				books[i] = null;
				System.out.println("삭제 완료");;
				return;
			}
		}
	}
	//책 정보 출력
	public void printBookinfo(Book b) {
		System.out.println(b.toString());
	}
	
	//도서관리번호로 책 정보 찾기
	public Book findBook(int num) {
		for (int i = 0; i < books.length; i++) {
			if(books[i] != null && books[i].getNum() == num) {
				return books[i];
			}
		}
		return null;
	}
	
	//입력 
	String getData(String message) {
		System.out.println(message);
		return reader.next();
	}
	
	//번호 선택 받기
	int getSelectNum(String message) {
		System.out.println(message);
		return reader.nextInt();
	}
	
	//
	public void BorrowBook() {
		System.out.println("5. 도서 대여");
		for(Book b : books) {
			if(b != null) {
				printBookinfo(b);
			}
		}
		int bookNum = getSelectNum("대여할 도서의 관리번호를 입력하세요 > ");
		Book b = findBook(bookNum);
		
		if(b == null) {
			System.out.println("입력하신 관리번호의 책이 존재하지 않습니다.");
			return;
		}
		for(int i = 0;i < books.length; i++) {
			if(books[i] != null && books[i].getNum() == bookNum) {
				if(books[i].isRental() == true) {
					books[i].setRental(false); 
					System.out.println("대여 완료");
					return;
				}else {
					System.out.println("대여 불가능한 상태입니다.");
				}
			}
		}
	}
	
	public void ReturnBook() {
		System.out.println("6. 도서 반납");
		for(Book b : books) {
			if(b != null) {
				printBookinfo(b);
			}
		}
		int bookNum = getSelectNum("반납할 도서의 관리번호를 입력하세요 > ");
		Book b = findBook(bookNum);
		
		if(b == null) {
			System.out.println("입력하신 관리번호의 책이 존재하지 않습니다.");
			return;
		}
		for(int i = 0;i < books.length; i++) {
			if(books[i] != null && books[i].getNum() == bookNum) {
				if(books[i].isRental() == false) {
					books[i].setRental(true); 
					System.out.println("반납 완료");
					return;
				}else {
					System.out.println("대여하지 않았습니다.");
				}
			}
		}
	}
	
//	//
//	public static void main(String[] args) {
//		new BookManager();
//	}
}

  
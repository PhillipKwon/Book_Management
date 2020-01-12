package Book_Package;

public class Book {

	private int bookNum;
	private String bookTitle;
	private String bookCategory;
	private String bookDate;

	public Book() {

	}

	public Book(int bookNum, String bookTitle, String bookCategory, String bookDate) {
		super();
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		this.bookCategory = bookCategory;
		this.bookDate = bookDate;
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

	public String toString() {
		return "Book{ [번호 : " + this.bookNum + "] [제목 : " + this.bookTitle + "] [장르 : " + bookCategory + "] [입고 날짜 : "
				+ this.bookDate + "] }";
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * System.out.println("Hello World!"); boolean run = true; while(run) {
	 * System.out.println("===================="); System.out.println("1. 도서관리");
	 * System.out.println("2. 종료\n"); System.out.print("선택 > ");
	 * 
	 * int selNo = new Scanner(System.in).nextInt();
	 * 
	 * System.out.println("선택한 번호 > " + selNo);
	 * 
	 * switch(selNo) { case 1: System.out.println("도서관리 페이지로 이동합니다.");
	 * 
	 * System.out.println("===================="); System.out.println("1. 도서 등록");
	 * System.out.println("2. 도서 정보 수정"); System.out.println("3. 도서 삭제");
	 * System.out.println("4. 책 리스트"); System.out.println("5. 뒤로 가기");
	 * 
	 * int selMode = new Scanner(System.in).nextInt();
	 * 
	 * if(selMode == 1) { System.out.println("도서 등록으로 이동합니다."); }
	 * 
	 * case 2: System.out.println("도서관리 프로그램을 종료합니다.");
	 * 
	 * break; } break; } }
	 */
}

//기능 1.
//프로그램 시작시 콘솔에 메뉴노출
//
//책 관리
//종료
//
//해당 기능들을 구현
//
//기능 2. 도서 관리
//도서관리 기능접속시 다음과 같은 메뉴 노출
//
//책 등록
//책 수정
//책 삭제
//책 리스트
//뒤로 가기
//
//해당기능들을 구현
//
//책은 다음과 같은 정보가 필요합니다
//책 제목
//책 번호
//책 카테고리 (IT, 인문학, 소설, 에세이 와 같은 정보)
//입고일자
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

	public String toString() {
		return "Book{ [��ȣ : " + this.bookNum + "] [���� : " + this.bookTitle + "] [�帣 : " + bookCategory + "] [�԰� ��¥ : "
				+ this.bookDate + "] }";
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * System.out.println("Hello World!"); boolean run = true; while(run) {
	 * System.out.println("===================="); System.out.println("1. ��������");
	 * System.out.println("2. ����\n"); System.out.print("���� > ");
	 * 
	 * int selNo = new Scanner(System.in).nextInt();
	 * 
	 * System.out.println("������ ��ȣ > " + selNo);
	 * 
	 * switch(selNo) { case 1: System.out.println("�������� �������� �̵��մϴ�.");
	 * 
	 * System.out.println("===================="); System.out.println("1. ���� ���");
	 * System.out.println("2. ���� ���� ����"); System.out.println("3. ���� ����");
	 * System.out.println("4. å ����Ʈ"); System.out.println("5. �ڷ� ����");
	 * 
	 * int selMode = new Scanner(System.in).nextInt();
	 * 
	 * if(selMode == 1) { System.out.println("���� ������� �̵��մϴ�."); }
	 * 
	 * case 2: System.out.println("�������� ���α׷��� �����մϴ�.");
	 * 
	 * break; } break; } }
	 */
}

//��� 1.
//���α׷� ���۽� �ֿܼ� �޴�����
//
//å ����
//����
//
//�ش� ��ɵ��� ����
//
//��� 2. ���� ����
//�������� ������ӽ� ������ ���� �޴� ����
//
//å ���
//å ����
//å ����
//å ����Ʈ
//�ڷ� ����
//
//�ش��ɵ��� ����
//
//å�� ������ ���� ������ �ʿ��մϴ�
//å ����
//å ��ȣ
//å ī�װ� (IT, �ι���, �Ҽ�, ������ �� ���� ����)
//�԰�����
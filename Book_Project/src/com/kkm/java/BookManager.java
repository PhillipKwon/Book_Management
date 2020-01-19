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
			System.out.println("   1. å ���� | 2. ����  \n");
			System.out.println("========================================================\n");
			selNo = getSelectNum("��ȣ�� �����ϼ��� > ");
			
			switch(selNo) {
			case 1:
				goManage();
				break;
				
			case 2:
				goClose();
				break;
				
			default :
				System.out.println("��ϵ� �޴��� �̴մϴ�.");
			}
		}
	}

	//å���� 
	public void goManage() {
		System.out.println("  å ���� ���� ��ȯ�մϴ�.");
		
		boolean isManage = true;
		
		while(isManage) {
			System.out.println("===============================================================================\n");
			System.out.println("   [1]å ��� | [2]å ���� | [3]å ���� | [4]å ����Ʈ | [5]å �뿩�ϱ� | [6]�ڷΰ��� | [7]�ڷΰ���    \n");
			System.out.println("===============================================================================\n");
			selNo = getSelectNum("��ȣ�� �����ϼ��� > ");
			
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
				System.out.println("å ���� ��带 �����մϴ�.");
				isManage = false;
				break;
			default : 
				System.out.println("��ϵ� �޴��� �̴մϴ�.");
			}//switch end
		}//while end
	}//goManage end
	
	//���α׷� ����
	public void goClose() {
		System.out.println("���� ���� ���α׷��� �����մϴ�.");
		isRun = false;
	}
	//���� ���
	public void CreateBook() {
		System.out.println("1. ���� ���");;
		String title = getData("����� ������ ������ �Է����ּ��� > ");
		String category = getData("����� ������ �帣�� �Է����ּ��� > ");
		String date = getData("����� ������ �԰� ��¥�� �Է����ּ��� > ");
		Boolean rental = true;
		 
		for(int i = 0; i < books.length; i++) {
			if(books[i] == null) {
				count = i+1;
				books[i] = new Book(count, title, category, date, rental);
				System.out.println("��� �Ϸ�");
				break;
			}
		}
	}
	//���� ��� ���
	public void ShowBookList() {
		System.out.println("4. ���� ���");
		for(Book b : books) {
			if(b != null) {
				printBookinfo(b);
			}
		}
		
	}
	//���� ���� ����
	public void UpdateBook() {
		System.out.println("2. ���� ����");
		int bookNum = getSelectNum("������ ������ ������ȣ�� �Է��ϼ��� > ");
		
		Book b = findBook(bookNum);
		
		if(b == null) {
			System.out.println("�Է��Ͻ� ������ȣ�� å�� �������� �ʽ��ϴ�.");
			return;
		}
		
		boolean isUpdate = true;
		
		while(isUpdate) {
			System.out.println("===============================================");
			System.out.println("1. ���� ���� | 2. �帣 ���� | 3. �԰� ��¥ ���� | 4. �ڷ� ����");
			System.out.println("===============================================");
			
			selNo = getSelectNum("��ȣ �Է� > ");
			
			switch(selNo) {
			case 1:
				String title = getData("������ �������ּ��� > ");
				b.setTitle(title);
				System.out.println("���� ���� �Ϸ�");
				break;
			case 2:
				String category = getData("�帣�� �������ּ��� > ");
				b.setCategory(category);
				System.out.println("�帣 ���� �Ϸ�");
				break;
			case 3:
				String date = getData("�԰� ��¥�� �������ּ��� > ");
				b.setDate(date);
				break;
			case 4:
				System.out.println("�����޴� ����");
				isUpdate = false;
				break;
			}
		}
	}
	
	//���� ��Ͽ��� å ���� ����
	public void DeleteBook() {
		System.out.println("3. ���� ���� ����");
		int bookNum = getSelectNum("������ ������ ������ȣ�� �Է��ϼ��� > ");
		
		Book b = findBook(bookNum);
		
		if(b == null) {
			System.out.println("�Է��Ͻ� ������ȣ�� å�� �������� �ʽ��ϴ�.");
			return;
		}
		for(int i = 0;i < books.length; i++) {
			if(books[i] != null && books[i].getNum() == bookNum) {
				books[i] = null;
				System.out.println("���� �Ϸ�");;
				return;
			}
		}
	}
	//å ���� ���
	public void printBookinfo(Book b) {
		System.out.println(b.toString());
	}
	
	//����������ȣ�� å ���� ã��
	public Book findBook(int num) {
		for (int i = 0; i < books.length; i++) {
			if(books[i] != null && books[i].getNum() == num) {
				return books[i];
			}
		}
		return null;
	}
	
	//�Է� 
	String getData(String message) {
		System.out.println(message);
		return reader.next();
	}
	
	//��ȣ ���� �ޱ�
	int getSelectNum(String message) {
		System.out.println(message);
		return reader.nextInt();
	}
	
	//
	public void BorrowBook() {
		System.out.println("5. ���� �뿩");
		for(Book b : books) {
			if(b != null) {
				printBookinfo(b);
			}
		}
		int bookNum = getSelectNum("�뿩�� ������ ������ȣ�� �Է��ϼ��� > ");
		Book b = findBook(bookNum);
		
		if(b == null) {
			System.out.println("�Է��Ͻ� ������ȣ�� å�� �������� �ʽ��ϴ�.");
			return;
		}
		for(int i = 0;i < books.length; i++) {
			if(books[i] != null && books[i].getNum() == bookNum) {
				if(books[i].isRental() == true) {
					books[i].setRental(false); 
					System.out.println("�뿩 �Ϸ�");
					return;
				}else {
					System.out.println("�뿩 �Ұ����� �����Դϴ�.");
				}
			}
		}
	}
	
	public void ReturnBook() {
		System.out.println("6. ���� �ݳ�");
		for(Book b : books) {
			if(b != null) {
				printBookinfo(b);
			}
		}
		int bookNum = getSelectNum("�ݳ��� ������ ������ȣ�� �Է��ϼ��� > ");
		Book b = findBook(bookNum);
		
		if(b == null) {
			System.out.println("�Է��Ͻ� ������ȣ�� å�� �������� �ʽ��ϴ�.");
			return;
		}
		for(int i = 0;i < books.length; i++) {
			if(books[i] != null && books[i].getNum() == bookNum) {
				if(books[i].isRental() == false) {
					books[i].setRental(true); 
					System.out.println("�ݳ� �Ϸ�");
					return;
				}else {
					System.out.println("�뿩���� �ʾҽ��ϴ�.");
				}
			}
		}
	}
	
//	//
//	public static void main(String[] args) {
//		new BookManager();
//	}
}

  
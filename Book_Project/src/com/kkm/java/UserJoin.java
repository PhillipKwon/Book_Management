package com.kkm.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class UserJoin {
	Scanner sc = new Scanner(System.in);
	List<User> users = new ArrayList<>();
	
	public UserJoin() {
		users.add(new User("test", "1234", "kkm"));
	}
	
	public void run() {
		int key = 0;
		while ((key = menu()) != 0) {
			switch (key) {
			case 1:
				Login();
				break;
			case 2:
				MemberJoin();
				break;
			case 3:
				SelectMember();
				break;
			default :
				System.out.println("��ϵ� �޴��� �̴մϴ�.");
			}
		}
	}
	
	//��ü ȸ������
	private void SelectMember() {
        Iterator<User> ite = users.iterator();
        
        while(ite.hasNext()) {
            System.out.println(ite.next() + " ");
        }
        
    }
 
	//ȸ������
    private void MemberJoin() {
        sc.nextLine();
        String id = getStrInput("               ID > ");
        String pw = getStrInput("         PassWord > ");
        String pw2 = getStrInput("Password Confirm > ");
        String name = getStrInput("           Name > ");
        
        if(idCheck(id)) {
            System.out.println("�ߺ��� ID�Դϴ�.");
        }else if(pw.equals(pw2)) {
            users.add(new User(id, pw, name));
            System.out.println(id + "�� ������ ���ϵ帳�ϴ�.");
        }else {
            System.out.println("��й�ȣ�� Ȯ�����ּ���.");
        }
        
    }
 
    //�ߺ� üũ
    private boolean idCheck(String id) {
        boolean check = true;
        User member = FindById(id);
        if(member == null)
            check = false;
        return check;
    }
 
    //ȸ������
    private void Login() {
        sc.nextLine();
        String id = getStrInput("      ID > ");
        String pw = getStrInput("PassWord > ");
        
        User member = FindById(id);
        if(member == null){
            System.out.println("��ϵ��� ���� ID�Դϴ�.");
        }else if(member.getPw().equals(pw)) {
            System.out.println("[" + member.getId() + "]�Բ��� �α��� �ϼ̽��ϴ�.");
            
            new BookManager();
            
        }else {
            System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
        }
    }
 
    private User FindById(String id) {
        for(User User : users) {
            if(User.getId().equals(id)) {
                return User;
            }
        }
        return null;
    }
 
    private String getStrInput(String msg) {
        System.out.println(msg);
        return sc.nextLine();        
    }
 
    private int menu() {
        System.out.println("�������Դϴ�.");
        return getNumInput("[1]�α��� [2]ȸ������ [3]��ü ȸ�� ���� [0]����");
    }
 
    private int getNumInput(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
 
}

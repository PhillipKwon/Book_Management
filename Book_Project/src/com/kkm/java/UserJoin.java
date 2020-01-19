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
				System.out.println("등록된 메뉴가 이닙니다.");
			}
		}
	}
	
	//전체 회원보기
	private void SelectMember() {
        Iterator<User> ite = users.iterator();
        
        while(ite.hasNext()) {
            System.out.println(ite.next() + " ");
        }
        
    }
 
	//회원가입
    private void MemberJoin() {
        sc.nextLine();
        String id = getStrInput("               ID > ");
        String pw = getStrInput("         PassWord > ");
        String pw2 = getStrInput("Password Confirm > ");
        String name = getStrInput("           Name > ");
        
        if(idCheck(id)) {
            System.out.println("중복된 ID입니다.");
        }else if(pw.equals(pw2)) {
            users.add(new User(id, pw, name));
            System.out.println(id + "님 가입을 축하드립니다.");
        }else {
            System.out.println("비밀번호를 확인해주세요.");
        }
        
    }
 
    //중복 체크
    private boolean idCheck(String id) {
        boolean check = true;
        User member = FindById(id);
        if(member == null)
            check = false;
        return check;
    }
 
    //회원가입
    private void Login() {
        sc.nextLine();
        String id = getStrInput("      ID > ");
        String pw = getStrInput("PassWord > ");
        
        User member = FindById(id);
        if(member == null){
            System.out.println("등록되지 않은 ID입니다.");
        }else if(member.getPw().equals(pw)) {
            System.out.println("[" + member.getId() + "]님께서 로그인 하셨습니다.");
            
            new BookManager();
            
        }else {
            System.out.println("비밀번호가 틀렸습니다.");
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
        System.out.println("도서관입니다.");
        return getNumInput("[1]로그인 [2]회원가입 [3]전체 회원 보기 [0]종료");
    }
 
    private int getNumInput(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
 
}

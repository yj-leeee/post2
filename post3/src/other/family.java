package other;

import java.util.Scanner;

import gongdong.number;
import gongdong.receive;

public class family {
	static Scanner scanner = new Scanner(System.in);
	static gongdong.receive noreceive = new gongdong.receive();
	static gongdong.number number = new gongdong.number();
	
	public void family() {
		// TODO Auto-generated method stub
		System.out.println("가족관계증명서를 지참하셨습니까?");
		System.out.println("네 : 1 \n아니요 : 2");
		int family = scanner.nextInt();
		scanner.nextLine();
		
		switch(family) {
		case 1 :
			number.number();
		case 2 :
			System.out.println("근처 진주경찰서 무인 발급기에서 가족관계증명서 발급이 가능합니다");
			noreceive.receive();
			break;
		}
	}

}

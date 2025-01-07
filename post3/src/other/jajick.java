package other;

import java.util.Scanner;

import gongdong.number;
import gongdong.receive;

public class jajick {
	static Scanner scanner = new Scanner(System.in);
	static gongdong.receive noreceive = new gongdong.receive();
	static gongdong.company company = new gongdong.company();
	
	public void jajick() {
		// TODO Auto-generated method stub
		System.out.println("재직증명서를 지참하셨습니까?");
		System.out.println("네 : 1 \n아니요 : 2");
		int family = scanner.nextInt();
		scanner.nextLine();
		
		switch(family) {
		case 1 :
			company.company();
		case 2 :
			System.out.println("대리인-법인 수령인 경우 재직증명서와사업증명서를 지참하셔야 등기수령이 가능합니다.");
			noreceive.receive();
		}
	}

}

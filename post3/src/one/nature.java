package one;
//개인or법인

import java.util.Scanner;

public class nature {
	static Scanner scanner = new Scanner(System.in);
	static gongdong.number number = new gongdong.number();
	static gongdong.company company = new gongdong.company();
	
	public void nature() {
		System.out.println("수령인이 개인(자연인)이십니까?");
		System.out.println("네 : 1 \n아니요 법인입니다 : 2");
		int nature = scanner.nextInt();
		scanner.nextLine();
		
		switch (nature) {
		case 1 : //본인-자연인 수령 > 번호표 발부
			number.number();
		case 2 : //본인-법인 수령 > 사업자 확인
			company.company();
		}
		
		
	}
}

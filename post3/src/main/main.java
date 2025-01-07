package main;

import java.util.Scanner;

public class main {
	static Scanner scanner = new Scanner(System.in);
	static one.sinbun sinbun = new one.sinbun();
	static other.receiveOk receiveok = new other.receiveOk();
	static gongdong.reset reset = new gongdong.reset();
	
	public static void main(String[] args) {
		System.out.println("어서오세요 진주우체국입니다.");
		System.out.println("도착증명서를 보여주시면 빠른 등기 수령이 가능합니다");
		System.out.println("본인 수령이십니까? : ");
		System.out.println("네 : 1 \n아니요 대리인 수령입니다 : 2");
		int first = scanner.nextInt();
		scanner.nextLine();
		
		switch (first) {
		case 1: //본인수령
			sinbun.sinbun();
		case 2: //대리인 수령
			receiveok.receiveOk();
			break;
		case 00: //번호표 리셋
			reset.reset();
		}
	}

}

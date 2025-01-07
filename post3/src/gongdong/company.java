package gongdong;

import java.util.Scanner;

public class company {
	static Scanner scanner = new Scanner(System.in);
	static receive noreceive = new receive();
	static number number = new number();
	
	public void company() {
		System.out.println("사업증명서를 지참하셨습니까?");
		System.out.println("네 : 1 \n아니요 : 2");
		int company = scanner.nextInt();
		scanner.nextLine();
		
		switch (company) {
		case 1 : 
			number.number();
			break;
		case 2 :
			noreceive.receive();
			break;
		}
	}
}

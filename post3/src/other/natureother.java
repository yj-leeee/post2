package other;
//개인or법인

import java.util.Scanner;

public class natureother {
	static Scanner scanner = new Scanner(System.in);
	static family family = new family();
	static jajick jajick = new jajick();
	
	public void natureother() {
		System.out.println("수령인이 개인(자연인)이십니까?");
		System.out.println("네 : 1 \n아니요 법인입니다 : 2");
		int nature = scanner.nextInt();
		scanner.nextLine();
		
		switch (nature) {
		case 1 : //대리인-자연인
			family.family();
		case 2 : //대리인-법인
			jajick.jajick();
		}
		
		
	}
}

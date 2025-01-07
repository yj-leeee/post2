package other;

import java.util.Scanner;

public class receiveOk {
//대리수령 가능?
	static Scanner scanner = new Scanner(System.in);
	static gongdong.receive noreceive = new gongdong.receive();
	static otherSinbun othersinbun = new otherSinbun();
	
	public void receiveOk() {
		System.out.println("대리 수령이 가능한 우편물 입니까?");
		System.out.println("대리 수령이 불가능한 우편물 : 법원 특송, 본인 지정 등기물(ex: 카드) \n내용증명 같은 경우 본인과 통화 후 수령이 가능합니다." );
		System.out.println("네 : 1 \n아니요 : 2");
		int reciveok  = scanner.nextInt();
		scanner.nextLine();
		
		switch(reciveok) {
		case 1 :
			othersinbun.otherSinbun();
		case 2 : //대리 수령 불가능 우편물
			System.out.println("개인 수령인 경우 본인신분증을 지참하셔야 등기수령이 가능합니다.");
			System.out.println("법인 수령인 경우 본인신분증과 사업증명서를 지참하셔야 등기수령이 가능합니다.");
			noreceive.receive();
			break;
		}
		
	}
}

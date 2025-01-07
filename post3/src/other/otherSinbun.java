package other;

import java.util.Scanner;

import one.nature;

public class otherSinbun {

	static Scanner scanner = new Scanner(System.in);
	static gongdong.receive noreceive = new gongdong.receive();
	static natureother natureOther = new natureother();
	
	public void otherSinbun() {
		// TODO Auto-generated method stub
		System.out.println("신분증을 지참하셨습니까?");
		System.out.println("네 : 1 \n아니요 : 2");
		int firstsinbun = scanner.nextInt();
		scanner.nextLine();
		
		switch(firstsinbun) {
		case 1 : //다음단계 진행
			natureOther.natureother();
		case 2 : //등기수령 불가
			System.out.println("대리인-개인 수령인 경우 대리인 신분증,가족관계증명서를 지참하셔야 등기수령이 가능합니다.");
			System.out.println("대리인-법인 수령인 경우 대리인 신분증, 재직증명서와 사업증명서를 지참하셔야 등기수령이 가능합니다.");
			noreceive.receive();
		}
		
	}

}

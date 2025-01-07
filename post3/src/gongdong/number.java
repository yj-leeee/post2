package gongdong;

public class number {
//번호표 발부
	static main.main main = new main.main();
	 public static int currentNumber = 0; // public static으로 변경
	public void number() {
		 currentNumber++; // 번호 증가
		System.out.println("고객님의 순번은" + currentNumber + "번 입니다.");
		System.out.println("");
		main.main(null);
	}
	
	}

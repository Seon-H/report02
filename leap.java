package report02;

import java.util.*; //키보드에서 입력 받은 수를 가져오는 기능을 포함

public class leap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  //scanner 생성
		
		System.out.print("연도를 입력하세요 : ");
		int y = s.nextInt();
		
		if((y%4 == 0 && y%100 != 0)|| y%400 == 0) {
			//윤년은 년도를 4,400으로 나누어 떨어질때이다. -> 100으로 나눠 떨어질때는 제외
			//|| -> OR
			System.out.println(y + "년은 윤년입니다.");
		}else
			System.out.println(y + "년은 평년입니다.");
	}
}

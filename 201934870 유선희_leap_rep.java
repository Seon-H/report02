package report02;

import java.util.*; //Ű���忡�� �Է� ���� ���� �������� ����� ����

public class leap_rep {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  //scanner ����
		
		while(true) { //�׻� true
		System.out.print("������ �Է��ϼ���(��,0���� ���� ���� �Է��ϸ� ����) : ");
		
		int y = s.nextInt();
		
		if(y <=0){ //�Է¹��� ���� 0�����̸� ���α׷��� �����Ų�� -> while�� Ż��
			System.out.println("���α׷��� �����մϴ�.");
			break; }
		
		if((y%4 == 0 && y%100 != 0)|| y%400 == 0) {
			//������ �⵵�� 4,400���� ������ ���������̴�. -> 100���� ���� ���������� ����
			//|| -> OR
			System.out.println(y + "���� �����Դϴ�.");
			
		}else
			System.out.println(y + "���� ����Դϴ�.");
		    
	}
}
}

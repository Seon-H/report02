package report02;

import java.util.*; //Ű���忡�� �Է� ���� ���� �������� ����� ����

public class leap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  //scanner ����
		
		System.out.print("������ �Է��ϼ��� : ");
		int y = s.nextInt();
		
		if((y%4 == 0 && y%100 != 0)|| y%400 == 0) {
			//������ �⵵�� 4,400���� ������ ���������̴�. -> 100���� ���� ���������� ����
			//|| -> OR
			System.out.println(y + "���� �����Դϴ�.");
		}else
			System.out.println(y + "���� ����Դϴ�.");
	}
}

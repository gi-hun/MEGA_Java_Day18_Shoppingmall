/*
 * # ���θ� [������]
 * 1. ī�װ��� �������� �Է¹޾� �Ʒ��� ���ÿ� ���� �����Ѵ�.
 * 2. ī�װ��� �� ���� ù��° ���� �����Ѵ�.
 * 3. �������� �� ���� �ι�° ���� �����Ѵ�.
 *    ��, �������� �������� �߰��� �� �ֵ��� ������(/)�� �����ڷ� �������ش�.
 * ��)
 * {
 * 		{"����", "���/����/"},
 * 		{"����", "Ȩ����/�ɸ���/"},
 * 		{"����", "�ݶ�/"},
 * 		{"����", "�Ұ��/"}
 * 		...
 * } 
 */
package day_18;

import java.util.Scanner;

public class ArrayEx44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int idx_category = 0;
		
		while(true) {

			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� ��  ����");
			System.out.println("[3]��üǰ�� ���");
			
			System.out.print(": ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("ī�װ��� �Է��Ͽ���");
				String category = sc.next();
				
				items[idx_category][0] = category;
				idx_category++;
				
			}
			else if(sel == 2) {
				for(int i = 0;i<idx_category;i++)
				{
					System.out.println("["+(i+1)+"]"+items[i][0]);
				}
				System.out.println("�߰��� ī�װ��� �Է��Ͽ���");
				String add_category = sc.next();
				
				System.out.println("�������� �Է��Ͽ���");
				String item = sc.next();
				
				for(int i = 0;i<idx_category;i++)
				{
					for(int j=1;j<3;j++)
					{
						if(add_category == items[i][0])
						{
							items[i][j] = item;
						}
					}
				}
			}
			else if(sel == 3) {
				for(int i = 0;i<idx_category;i++)
				{
					for(int j=1;j<3;j++)
					{
						System.out.print(items[i][j]+" ");
						
					}
					System.out.println();
				}
			}
			
		}
	

	}
}

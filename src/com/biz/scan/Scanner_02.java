package com.biz.scan;

import java.util.Scanner;

public class Scanner_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸�>");
		String strName = scan.nextLine(); // ���ڿ��� �Է��϶�
		
		System.out.print("��������>");
		int intKor = scan.nextInt();
		
		// nextInt() ���� Ű����� ����+Enter�� ������
		// ���ڴ� inKor ������ ��� EnterŰ�� Ű���� ����������� 
		// ������ ���־�� �ϴµ� �׷����ʰ� ��� ���ܵд�.
		
		// ������ nextLine()������ ����ڰ� �����ΰ� �Է��ϰ�
		// Enter�� �����ٰ� ������ ������ 
		// �׷��� �Է��� ��ٸ��� �ʰ� �������� ������ ������
		System.out.print("��ȭ��ȣ>");
		String strTel = scan.nextLine();
		
		System.out.println("�̸� : "+ strName);
		System.out.println("���� : "+ intKor);
		System.out.println("��ȭ��ȣ : "+ strTel);
	}

}

package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_07 {

	public static void main(String[] args) {

		/*
		 * 1���� 10���� ���� ������ �ϳ������ Ű����κ��� 1���� 10���� ���ڸ� �Է¹޾Ƽ� ������ ���ߴ� �����ۼ�
		 * 
		 * ��, ���Ƿ� ���Ḧ �����Ҷ����� ����ؼ� ���ο� ������ ����� ������ ����Ҽ� �ֵ��� �Ͻÿ�.
		 * 
		 */
		Random rnd = new Random();
		int intRnd = rnd.nextInt(10) + 1;

		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (true) {
			i++;
			System.out.print("����(1~10)�Է�, ����(--END) >> ");
			String strKey = scan.nextLine();

			if (strKey.equals("--END"))
				break;

			int intKey = Integer.valueOf(strKey.trim());

			// ���ڵ�� ������ ���߾������
			// ������ ��츦 �ǳ� �پ
			// Scanner_06 ���ٴ� �ټ� ȿ���� ����.
			
			if (intKey == intRnd) {
				System.out.println(i + "������ ���߼̳׿�");
				intRnd = rnd.nextInt(10) + 1;
				i = 0;

			} else {
				if (intKey > intRnd) {
					System.out.println("ū���� �Է��߱���");

				} else if (intKey < intRnd) {
					System.out.println("�������� �Է��߱���");

				}

			}

		}
	}
}

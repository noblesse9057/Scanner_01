package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {

	private int intNum; // �ڵ����� 0���� �ʱ�ȭ
	private Random rnd; // �ʱ�ȭ�ڵ�(= new Random();)�� �����ڷ�...
	private Scanner scan;

	// ������ �޼���
	public NumPick_03() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);

	}

	public void pickup() {

		int intRnd = rnd.nextInt(10) + 1;

		int i = 0;
		while (true) {
			i++;
			System.out.print("����(1~10)�Է�, ����(--END) >> ");
			String strKey = scan.nextLine();

			if (strKey.equals("--END"))
				break;

			int intKey = Integer.valueOf(strKey.trim());


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
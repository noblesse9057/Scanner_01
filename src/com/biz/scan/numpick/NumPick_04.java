package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_04 {

	private int intNum; // �ڵ����� 0���� �ʱ�ȭ
	private Random rnd; // �ʱ�ȭ�ڵ�(= new Random();)�� �����ڷ�...
	private Scanner scan;
	private int intRnd;
	private int i;
	private int intKey;

	public void reseti() {
		i=0;
	}
	
	public int geti() {
		return i;
	}
	// ������ �޼���
	public NumPick_04() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);

	}

	public void makeRandom() {
		intRnd = rnd.nextInt(10) + 1;
	}

	public boolean keyInput() {
		System.out.print("����(1~10)�Է�, ����(--END) >> ");
		String strKey = scan.nextLine();
		
		++i;
		
		if (strKey.equals("--END")) {
			return true;
		}
		intKey  = Integer.valueOf(strKey);
		return false;
	}

	public int pickup() {
		
		int ret = intKey - intRnd;
		if(ret==0) {
			intRnd = rnd.nextInt(10) + 1;
			// i = 0;
		}
		
		return ret;
		
		}
	}

package com.epam.unit4.main;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
        Random random  = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        printText(x, y);
        proverka(x, y);
	}

	public static int proverka(int x, int y) {
		Scanner sc = new Scanner(System.in);
		int z = 0;
		if (sc.hasNextInt()) {
    	z = sc.nextInt();
    		if (z == x*y) {
    			System.out.println("�����");
    		} else {
    			System.out.println("�������");
    		}
		}
		return z;
	}

	public static void printText(int x, int y) {
		System.out.println("���������� ����������� ������ ������� ���������");
		System.out.println("������� ����� ���� " + x + " �������� �� " +y);
	}
}
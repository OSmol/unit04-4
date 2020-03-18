package com.epam.unit4.main;

import java.util.Scanner;

public class Task03 {
	final static String usd = "usd";
	final static String eur = "eur";
	final static String rub = "rub";
	final static String byn = "byn";
	public static void main(String[] args) {
		System.out.println("����������� ��� ������������ �������� ������ �����");
		System.out.println("����� ����� �� ����� ���� �� 05.03.2020:\n" + "USD=1\n" + "EUR=0.8961\n" + "RUB=65.9854\n" + "BYN=2.2311");
		System.out.println("����� ������ �� �� ������ ��������?\n" + "������� usd, eur, rub ��� byn");
		System.out.println(">");
		String sc1 = readCurrencyFromConsole(); //����� ������ ��������
		System.out.println("������� �����");
		System.out.println(">");
		int sc2 = readQuantityFromConsole(); //����� �����
		System.out.println("�� ����� ������ �� �� ������ �������� ����  \"  " + sc2 + " - " + sc1 + "  \" ?");
		System.out.println("������� usd, eur, rub ��� byn");
		System.out.println(">");
		String sc3 = readCurrencyFromConsole(); //����� ������ ������
		convertation(sc1, sc2, sc3);
		System.out.println("�������������� ������ �� ������ �� ��������� � ��������� � ��� ���!");
	}

public static String readCurrencyFromConsole() {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext(usd) == false && sc.hasNext(eur) == false && sc.hasNext(rub) == false && sc.hasNext(byn) == false) {
		String x = sc.next();
		System.out.println("�� ������� ����� ������, ���������� ��� ���");
		System.out.println(">");
	}
    String x = sc.next();
    return x;
 }

public static int readQuantityFromConsole() {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt() == false) {
		String x = sc.next();
		System.out.println("�� ������� ����� �����, ���������� ��� ���");
		System.out.println(">");
	}
    int x = sc.nextInt();
    return x;
 }

public static String convertation(String sc1, int sc2, String sc3) {
	switch (sc1) {
	case "usd":
		if (sc3.contentEquals(eur)) {
			double coef = 0.8961;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "EUR");
		}
		if (sc3.contentEquals(rub)) {
			double coef = 65.9854;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "RUB");
		}
		if (sc3.contentEquals(byn)) {
			double coef = 2.2311;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "BYN");
		}
		break;
	case "eur":
		if (sc3.contentEquals(usd)) {
			double coef = 1.116;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "USD");
		}
		if (sc3.contentEquals(rub)) {
			double coef = 73.6366;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "RUB");
		}
		if (sc3.contentEquals(byn)) {
			double coef = 2.4898;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "BYN");
		}
		break;
	case "rub":
		if (sc3.contentEquals(usd)) {
			double coef = 0.0152;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "USD");
		}
		if (sc3.contentEquals(eur)) {
			double coef = 0.0136;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "EUR");
		}
		if (sc3.contentEquals(byn)) {
			double coef = 0.0338;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "BYN");
		}
		break;
	case "byn":
		if (sc3.contentEquals(usd)) {
			double coef = 0.4482;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "USD");
		}
		if (sc3.contentEquals(eur)) {
			double coef = 0.4016;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "EUR");
		}
		if (sc3.contentEquals(rub)) {
			double coef = 29.5753;
			System.out.println("����� � ������:  " + sc2 * coef + "  " + "RUB");
		}
		break;
	}
	return sc1;
}
}

package by.htp.home04.main;

/*
 * 2. �������� �����(������) ��� ���������� ����������� ������ �������� 
 * � ����������� ������ �������� ���� ����������� �����:
 */

public class Task02 {
	
	public static void main(String[] args) {

		int nod;
		nod = nod(120, 18);
		System.out.println("���������� ����� �������� = " + nod);
		int nok;
		nok = nok(120, 18);
		System.out.println("���������� ����� ������� = " + nok);

	}

	public static int nod(int a, int b) {
		int del1;
		int del2;
		int nod1 = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				del1 = i;
				for (int j = 1; j <= b; j++) {
					if (b % j == 0) {
						del2 = j;
						if (del1 == del2) {
							nod1 = del1;
						}
					}
				}
			}
		}
		return nod1;
	}

	public static int nok(int a, int b) {

		int _nok = (a * b) / nod(a, b);
		return _nok;
	}

}
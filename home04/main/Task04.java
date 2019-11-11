package by.htp.home04.main;

/*
 * 4. Написать метод(методы) для нахождения наименьшего общего кратного трех
 * натуральных чисел.
 */

public class Task04 {
	
	public static void main(String[] args) {
		Nok(36, 60, 96);

	}

	public static int Nok(int a, int b) {
		int a1 = a;
		int b1 = b;
		while ((a != 0) && (b != 0)) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		int k = a + b;
		int g = (a1 * b1) / k;
		return g;
	}

	public static void Nok(int a, int b, int c) {
		int p = Nok(a, b);
		int k = Nok(p, c);
		System.out.println(k);
	}

}

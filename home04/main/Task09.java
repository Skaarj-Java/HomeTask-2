package by.htp.home04.main;
/*
 * 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно
 * простыми.
 */ 

public class Task09 {
	
	public static void main(String[] args) {
		Nod(222, 31, 99);

	}

	public static int Nod(int a, int b) {
		while ((a != 0) && (b != 0)) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		int k = a + b;
		return k;
	}

	public static void Nod(int a, int b, int c) {
		int p = Nod(a, b);
		int k = Nod(a, c);
		if ((p == 1) && (k == 1)) {
			System.out.println("Числа взаимно простые");
		}else {
			System.out.println("Числа не взаимно простые");
		}
	}

}

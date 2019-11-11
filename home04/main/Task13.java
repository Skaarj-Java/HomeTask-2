package by.htp.home04.main;
/*
 * 13. Дано натуральное число N. Написать метод(методы) для формирования
 * массива, элементами которого являются цифры числа N.
 */ 

public class Task13 {
	
	public static void main(String[] args) {
		
		int n = 123;
		methodPrintMass(methodFormMass(n));
	}

	public static int[] methodFormMass(int n) {
		int k = 0;
		int m = n;
		while (m > 0) {
			m = m / 10;
			k++;
		}

		int g = 0;
		int[] mass = new int[k];
		for (int i = (k - 1); i >= 0; i--) {
			g = n % 10;
			mass[i] = g;
			n = n / 10;
		}
		return mass;
	}

	public static void methodPrintMass(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			System.out.println();
			System.out.print("Элемент номер " + i + " = " + mass[i]);
		}

		
	}

}


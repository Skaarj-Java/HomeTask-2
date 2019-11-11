package by.htp.home05.main;
/*
 * 13. Определить количество элементов последовательности натуральных чисел,
 * кратных числу М и заключенных в промежутке от L до N.
 */ 

public class Task13 {
	
	public static void main(String[] args) {
		int m = 2;
		int l = -20;
		int n = 10;

		int[] mas = new int[] { -6, -29, -1, 5, 6, 12, 14, 2};
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println();

		// нахождение максимума
		int k = 0;
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % m == 0) && (mas[i] > l) && (mas[i] < n)) {
				System.out.print(" " + mas[i]);
				k++;
			}
		}
		System.out.println();
		System.out.println(" Количество " + k);
	}

}

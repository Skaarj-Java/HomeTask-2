package by.htp.home05.main;
/*
 * Дана последовательность целых чисел а1 а2,..., аn . 
 * Выяснить, какое число встречается раньше - положительное или отрицательное.
 */

public class Task03 {
	
	public static void main(String[] args) {

		int[] mas = new int[] { 0, 1, 2, -3, 4 };

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				System.out.println("Первым встречается положительное");
				break;
			} 
			if (mas[i] < 0) {
				System.out.println("Первым встречается отрицательное");
				break;
			} 				
		}
	}


}


package by.htp.home05.main;

/*
 * Дана последовательность действительных чисел а1 а2 ,..., аn .
 * Выяснить, будет ли она возрастающей.
 */

public class Task04 {
	
public static void main(String[] args) {	
		
		int[] mas = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 7 };
		int k = 0;
		int b = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= b) {
				b = mas[i];
				k++;
			} else {
				System.out.println("Последовательность невозрастающая");
				break;
			}

		}

		if (k == mas.length) {
			System.out.println("Последовательноcть возрастающая");
		}

	}

}
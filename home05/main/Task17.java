package by.htp.home05.main;
/*
 * 17. Дана последовательность целых чисел a1, a2, ..., an. 
 * Образовать новую последовательность, выбросив из исходной те члены, 
 * которые равны min(a1, a2, ..., an.).
 */

public class Task17 {
	
	public static void main(String[] args) {

		int[] mas = new int[] { 1, 2, 3, 4, 6, 8, 1, 16 };
		for (int i = 0; i < mas.length; i++) {
			System.out.print("  " + mas[i]);
		}
		System.out.println();

		int min = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		System.out.println("Минимальный элемент " + min);

		int k = 0;
		int i = (mas.length - 1);
		while (i >= 0) {
			if (mas[i] == min) {
				k++;
			}
			i--;
		}
		System.out.println(k);

		int[] mas1 = new int[mas.length - k];
		int j = 0;
		for (i = 0; i < (mas.length - k); i++) {
			if (mas[j] != min) {
				mas1[i] = mas[j];
			} else {
				mas1[i] = mas[j+1];
				j++;
			}
			j++;
		}

		for (i = 0; i < mas1.length; i++) {
			System.out.print("  " + mas1[i]);
		}
		System.out.println();

	}

}


package by.htp.home07.main;
/*
 * Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. 
 * Посчитать количество двузначных чисел в ней.
 */

public class Task31 {
	
	public static void main(String[] args) {

		int[][] mas = new int[20][50];
		int k = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 & j == 0) {
					mas[i][j] = 0;
				} else {
					mas[i][j] = k + 1;
					k = mas[i][j];
				}

			}
		}

		Method.print(mas);
		System.out.println("Количесво двузначных "+Mrmr(mas));

	}

	public static int Mrmr(int[][] mas) {
		int h = 0;
		int h2 = 0;
		int a;
		int n;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				h2 = 0;
				a = mas[i][j];
				while (a > 0) {
					n = a % 10;
					a = (a - n) / 10;
					h2++;
				}
				if (h2 == 2) {
					h++;
				}

			}
		}

		return h;
	}

}

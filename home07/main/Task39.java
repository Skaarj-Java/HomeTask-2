package by.htp.home07.main;

/*
 * 39. Найдите произведение двух матриц.
 */

public class Task39 {

	

		public static void main(String[] args) {
			
			int[][] mas1 = new int[4][4];
			int[][] mas2 = new int[4][4];

			int[][] mas = new int[4][4];

			Method.Rand(mas1, 15);
			Method.Rand(mas2, 15);

			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = mas1[i][j] * mas2[i][j];
				}
			}
			Method.print(mas);

		}
}

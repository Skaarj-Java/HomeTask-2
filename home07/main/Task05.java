package by.htp.home07.main;
/*
 * 5. Дана матрица. Вывести на экран все четные строки, 
 * то есть с четными номерами.
 */

public class Task05 {

	public static void main(String[] args) {

		int[][] mas = new int[4][4];
		Method.Rand(mas, 10);
		Method.print(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0 && i != 0) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}

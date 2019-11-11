package by.htp.home07.main;
/*
 * 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Task06 {
	
	public static void main(String[] args) {

		int[][] mas = new int[3][4];
		Method.Rand(mas, 10);
		Method.print(mas);
		for (int i = 0; i < mas.length; i++) {

			for (int j = 1; j < mas[i].length; j = j + 2) {
				int max = mas[0][j];
				if (max > mas[mas.length - 1][j]) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		
	}

}

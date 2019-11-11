package by.htp.home07.main;
/*
 * 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task09 {
	
	public static void main(String[] args) {
		
		int[][] mas = new int[4][4];
		Method.Rand(mas, 10);
		Method.print(mas);
		
		for (int i = 0; i < mas.length; i++) {
			int j = i;

			for (j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}
	}

}

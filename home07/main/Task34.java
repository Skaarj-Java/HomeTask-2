package by.htp.home07.main;
/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
 * причем в каждом столбце число единиц равно номеру столбца.
 */

public class Task34 {
	
	public static void main(String[] args) {

		int n = 3;
		int m = 4;

		int[][] mas = new int[n][m];
		int l = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				l = j;
				for (int k = 0; k < mas.length; k++) {

					if (l == 0) {

					} else {
						mas[k][j] = 1;
						l--;
					}
				}
			}
		}

		Method.print(mas);

	}

}

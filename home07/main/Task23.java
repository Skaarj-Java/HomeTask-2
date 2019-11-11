package by.htp.home07.main;

/* 23. Сформировать квадратную матрицу порядка N по правилу:
 * и подсчитать количество положительных элементов в ней
 */

public class Task23 {
	
	public static void main(String[] args) {

		int n = 8;
		int k = 0;
		double[][] mas = new double[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = Math.sin(((double) (i * i) - (j * j)) / n);
				if (mas[i][j] > 0) {
					k++;
				}
			}
		}

		printd(mas);
		System.out.println("Количество положительных элементов " + k);

	}

	public static void printd(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%.3f   ", mas[i][j]);
			}
			System.out.println();
		}
	}

}

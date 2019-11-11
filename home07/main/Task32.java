package by.htp.home07.main;
/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task32 {
	
	public static void main(String[] args) {

		int[][] mas = new int[3][3];
		Method.Rand(mas, 15);
		Method.print(mas);

		System.out.println("По возрастанию:");
		AC(mas);
		Method.print(mas);

		System.out.println("По убыванию: ");
		DC(mas);
		Method.print(mas);

	}

	public static void AC(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				for (int k = 0; k < mas[i].length - 1; k++) {

					if (mas[i][k] > mas[i][k + 1]) {
						int n;
						n = mas[i][k];
						mas[i][k] = mas[i][k + 1];
						mas[i][k + 1] = n;
					}
				}
			}
		}
	}

	public static void DC(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				for (int k = 0; k < mas[i].length - 1; k++) {

					if (mas[i][k] < mas[i][k + 1]) {
						int n;
						n = mas[i][k];
						mas[i][k] = mas[i][k + 1];
						mas[i][k + 1] = n;
					}
				}
			}
		}
	}

}

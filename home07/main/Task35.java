package by.htp.home07.main;
/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task35 {
	
	public static void main(String[] args) {

		int[][] mas = new int[4][4];
		Method.Rand(mas, 10);
		Method.print(mas);

		int max = max(mas);
		
		System.out.println("Наибольший элемент " + max);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] % 2 != 0) {
					mas[i][j] = max;
				}
			}
		}

		Method.print(mas);

	}
	
	public static int max(int[][] mas) {
		int max = mas[0][0];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (max > mas[i][j]) {
				} else {
					max = mas[i][j];
				}
			}
		}
		return max;

}
}
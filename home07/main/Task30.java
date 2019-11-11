package by.htp.home07.main;
/*30. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 *Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

public class Task30 {
	
	public static void main(String[] args) {

		int[][] mas = new int[10][20];
		Method.Rand(mas, 15);
		Method.print(mas);

		int k = 0;
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5) {
					k++;
				}
			}
			if (k >= 3) {
				System.out.println("В строке: " + i + " число 5 встречается: " + k + " раз");
			}
			k = 0;

		}

	}

}


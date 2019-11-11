package by.htp.home07.main;
/*
 * 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7
 *  среди элементов массива.
 */

public class Task08 {
	
	public static void main(String[] args) {

		int n = 5;
		int m = 4;
		int[][] mas = new int[n][m];
		Method.Rand(mas, 10);
		Method.print(mas);
		int x = 0;
		
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] == 7) {
					x++;
				}
			}

		}
		System.out.println(x);
		
	}

}

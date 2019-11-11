package by.htp.home07.main;

/*
 * 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task10 {
	
public static void main(String[] args) {
		
		int[][] mas = new int[4][4];
		Method.Rand(mas, 10);
		Method.print(mas);
		
		int k = 3;
		int p = 1;
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(i == p) {
					System.out.print(mas[i][j] + " ");
					
				}
			
				
			}
			System.out.println();
			}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(j == k) {
					System.out.print(mas[i][j] + " ");
		
}

}
			System.out.println();
		}
}
}
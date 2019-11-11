package by.htp.home07.main;

/*
 * 28. Задана матрица неотрицательных чисел. 
 * Посчитать сумму элементов в каждом столбце. 
 * Определить,какой столбец содержит максимальную сумму
 */

public class Task28 {

	public static void main(String[] args) {

		int n = 4;
		int[][] mas = new int[n][n];
		Method.Rand(mas, 10);
		Method.print(mas);
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		
		for(int i = 0; i < mas.length;i++ ) {
			for(int j = 0; j < mas.length;j++ ) {
				if (j == 0) {
					sum1 = sum1 + mas[i][j];
				}
				if (j == 1) {
					sum2 = sum2 + mas[i][j];
				}
				if (j == 2) {
					sum3 = sum3 + mas[i][j];
				}
				if (j == 3) {
					sum4 = sum4 + mas[i][j];
				}
			}
			
		}
		int maximum = 0;
			if(sum1 > maximum) {
				maximum = sum1;
			}
			if(sum2 > maximum) {
				maximum = sum2;
			}
			if(sum3 > maximum) {
				maximum = sum3;
			}
			if(sum4 > maximum) {
				maximum = sum4;
			}
			System.out.println(maximum);
		}
	
	}
	


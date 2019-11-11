package by.htp.home07.main;
/*
 * 7. Дан двухмерный массив 5×5. 
 * Найти сумму модулей отрицательных нечетных элементов
 */

public class Task07 {

	public static void main(String[] args) {

		int[][] mas = new int[][] { 
			{ 5, 3, -1, -2, -3 }, 
			{ -5, -7, 10, 5, -5 }, 
			{ 5, 6, 10, 5, -16 }, 
			{ 3, -8, 10, -5, -1 },
			{ -34, -1489, -101, -12, -10 } 
			};;
		Method.print(mas);
        int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if (mas[i][j] < 0 && mas[i][j] % 2 != 0) {
					sum = Math.abs(mas[i][j]) + sum;
				}
			}
		}
		System.out.println("Сумма модулей отрицательных нечетных элементов = " + sum);
		
		
	}
	
}

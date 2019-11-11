package by.htp.home05.main;
/*
 * Задана последовательность N вещественных чисел. 
 * Вычислить сумму чисел, порядковые номера которых являютсяпростыми числами.
 */

public class Task12 {
	
	public static void main(String[] args) {

			double[] mas = new double[] {-10.5, -41.67, 5.5, 10.3, -5.66, -3.3, 7.77,};
			for (int i = 0; i < mas.length; i++) {
				System.out.print("  " + mas[i]);
			}
			System.out.println();

			double sum = 0;
			for (int i = 2; i < mas.length; i++) {
				if ((i == 2) || (i % 2 != 0)) {
					sum = sum + mas[i];
					System.out.print("  " + mas[i]);
				}
			}
			System.out.println();
			System.out.println("Сумма = " + sum);
		

	}	

}

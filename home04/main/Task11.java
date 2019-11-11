package by.htp.home04.main;

import java.util.Random;

/*11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */

public class Task11 {
	
	public static void main(String[] args) {

		int[] mas = new int[15];
		randMas(mas, 15);
		print(mas);
		System.out.println("Сумма элементов " + sumMas3(mas, 11, 14));

	}

	public static int sumMas3(int[] mas, int k, int m) {

		int sum = 0;
		for (int i = k; i <= m; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}
	
	public static void randMas(int[] mas, int range) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(range);

		}
	}
	
	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
	

}

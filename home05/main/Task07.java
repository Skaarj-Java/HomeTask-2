package by.htp.home05.main;
/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом.Подсчитать количество замен.
 */

public class Task07 {
	
	public static void main(String[] args) {

		int[] mas = {1,2,3,45,20,35,44,};
		int z = 25;

		print(mas);
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				j++;
			}
		}

		print(mas);
		System.out.println("Количесво замен " + j);

	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i] + " ");
	
		}
	}
}

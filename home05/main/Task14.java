package by.htp.home05.main;
/*
 * 14. Дан одномерный массив A[N]. Найти: max(a2, a4,.....a2k)+ (a1,a3,.....a2k+1)
 */

public class Task14 {
	
	public static void main(String[] args) {

		int[] mas = new int[] { 1, 2, 10, 3, 12, 14, 13, 7, 23 };
		for (int i = 0; i < mas.length; i++) {
			System.out.print("  " + mas[i]);
		}
		System.out.println();

		int max = mas[0];
		int min = mas[1];

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max && mas[i] % 2 == 0) {
				max = mas[i];
			}
			i++;
			
		}
		System.out.println("Максимальный элемент из четного порядка  " + max);

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min && mas[i] % 2 == 1) {
				min = mas[i];
			}
			i++;
		}
		System.out.println("Минимальный элемент из нечетного порядка  " + min);
		System.out.println("Сумма = " + (max + min));
	}

}


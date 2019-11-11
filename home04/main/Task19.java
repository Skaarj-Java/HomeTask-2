package by.htp.home04.main;
/*
 * 19. Написать программу, определяющую сумму n - значных чисел, содержащих
 * только нечетные цифры. Определить также, сколько четных цифр в найденной
 * сумме. Для решения задачи использовать декомпозицию.
 */

public class Task19 {
	
	public static void main(String[] args) {

		sum(23467);

	}

	public static void sum(int a) {
		int n = 0;
		int sum = 0;
		while (a > 0) {
			n = a % 10;
			a = (a - n) / 10;
			if (n % 2 != 0) {
				sum = sum + n;
			} else {
				sum = 0;
				break;
			}
		}
		System.out.println("Сумма нечетных: " + sum);
		c(sum);
	}

	public static void c(int sum) {
		int n = 0;
		int t = 0;

		while (sum > 0) {
			n = sum % 10;
			sum = (sum - n) / 10;
			if (n % 2 == 0) {
				t++;
			}
		}
		System.out.println("Количесво четных в результате: " + t);
	}

}


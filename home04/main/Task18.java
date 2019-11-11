package by.htp.home04.main;
/*
 * 18. Найти все натуральные n-значные числа, цифры в которых образуют строго
 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
 * использовать декомпозицию.
 */

public class Task18 {
	
	public static void main(String[] args) {
		int n = 1000;
		methodMass(n);
	}

	public static void methodMass(int n) {
		int[] mass = new int[n];
		for (int i = 10; i < mass.length; i++) {
			if (methodProv(i)) {
				System.out.println(i);
			} 
		}
	}

	public static boolean methodProv(int n) {
		boolean flag = true;
		int g1 = 0;
		int g2 = 0;
		while (n > 0) {
			g1 = n % 10;
			n = n / 10;
			g2 = n % 10;
			if ((g1 - g2) <= 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
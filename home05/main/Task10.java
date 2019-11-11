package by.htp.home05.main;
/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task10 {

	public static void main(String[] args) {
		int[] mass = { 1, 1, 5, 5, 5, 5, 4 };

		for (int i = 0; i < mass.length;i++ ) {
			if (mass[i] > i) {
				System.out.println(mass[i]);
			}
		}
	}
	
}

package by.htp.home05.main;
/*
 * 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, 
 * содержащую все эти числа.
 */ 

public class Task06 {
	
	public static void main(String[] args) {
		int[] mass = { 2, 4, 10, 12, 48, 53, 100, 80, 70, 44, 33, 50 };
		int min = mass[0];
		int max = mass[0];

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > max) {
				max = mass[i];
			}
			if (mass[i] < min) {
				min = mass[i];
			}
		}
		System.out.println("Наименьшая длина оси = " + (max - min));
	}

}

package by.htp.home05.main;
/*
 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
 * Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */

public class Task05 {
	
public static void main(String[] args) {
		
		int[] mas = {1,2,3,4,5,6,7,8};
		int j = 0;
			
		for(int i = 1; i < mas.length; i++) {
			if(mas[i] % 2 == 0) {
		        j++;
			}

		}
		int[] mas2 = new int[j];
		j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				mas2[j] = mas[i];
				System.out.println(mas2[j]);
				j++;
			}
		}

		
	}
	
}
package by.htp.home05.main;
/*
 * 1. В массив A [N] занесены натуральные числа. 
 * Найти сумму тех элементов, которые кратны данному К.
 */

public class Task01 {
	
	public static void main(String[] args) {
		
		int[] mas = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		int k = 2;
		for(int i = 1; i < mas.length; i++) {
			if(mas[i] % k == 0) {
			    sum = sum + mas[i];
			}
			
		}
		
		System.out.println("Сумма = " + sum);
	}


	
}

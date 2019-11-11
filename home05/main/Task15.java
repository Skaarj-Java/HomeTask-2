package by.htp.home05.main;

import java.util.Random;

/*
 * 15. Дана последовательность действительных чиселa 1,a2,...,an . 
 * Указать те ее элементы, которые принадлежат отрезку[с, d].
 */

public class Task15 {
	
public static void main(String[] args) {
		
		int[] mas = new int[10];
		int c = 10;
		int d = 50;
		randMas(mas);
		print(mas);
	
		System.out.println(" ");
		for(int i = 0; i <mas.length;i++) {
			if(mas[i] > c && mas[i] < d) {
				System.out.print(mas[i]+" ");
			}
		}
		

	}

public static void print(int[] mas) {
	for (int i = 0; i < mas.length; i++) {
		System.out.print(mas[i] + " ");

	}
}
public static void randMas(int[] mas) {
	Random rand = new Random();
	for (int i = 0; i < mas.length; i++) {
		mas[i] = rand.nextInt(100);

	}
}

}


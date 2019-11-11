package by.htp.home04.main;

import java.util.Random;

/*
* 8. Составить программу, которая в массиве A[N] находит второе по величине
* число (вывести на печать число, которое меньше максимального элемента
* массива, но больше всех других элементов).
*/ 

public class Task08 {
	
	public static void main(String[] args) {
		

		int[] mas = new int[10];
		randMas(mas, 20);
		print(mas);
		
		System.out.println("Второе по величине число в массиве " + max2(mas));
		

	}
	
	public static int max2(int [] mas) {
		
		sortMax(mas);
		int max2 = mas[1];
		return max2;
	}
	
	public static void randMas(int[] mas, int range) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(range);
		}
	}
	public static void sortMax(int[] mas) {
			for(int i = 0; i<mas.length;i++) {
				
				for(int j = 0; j<mas.length-1;j++) {
					
					if(mas[j] < mas[j+1]) { 
						int temp;
						temp = mas[j];
						mas[j] = mas[j+1];
						mas[j+1] = temp;	
					}
				}
			}
			
		}
	public static void print(int[] mas) {
			for (int i = 0; i < mas.length; i++) {
				System.out.print(mas[i] + " ");
			}
		}
}

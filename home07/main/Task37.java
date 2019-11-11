package by.htp.home07.main;

import java.util.Random;

/*
 * Переставить строки матрицы случайным образом.
 */

public class Task37 {
	
	public static void main(String[] args) {
		int[][] mas = new int[4][4];
		Method.Rand(mas, 15);
		Method.print(mas);
		System.out.println(" ");
		Method.print(randomStroka(mas));
	}
	
	public static int[][] randomStroka (int[][] mas) {
        Random ran = new Random();		
		
		    for (int i = 0; i < mas.length; i++) {
		    	int k = ran.nextInt(mas.length);
		    	int l = ran.nextInt(mas.length);
		    	mas[k] = mas[l];
		    }
		return mas;
	}
	
	}
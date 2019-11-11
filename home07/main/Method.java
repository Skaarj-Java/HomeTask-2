package by.htp.home07.main;

import java.util.Random;

public class Method {
	
	public static void main(String[] args) {
		
		

	}
	
	public static void print(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(" " + mas[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void Rand(int[][] mas, int rand) {
		Random random = new Random();
		int ran = rand;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = random.nextInt(ran);
			}
		}
	}

}

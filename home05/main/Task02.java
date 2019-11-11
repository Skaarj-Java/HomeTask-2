package by.htp.home05.main;
/*
 * В целочисленной последовательности есть нулевые элементы. 
 * Создать массив из номеров этих элементов.
 */

public class Task02 {
	
	public static void main(String[] args) {
		
		int[] mas = {1,0,2,0,0,0,3,0};
		int j = 0;
			
		for(int i = 1; i < mas.length; i++) {
			if(mas[i] == 0) {
		        j++;
			}

		}
		int[] mas2 = new int[j];
		j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				mas2[j] = i;
				System.out.println(mas2[j]);
				j++;
			}
		}

		
	}
}
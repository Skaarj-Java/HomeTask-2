package by.htp.home05.main;

/*
 * 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них.
 */

public class Task19 {
	
	
	public static void main(String[] args) {

		int[] mas = new int[] { -1, -2, 3, 3, 6, 6, 1, 1, -1, 1, 4, 5, 6, 6 };
		for (int i = 0; i < mas.length; i++) {
			System.out.print("  " + mas[i]);
		}
		System.out.println();
		
		int ch = 0;
		int max = 0;
		int k = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if ((i != j) && (mas[i] == mas[j])) {
					ch++;
				}
				if (ch > max) {
					max = ch;
					k = mas[i];
				}  
				if (ch == max) {
					max = ch;
					if (k > mas[i]) {
						k = mas[i];
					}
				}	
			}
			ch = 0;
		}
		System.out.println("Максимальное количество  " + max);
		System.out.println("Минимальное число " + ch);
	}

}
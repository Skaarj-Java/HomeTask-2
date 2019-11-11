package by.htp.home05.main;
/*
 * 20. Дан целочисленный массив с количеством элементов n. Сжать массив,
 *  выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
 *  Примечание. Дополнительный массив не использовать.
 */

public class Task20 {
	
	public static void main(String[] args) {		
		int[] mas = {1, 2, 2, 1, 3, 3, 4, 5};
		for(int i = 0; i < mas.length; i++) {
			System.out.print("  " + mas[i]);
		}
		
		System.out.println("  ");
		for (int i = 0; i < mas.length; i = i + 2) {
			System.out.print("  " + mas[i]);
			mas[i] = 0;
			System.out.print("  " + mas[i]);
		}

		
	}

}

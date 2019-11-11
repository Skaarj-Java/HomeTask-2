package by.htp.home05.main;
/*
 * 8. Дан массив действительных чисел, размерность которого N. Подсчитать,
 * сколько в нем отрицательных, положительных и нулевых элементов.
 */

public class Task08 {
	
	public static void main(String[] args) {

		int[] mas = new int[20];
		for (int i = 0; i < 20; i++) {
			mas[i] = (int) (Math.random() * 100 - 50);
			System.out.print(mas[i] + " ");
		}

		int x = 0;
		int y = 0;
		int z = 0;
		for (int i = 0; i < 20; i++) {
			if(mas[i] == 0) {
				x++;
			} else if(mas[i] > 0) {
				y++;
			} else {
				z++;
			}
		}
		System.out.println();
		System.out.println("количество нулей  " + x);
		System.out.println("количество положительных  " + y);
		System.out.println("количество отрицательных  " + z);
	}

}


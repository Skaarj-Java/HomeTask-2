package by.htp.home07.main;
/*
 * 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
 */

public class Task02 {
	
public static void main(String[] args) {
		
		int[][] mas = new int[2][3];
		Method.Rand(mas, 10);
		Method.print(mas);

	}

}

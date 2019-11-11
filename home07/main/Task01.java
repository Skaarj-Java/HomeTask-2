package by.htp.home07.main;

/* 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, 
 * чтобы в одной строке была ровно одна единица,и вывести на экран.
 */

public class Task01 {
	
public static void main(String[] args) {
		
		int[][] mas = new int[3][4];
		boolean x = true;
		
		for(int i = 0; i<mas.length;i++) {
			for(int j = 0; j<mas[i].length;j++) {
				if(x == true) {
					mas[i][j] = 1;
					x = false;
				}
				else {
					mas[i][j] = 0;
				}	
			}
			x = true;
		}
		
		print(mas);

	}

public static void print(int[][] mas) {
	for (int i = 0; i < mas.length; i++) {
		for (int j = 0; j < mas[i].length; j++) {
			System.out.print(" " + mas[i][j]);
		}
		System.out.println();
	}
}

}


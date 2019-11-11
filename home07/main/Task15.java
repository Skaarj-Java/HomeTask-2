package by.htp.home07.main;

public class Task15 {
	
	public static void main(String[] args) {

		int n = 4;
		int[][] mas = new int[4][4];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = n - j;
				}
			}
		}

		Method.print(mas);

	}

}

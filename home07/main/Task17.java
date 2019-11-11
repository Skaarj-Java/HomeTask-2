package by.htp.home07.main;

public class Task17 {
	
	public static void main(String[] args) {

		int n = 4;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 | i == mas.length - 1 | j == 0 | j == mas[i].length - 1) {
					mas[i][j] = 1;
				}
			}
		}

		Method.print(mas);

	}


}

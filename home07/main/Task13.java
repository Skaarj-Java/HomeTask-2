package by.htp.home07.main;

public class Task13 {
	
	public static void main(String[] args) {

		int n = 4;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0) {
					mas[i][j] = j + 1;
				} 
				else {
					mas[i][j] = n - j;
				}
			}
		}

		Method.print(mas);

	}

}

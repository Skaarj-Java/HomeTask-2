package by.htp.home07.main;
/*
 * 12. Получить квадратную матрицу порядка n:
 */

public class Task12 {
	
	public static void main(String[] args) {
	
	int n = 4;
	int[][] mas = new int[n][n];
	
	for(int i = 0;i < mas.length;i++) {
		for(int j = 0;j < mas[i].length;j++) {
			if(i == j) {
				mas[i][j] = i;
			}
		}
	}
	
	Method.print(mas);

}
}


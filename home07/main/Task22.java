package by.htp.home07.main;

public class Task22 {

	public static void main(String[] args) {
        int n = 8;
        int k = 0;
		
		int[][] mas = new int[n][n];

		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				mas[i][j] = j + 1 + k;			
			}
			k++;
		}
		
		for (int[] x:mas) {
			for(int s:x) {
				System.out.print(s + " ");
			}
			System.out.println("");
		}				
	}
}

package by.htp.home07.main;

public class Task21 {
	
	public static void main(String[] args) {
		int n = 4;
		
		int[][] mas = new int[n][n];

		for(int i = 0; i < n; i++) {
			for (int j = i; j >= 0; j--) {
				mas[i][j] = n - j;				
			}
		}		
		for (int[] k:mas) {
			for(int s:k) {
				System.out.print(s + " ");
			}
			System.out.println("");
		}				
	}

}

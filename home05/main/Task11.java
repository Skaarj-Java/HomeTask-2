package by.htp.home05.main;
/*
 * Даны натуральные числа а1 ,а2 ,..., аn . 
 * Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
 */

public class Task11 {
	
	public static void main(String[] args) {
        int M = 9;
        int l = 5;
        int[] mass = {23, 87, 33, 32, 30, 100, 61};
        
        if ((l > 0) && (l < (M - 1))) {
        	for (int i = 0; i < mass.length; i++) {
        		if (((mass[i] % M)) == l) {
        			System.out.print(mass[i] + " ");
        		}
        	}
        }
        
	}

}

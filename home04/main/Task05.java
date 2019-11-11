package by.htp.home04.main;
/*
 * 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех
 * чисел.
 */ 

public class Task05 {
	
	public static void main(String[] args) {
		Sum(10, 11, 20);

	}

	public static void Sum(int a, int b, int c) {
		int p = Math.max(a, b);
		int p1 = Math.max(p, c);
		int k = Math.min(a, b);
		int k1 = Math.min(k, c);
		System.out.println(p1 + k1);
	}


}

package by.htp.home04.main;
/*
 * 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше  цифр
 */

public class Task14 {
	
	public static void main(String[] args) {		
        int m = 234567;
        int n = 1234567;
        
        if (methC(m) > methC(n)) {
        	System.out.println("Первое число больше");
        } else if (methC(m) < methC(n))  {
        	System.out.println("Первое число меньше");
        } else {
        	System.out.println("Числа равны");
        }
	}
	
	public static int methC(int n) {		
		int k = 0;
		
	    while (( n  / 10) >= 0.1) {
	    	k++;
	    	n = (n / 10);	    	
	    }
	    return k;
	}

}

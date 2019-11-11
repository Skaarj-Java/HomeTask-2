package by.htp.home04.main;

/* 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */

public class Task12 {
	
	public static void main(String[] args) {

		double result;
		result = getS(2, 3, 4, 5);
		System.out.println("Площадь " + result);

	}

	public static double c(int a, int b) {
		double c1;
		c1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c1;
	}

	public static double getS(int x, int y, int l, int k) {
		
		double s1 = (x * y) / 2;
		double P = l + k + c(x, y);
		double p = P / 2;
		double s2 = Math.sqrt(p * (p - c(x, y)) * (p - l) * (p - k));
		double s = s1 + s2;
		return s;
	}

	

}

package by.htp.home04.main;

/*
 * 6. Вычислить площадь правильного шестиугольника со стороной а, используя
 * метод вычисления площади треугольника.
 */

public class Task06 {
	
	public static void main(String[] args) {

		double S = 6 * methodS(10);
		System.out.println(S);
		
	}

	public static double methodS(int a) {
		double S = ((a * a) * (Math.sqrt(3))) / 4;
		return S;
	}
	
}

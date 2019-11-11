package by.htp.home04.main;
/*
 *
 * 7. На плоскости заданы своими координатами n точек. Написать метод(методы),
 * определяющие, между какими из пар точек самое большое расстояние. Указание.
 * Координаты точек занести в массив.
 * 
 */ 

public class Task07 {
	
	public static void main(String[] args) {
		
		int[] mas = new int[] { 8, 1, 3, 3, 4, 4, 5, 4, -10, 9 };
		double result;
		result = maxL(mas);
		System.out.println("Максимальное расстояние между точками " + result);
		
		

	}

	public static double maxL(int[] mas) {

		double L1 = 0;
		double L2 = 0;
		double L3 = 0;
		double maxL = L(mas[0], mas[1], mas[2], mas[3]);

		for (int i = 0; i < mas.length - 2; i = i + 2) {
			L1 = L(mas[i], mas[i + 1], mas[i + 2], mas[i + 3]);
			for (int j = 0; j < mas.length - 2; j = j + 2) {
				L2 = L(mas[j], mas[j + 1], mas[j + 2], mas[j + 3]);

				if (L1 >= L2) {
					L3 = L1;
				} 
				else {
					L3 = L2;
				}
				if (maxL >= L3) {
				} 
				else {
					maxL = L2;
				}
			}
		}

		return maxL;
	}

	public static double L(int x1, int y1, int x2, int y2) {

		double L;
		L = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
		return L;
		
	}

}


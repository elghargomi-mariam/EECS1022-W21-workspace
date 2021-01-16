package model;

public class Circle {
	/*
	 * Utility methods: not requiring creating of objects in order to use them.
	 */
	public static double getArea(double radius) {
		double area = 0.0;
		// Correct implementation
		area = radius * radius * 3.14;
		// Wrong implementation
//		area = radius * 2 * 3.14;
		return area;
	}
}

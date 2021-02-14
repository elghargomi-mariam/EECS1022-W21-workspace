package model;

public class practice {
	
	public static int aMethod(int x, int y) {
		x *=2;
		y =  x/y;
		return x + y;
	}
	public static void method(int a, int b) {
		a = a*b;
		b = 12;
		System.out.print(a + "," + a);
	}
	public static int calc(int m) {
		final int BOUND = 7;
		final int INC = 5;
		int result = m;
		boolean cond = (m < BOUND);
		if (cond) {
			result = result - INC;			
		}else if (m == BOUND) {
			result = 7 - 2 *result;
		}else {
			result = result + INC;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(2.0*4/5 + 6/4.0);
//			int x = 2;
//			int y = 1;
//			x = aMethod(x,y);
//			System.out.print(x + "," + y);
//			y = aMethod(y+x, x);
//			System.out.print(x + "," + y);
		
//		int x = 2;
//		int y = 3;
//		System.out.print(x + "," + y);
//		method(x,y);
//		System.out.print(x + "," + y);
		
//		double a = 55/3;
//		double b = (int) 5.5 *7.7;
//		int c = 81 % 7;
//		double output= a +b +c;
//		System.out.println(output);
		
//		int x = 10, y = 0;
//		if(x++>10)
//			y = x++;
//		else
//			y = x+5;
//		System.out.println(y);
		
//	System.out.println(calc(7));
		
//		int n = 10;
//		char code = 'e';
//		switch (code) {
//		case 'a':
//		case 'A':
//			n += 1;
//			break;
//		case 'b':
//		case 'B' : 
//			n-=2;
//			break;
//		case  'c':
//		case 'C':
//			n += 2;
//			break;
//		default:
//			n = 13;
//		System.out.println(n);
//		}
		
//		int x = 10, y = 0;
//		if (x ++ >=10) {
//			y = x++;
//		}else
//			y = x++;
//		System.out.println(y);
	}

}

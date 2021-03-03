package com.infy.assignment1;
public class Quadratics{
	public void calculate(int a,int b,int c) {
		
		double determinant = b*b - 4 *a*c;
		if(determinant ==0) {
			double val = -b/(double)2*a;
			System.out.println("The root is "+val);
		}
		else if(determinant >0) {
			
			double val1 = (-b+Math.sqrt(determinant))/(double)(2*a);
			double val2 = (-b-Math.sqrt(determinant))/(double)(2*a);
			System.out.println("The roots are "+val2+" and "+val1);
		}
		else
			System.out.println("The equations does not have real roots");
	}
	public static void main(String[] args) {
		int a =2;
		int b = 5;
		int c =2;
		Quadratics d = new Quadratics();
			d.calculate(a,b,c);
	}

}

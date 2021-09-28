package math;

import java.util.Scanner;

public class simpleinterest {
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		int p,t,r,l;
		
		System.out.println("Enter principle value");
		p=s.nextInt();
		System.out.println("Enter time");
		t=s.nextInt();
		System.out.println("Enter rate of interest");
		r=s.nextInt();
		l=(p*r*t)/100;
		
		System.out.println("Simple interest of givem value is"+l);
		
		
		
	}

}

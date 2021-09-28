package math;

public class swapwithoutvariable {
	
	public static void main(String[] args) {
		
		
		int a=10,b=20;
		System.out.println("val before swap a="+a  +"b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("val of a="+a + "val of b="+b);
	}

}

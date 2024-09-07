package aug_29_;

import java.util.Scanner;

public class DataTypeDemo {

	public static void main(String[] args) {
		byte b = 90;

		System.out.println(b);
		DataTypeDemo obj = new DataTypeDemo();
	
		int c=100;
		System.out.println(c);
		obj.nat();
	}
	public void nat() {
		System.out.println("Enter a value");
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int res=(n*(n+1))/2;
		System.out.println(res);
		
	}
}

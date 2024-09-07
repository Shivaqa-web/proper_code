package aug_29_;

import java.util.Scanner;

public class StaticMethods {

	public static void nat() {
		System.out.println("Enter a numebr");
		Scanner input =new Scanner(System.in);
		int n= input.nextInt();
		int res=(n*(n+1))/2;
		System.out.println(res);
	}
public static void main(String[] args) {
	StaticMethods.nat();
}
}

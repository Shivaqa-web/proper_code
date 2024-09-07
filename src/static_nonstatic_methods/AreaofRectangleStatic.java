package static_nonstatic_methods;

import java.util.Scanner;

public class AreaofRectangleStatic {

	public static void main(String[] args) {
		AreaofRectangleStatic.Area();
		AreaofRectangleStatic.Area2(10, 20);
		System.out.println(AreaofRectangleStatic.Area3());
		System.out.println(AreaofRectangleStatic.area4(20, 30));
	}
	//No return type and No parameter 
	public static void Area() {
		System.out.println("1)No return type and No parameter ");
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the width");
	   float W=input.nextFloat();
	   System.out.println("Enter the height");
		float H=input.nextFloat();
		float A=W*H;
		System.out.println("Area of rectangle is "+A);
		
	}
	//No return-type and with parameter
	public static void Area2(float w,float h) {
		
		float Area =w*h;
		System.out.println(Area);
	}
	//With return type and without parameter
	public static float Area3() {
		System.out.println("3)With return type and without parameter");
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the width");
	   float W=input.nextFloat();
	   System.out.println("Enter the height");
		float H=input.nextFloat();
		float A=W*H;
		return A;
	}
	public static float area4(float W,float H) {
		System.out.println("4)With return type and with parameter");
		float Area =W*H;
		return Area;
		
	}
}

package static_nonstatic_methods;

import java.util.Scanner;

public class SimpleCalculations {

	public static void main(String[] args) {
		SimpleCalculations obj = new SimpleCalculations();
		obj.Simple();
		System.out.println("2)with parameter and without return type");
		System.out.println("Enyter principal");
	    Scanner op = new Scanner(System.in);
		float p = op.nextFloat();
		System.out.println("Enyter interset");
		float r = op.nextFloat();
		System.out.println("Enyter Term");
		float t = op.nextFloat();
		obj.Simple2(p, t, r);
		
		System.out.println(obj.Simple3());
		
		System.out.println(obj.Simple4(p, t, r));
	}

	// No return type and no parameter
	public void Simple() {
		System.out.println("1)No return type and no parameter");
		System.out.println("Enter the Principal");
		Scanner input = new Scanner(System.in);
		float p = input.nextFloat();
		System.out.println("Enter the InterestRate");
		float r = input.nextFloat();
		System.out.println("NumberOfTimePeriods");
		float t = input.nextFloat();
		float A = (float) (p * t * r / 100);
		System.out.println(A);
	}

	// with parameter and without return type
	public void Simple2(float p, float t, float r) {
       
		float S = (p * t * r) / 100;
		System.out.println(S);

	}
	//with return type and without parameter
	public float Simple3() {
		System.out.println("3)with return type and no parameter");
		System.out.println("Enter the Principal");
		Scanner input = new Scanner(System.in);
		float p = input.nextFloat();
		System.out.println("Enter the InterestRate");
		float r = input.nextFloat();
		System.out.println("NumberOfTimePeriods");
		float t = input.nextFloat();
		float A = (float) (p * t * r / 100);
		
		return A;
		
	}
	//with return type and with parameter
	public float Simple4(float p,float t,float r) {
		System.out.println("4)with return type and with parameter");
		float s=(p*t*r)/100;
		
		return s;
	}

}

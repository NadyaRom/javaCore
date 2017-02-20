package javaSimple;

import java.util.Scanner;


public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] arqs){
		theNearest(8.5, 10.45);
		
	}

	public static void number(int n){
		if(sc.nextInt()%2==0){
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");

		}
	}
	
	public static void theNearest(double m, double n){
		System.out.print("The nearest number to 10 is ");
		if((m-10)>(n-10)){
			System.out.println(n);
		}
		else{
			System.out.println(m);
		}
	}
	
	
	
}


package javaSimple;

import java.util.Scanner;


public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] arqs){
		while (true){
			System.out.println("1 - програма, що перевіряє і повідомляє на екран, чи є ціле число"
					+ " записане в змінну n, парним або непарним");
			System.out.println("2 - програма, щщо виводить на екран найближче до 10 з двох"
					+ " чисел, записаних в змінні m і n");

			switch (sc.nextInt()) {
			case 1:
				number(25);
				break;
			case 2:
				theNearest(8.5, 10.45);
				break;		
			default:
				sc.close();
				break;
			}
		}
		
	}

	public static void number(int n){
		if(sc.nextInt()%2==0){
			System.out.println("the number is even ");
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


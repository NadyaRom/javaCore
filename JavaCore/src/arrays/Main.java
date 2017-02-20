package arrays;

import java.util.Scanner;


public class Main {
	
	static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] arqs){
		while (true){
			System.out.println("1 - програма, що виводить на екран всі чотиризначні числа "
					+ " послідовності 1000 1003 1006 1009 1012 1015");
			System.out.println("2 - програма, що виводить на екран перші 55 елементів"
					+ " послідовності 1 3 5 7 9 11 13 15 17 ....");
			System.out.println("3 - програма, що виводить на екран всі невід'ємні елементи"
					+ " послідовності 90 85 80 75 70 65 60 ....");
			System.out.println("4 - програма, що виводить на екран перші 20 елементів"
					+ " послідовності 2 4 8 16 32 64 128 ...");
			System.out.println("5 - програма, що виводить на екран всі числа в послідовності 2a-1, де a1 = 2,"
					+ " які менше 10000.");
			System.out.println("6 - програма, що виводить на екран всі двозначні члени"
					+ " послідовності 2a+200, де a1 = -166. ");
			System.out.println("7 - факторіал введеногo числа");
			System.out.println("8 - всі позитивні дільники введеного числа");

			switch (scanner.nextInt()) {
			case 1:
				loop1();
				break;
			case 2:
				loop2();
				break;
			case 3:
				loop3();
				break;
			case 4:
				loop4();
				break;
			case 5:
				loop5();
				break;
			case 6:
				loop6();
				break;
			case 7:
				loop7();
				break;
			case 8:
				loop8();
				break;		
			default:
				scanner.close();
				break;
			}
		}
		
	}
	
	public static void loop1(){
		for(int i=1000; i<9999; i+=3){
			System.out.print(i + " ");
		}
	}
	
	public static void loop2(){
		int a=1;
		for(int i=0; i<55; i++,a+=2){
			System.out.println(a);
		}
	}
	
	public static void loop3(){
		for(int i=90; i>=0; i-=5){
			System.out.println(i);
		}
	}
	
	public static void loop4(){
		int a=2;
		for(int i=0; i<20; i++,a+=2){
			System.out.println(a);
		}
	}
	public static void loop5(){
		for(int a1=2; a1<10000; a1=2*a1-1){
			System.out.println(a1);
		}
	}
	public static void loop6(){
		for(int a1=-166; a1<=99; a1=2*a1+200){
			if(a1>=-99&a1<-9||a1>9&a1<=99){
				System.out.println(a1);
			}
		}
	}
	public static void loop7(){
		System.out.println("Enter number: ");
		int a=1;
		int b=scanner.nextInt();
		for (int k = 1; k <= b; k++) {
			a = a*k;	
		}
		System.out.println(a);
	}
	
	public static void loop8(){
		System.out.println("Enter number: ");
		int a=scanner.nextInt();
		for(int i = 1; i<=a; i++){
			if(a%i==0){
				System.out.println(i);
			}
		}
	}
}


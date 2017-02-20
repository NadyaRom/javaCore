package arrays;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String [] arqs){

		while (true){
			System.out.println();
			System.out.println("1 - cтворіть  масив з усіх парних чисел від 2 до 20 і виведіть"
					+ " елементи масиву на екран спочатку в рядок, відокремлююinчи один елемент"
					+ " від іншого прогалиною, а потім в стовпчик (відокремлюючи один елемент"
					+ " від іншого початком нового рядка). Перед створенням масиву подумайте,"
					+ " якого він буде розміру. ");

			System.out.println("2 - Створіть масив з усіх непарних чисел від 1 до 99, виведіть його"
					+ " на екран у рядок, а потім цей же масив виведіть на екран теж в рядок,"
					+ " але в зворотному порядку (99 97 95 93 ... 7 5 3 1");

			System.out.println("3 - Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9]."
					+ " Виведіть масив на екран. Підрахуйте скільки в масиві парних елементів"
					+ " і виведете цю кількість на екран на окремому рядку.");

			System.out.println("4 - Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10]."
					+ "Виведіть масив на екран у рядок. Замініть кожен елемент з непарним"
					+ "індексом на нуль. Знову виведете масив на екран на окремому рядку.");

			System.out.println("5 -  Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5]"
					+ " кожен, виведіть масиви на екран у двох окремих рядках. Порахуйте"
					+ " середнє арифметичне елементів кожного масиву і повідомте, для якого з"
					+ " масивів це значення виявилося більше (або повідомте, що їх середні"
					+ " арифметичні рівні)");

			System.out.println("7 - Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99],"
					+ " виведіть його на екран у рядок. Визначити і вивести на екран"
					+ " повідомлення про те, чи є масив строго зростаючої послідовністю" );

			System.out.println("8 -   Створіть масив з 12 випадкових цілих чисел з відрізка [-15;"
					+ " 15]. Визначте який елемент є в цьому масиві максимальним і повідомте"
					+ " індекс його останнього входження в масив."
					+ " ");

			System.out.println("9 - Створіть два масиви з 10 цілих випадкових чисел з відрізка [1;"
					+ " 9] і третій масив з 10 дійсних чисел. Кожен елемент з i-им індексом"
					+ " третього масиву повинен дорівнювати відношенню елементу з першого"
					+ " масиву з i-им індексом до елементу з другого масиву з i-им індексом."
					+ " Вивести всі три масиву на екран (кожен на окремому рядку), потім"
					+ " вивести кількість цілих елементів в третьому масиві.");

			System.out.println("10 - Створіть масив з 11 випадкових цілих чисел з"
					+ " відрізка [-1; 1], виведіть масив на екран у рядок. Визначте який"
					+ " елемент зустрічається в масиві найчастіше і виведіть про це"
					+ " повідомлення на екран. Якщо два якихось елемента зустрічаються"
					+ " однакову кількість разів, то не виводьте нічого");
			System.out.println();

			switch (scanner.nextInt()) {
			case 1:
				array1();
				break;
			case 2:
				array2();
				break;
			case 3:
				array3();
				break;
			case 4:
				array4();
				break;
			case 5:
				array5();
				break;
			case 6:
				array6();
				break;
			case 7:
				array7();
				break;
			case 8:
				array8();
				break;		
			case 9:
				array9();
				break;
			case 10:
				array10();
				break;
			default:
				scanner.close();
				break;
			}
		}


	}

	public static void array1(){
		int [] a=new int [10];
		for (int i = 0, j=2; i < a.length; i++, j+=2){
			a[i]=j;
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0;i < a.length; i++){
			System.out.println(a[i]+" ");
		}
	}
	public static void array2(){
		int [] a=new int [50];
		for (int i = 0, j=1; i < a.length; i++, j+=2){
			a[i]=j;
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = a.length-1; i >=0; i--){
			System.out.print(a[i]+" ");
		}

	}
	public static void array3(){
		int k=0;
		int[]a=new int[15];
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)Math.round(Math.random()*9);
			System.out.print(a[i]+" ");
			if(a[i]%2==0)
				k++;
		}
		System.out.println();
		System.out.println("Quantity of even numbers = "+k);
	}

	public static void array4(){
		int[]a=new int[8];
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)Math.round(Math.random()*9+1);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if(i%2!=0)
				a[i]=0;
			System.out.print(a[i]+" ");
		}
	}

	public static void array5(){
		double ave_a, ave_b;
		double sum_1=0;
		double sum_2=0;
		int[]a=new int[5];
		int[]b=new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)Math.round(Math.random()*5);
			System.out.print(a[i]+" ");
			sum_1=sum_1+a[i];
		}
		ave_a=sum_1/a.length;
		System.out.println();
		for (int j = 0; j < b.length; j++) {
			b[j]=(int)Math.round(Math.random()*5);
			System.out.print(b[j]+" ");
			sum_2=sum_2+b[j];
		}
		System.out.println();
		ave_b=sum_2/b.length;
		if(ave_a>ave_b)
			System.out.println("Average value of the first array  is bigger and equals "+ave_a);
		else if(ave_a<ave_b)
			System.out.println("Average value of the second array is bigger and equals "+ave_a);
		else 
			System.out.println("Average values of arrays are the same  "+ave_a+" = "+ave_b);

	}
	public static void array6() {
		int k=0;
		int a[] = new int [4];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 89 + 10);
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < a.length-1; i++){
			if(a[i]<a[i+1])
				k++;
		}
		System.out.println();
		if(k==a.length-1)
			System.out.println("Strictly increasing sequence");
		else if(k<a.length-1)
			System.out.println("Sequence is not increasing");

	}


	public static void array7(){
		int a[]=new int[20];
		a[0]=1;
		a[1]=1;
		for (int i =2; i < a.length; i++) {
			a[i]=a[i-1]+a[i-2];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");

		}	
	}
	public static void array8(){
		int[]a=new int[12];
		int max=0;
		int max_ind=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)Math.round(Math.random()*30-15);
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < a.length; i++){
			if(a[i]>max)
				max=a[i];
			if(a[i]== max)
				max_ind=i;
		}
		System.out.println();
		System.out.print("Max element = " + max+" "+"\n"+"Index of max element = "+max_ind);
	}

	public static void array9() {
		int []a=new int [10];
		int []b=new int [10];
		double[]c=new double [10];
		int k =0;
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)Math.round(Math.random()*8+1);
			System.out.print(a[i]+" ");	
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			b[i]=(int)Math.round(Math.random()*8+1);
			System.out.print(b[i]+" ");	
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			c[i]=Math.round(((double)a[i]/(double)b[i])*100.0)/100.0;
			if(c[i]==(int)c[i])
				k++;
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("Quantity of ints = " +k);
	}

	public static void array10(){
		int v_1=0;
		int v_2=0;
		int v_3=0;
		int[]a=new int[11];
		for (int i=0; i <a.length; i++) {
			a[i]=(int)Math.round(Math.random()*2-1);
			System.out.print(a[i]+" ");
			if(a[i]==-1)
				v_1++;
			else if(a[i]==0)
				v_2++;
			else 
				v_3++;	
		}
		System.out.println();
		if(v_1>v_2&&v_1>v_3)
			System.out.println("-1 is the most common: "+v_1+" times");
		else if(v_2>v_1&&v_2>v_3)
			System.out.println("0 is the most common: "+v_2+" times" );
		else if(v_3>v_1&&v_3>v_2)
			System.out.println("1 is the most common: "+v_3+" times" );



	}
}

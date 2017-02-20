package string;

import java.util.Scanner;

//Написати власний метод int compateTo(String str1, String str2), 
//який буде працювати точно так само, як і сompareTo в класі String. 
//Врахувати те, що стрічки можуть бути різної довжини. 
//Зробити код максимально оптимальним (вчасно припиняти роботу циклів і т.д.).

public class Main {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s1="hello"; 
		String s2="Hello"; 
		System.out.println(s1.compareTo(s2)); 
		System.out.println(myCompareTo(s1, s2)); 

	} 

	static int myCompareTo(String s1, String s2){ 
		int result=0; 
		int i= 0; 
		if(s1.startsWith(s2)||s2.startsWith(s1)){ 
			result=s1.length()-s2.length(); 
		} 
		else 
			do{ 
				if(s1.charAt(i)==s2.charAt(i))
					i++;
				if(s1.charAt(i)!=s2.charAt(i)) 
					result=s1.charAt(i)-s2.charAt(i); 
				break; 
			}while(i<s1.length()); 
		return result; 
	} 
	
		
}

	

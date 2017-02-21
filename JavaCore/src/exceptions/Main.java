package exceptions;

//	 свій Exception(MyException). Створити клас Methods, Описати в ньому методи , які б розраховували додавання, віднімання, множення, ділення двох змінних . При цьому врахувати :
//	Якщо  a<0, b<0 викидаємо IllegalArgumentException 
//	Якщо a=0 b!=0  викидаємо ArithmeticException 
//	Якщо a!=0 b=0  викидаємо ArithmeticException 
//	Якщо a=0 b=0   викидаємо IllegalAccessException 
//	Якщо a>0 b>0   викидаємо MyException 
//	Протестувати всі можливі варіанти, і вивести все на консоль.

public class Main {
	
	
	public static void main(String[] args)  {
		try {
			//method below
			minus(5,4);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

	
	public static  int add(int a, int b) throws IllegalArgumentException, IllegalAccessException, MyException{
		if(a<0&&b<0) throw new IllegalArgumentException("Number less then 0");
		if(a==0&& b!=0) throw new ArithmeticException("a=0, b!=0");
		if(a!=0&& b==0) throw new ArithmeticException("a!=0, b=0");
		if(a==0&& b==0) throw new IllegalAccessException("a=0, b=0");
		if(a>0&&b>0)throw new MyException();
		return a+b;
		
	}
	public static  int minus(int a, int b) throws IllegalArgumentException, IllegalAccessException, MyException{
		if(a<0&&b<0) throw new IllegalArgumentException("Number less then 0");
		if(a==0&& b!=0) throw new ArithmeticException("a=0, b!=0");
		if(a!=0&& b==0) throw new ArithmeticException("a=0, b!=0");
		if(a==0&& b==0) throw new IllegalAccessException("a=0, b=0");
		if(a>0&&b>0)throw new MyException();
		return a-b;
		
	}
	public static  int multiple(int a, int b) throws IllegalArgumentException, IllegalAccessException, MyException{
		if(a<0&&b<0) throw new IllegalArgumentException("Number less then 0");
		if(a==0&& b!=0) throw new ArithmeticException("a=0, b!=0");
		if(a!=0&& b==0) throw new ArithmeticException("a=0, b!=0");
		if(a==0&& b==0) throw new IllegalAccessException("a=0, b=0");
		if(a>0&&b>0)throw new MyException();
		return a*b;
		
	}
	public static  int divide(int a, int b) throws IllegalArgumentException, IllegalAccessException, MyException{
		if(a<0&&b<0) throw new IllegalArgumentException("Number less then 0");
		if(a==0&& b!=0) throw new ArithmeticException("a=0, b!=0");
		if(a!=0&& b==0) throw new ArithmeticException("a=0, b!=0");
		if(a==0&& b==0) throw new IllegalAccessException("a=0, b=0");
		if(a>0&&b>0)throw new MyException();
		return a/b;
		
	}
}

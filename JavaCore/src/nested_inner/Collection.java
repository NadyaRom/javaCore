package nested_inner;

public class Collection {
	
//	Створити інтерфейс Iterator, в якому оголосити метод hasNext(), next(). 
//	Створити клас Collection,в якого оголосити як поле масив типу Object. 
//	Створити конструктор з визначеними параметрами куди передати даний масив.
//	Створити два внутрішніх класи, які імплементуватимуть інтерфейс Iterator. 
//	Перевизначити методи так щоб:
//		Перший клас виводив значення масиву від першого до останнього. Зробити заміну непарних елементів на нуль і вивести на екран даний масив. 
//		Другий клас виводив від останнього до першого значення через одну цифру. Створити анонімний клас який повинен : 
//		Прогнати від останнього до першого елементу масиву. Перевірити кожен третій елемент масиву від останнього чи він непарний, якщо так то вивести дані елементи на консоль. 
//	Створити Локальний клас який повинен:
//		Пройтись від першого до останнього елементу масиву, перевірити кожен п’ятий елемент масиву, якщо він парний то відняти від нього число 100, і вивести на консоль 
//		ці числа.
//	Створити статичний клас який повинен:
//		Пройтись від першого до останнього елемента масиву. Перевірити кожен другий елемент масив на парність, якщо він парний, тоді зробити з нього непарний і вивести дані елементи на консоль. 


	private final Integer[] integers;
	private int  i = 0;

	public Collection(Integer[] integers) {
		this.integers = integers;
	}

	// перший внутрішній клас
	class InnerClass1 implements Iterator{

		public void array1() {
			while(hasNext()){
				System.out.print(next()+" ");
			}
		}
		public void array2(){
			while(hasNext()){
				int k=next();
				if(k%2!=0){
					k=0;
				}
				System.out.print(k + " ");
			}
		}

		@Override
		public boolean hasNext() {
			return i < integers.length;
		}

		@Override
		public int next() {
			return integers[i++];
		}  

	}
	//другий внутрішній клас
	public class InnerClass2 implements Iterator{
		int k = integers.length;
		public void array1(){
			while(hasNext()){
				System.out.print(next()+" ");
			}
		}

		@Override
		public boolean hasNext() {
			return k>0;

		}

		@Override
		public int next() {
			return integers[k-=2];
		}

	}
	//анонімний клас
	public Iterator anonymClass(){
		return new Iterator() {
			int k = integers.length;
			public void array1(){
				for (int i = integers.length-1;i>=0; i--) {
					System.out.println(integers[i]);
				}
				System.out.println();
				while(hasNext()){
					int tmp = next();
					if(tmp%2!=0){
						System.out.println(integers[i]);

					}
				}
			}

			@Override
			public int next() {
				return integers[k-=3];
			}

			@Override
			public boolean hasNext() {
				return k>0;
			}

		};

	}
	//локальний клас
	public void localClass(){
		class LocalClass{
			public void local(){
				for (int i = 4; i<integers.length;i+=5){
					if(integers[i]%2==0){
						integers[i]=integers[i]-100;
					}
				}
				System.out.println();
				for (int i = 0; i<integers.length;i++){
					System.out.print(integers[i]+" ");

				}
			}

		}
		LocalClass localClass = new LocalClass();
		localClass.local();
	}

	//статичний клас
	static class StaticClass{
		public void staticMethod(Collection myCollection){
			for (int i = 1; i < myCollection.integers.length; i+=2) {
				if(myCollection.integers[i]%2==0){
					myCollection.integers[i]=myCollection.integers[i]+1;
				}
			}
			for (int i = 0; i < myCollection.integers.length; i++) {
				System.out.print(myCollection.integers[i]+" ");
			}
		}
	}
}



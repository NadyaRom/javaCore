package composition;

public class Main {

//	Створити клас Кермо, Колесо, Кузов – описати дані класи(гетери, сетери, 
//	туСтрінг, конструктор). Додати методи які б виконували певні функції з полями
//	(наприклад збільшення діаметру колеса). Створити клас Машина, який матиме
//	деякі свої поля та об’єкти класу Кермо, Кузов, Колесо як поля класу.
//	«Обгорнути» функціональні методи композиційних класів в класі Машина.
//	В мейн методі створити клас Машина, запустити всі його методи.
	
	public static void main(String[] args) {
		Car car = new Car(new Koleso(30), new Kuzov("red"), new Kermo(true));
		System.out.println(car.koleso.getDiametr());
		System.out.println(car.increaseDiametr());

	}

}
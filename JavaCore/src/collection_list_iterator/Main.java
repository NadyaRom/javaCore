package collection_list_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

	static List<Car> cars=new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String [] arqs) {
		cars.add(new Car("Honda", new Wheel(200), new Body("Red"), new Helm(false)));
		cars.add(new Car("Toyota", new Wheel(190), new Body("Green"), new Helm(true)));
		cars.add(new Car("Mercedes", new Wheel(215), new Body("Black"), new Helm(true)));
		cars.add(new Car("Deaweo", new Wheel(190), new Body("Red"), new Helm(false)));
		cars.add(new Car("Renault", new Wheel(210), new Body("Green"), new Helm(true)));
		cars.add(new Car("Lexus", new Wheel(215), new Body("White"), new Helm(false)));
		cars.add(new Car("Lada", new Wheel(195), new Body("White"), new Helm(true)));

		method5();
	}


	//	Знайти машини, які використовують введений тип (колір) кузова.
	public static void method1(){
		System.out.println("Enter color of body: ");
		String color = sc.next();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car car = (Car) iterator.next();
			if(car.getBody().getColor().equalsIgnoreCase(color)){
				System.out.println(car);
			}

		}
	}
	//	Видалити з ліста усі машини, які мають введений колір кузова.
	public static void method2(){
		System.out.println("Enter color of body: ");
		String color = sc.next();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car car = (Car) iterator.next();
			if(car.getBody().getColor().equalsIgnoreCase(color)){
				iterator.remove();
			}

		}
	}
	
	//	Замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні колір на зелений.
	public static void method3(){
		System.out.println("Enter min diametr of wheel: ");
		int min = sc.nextInt();
		System.out.println("Enter max diametr of wheel: ");
		int max=sc.nextInt();
		int diam = sc.nextInt();
		Iterator <Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car car = (Car) iterator.next();
			if(car.getWheel().getDiametrWheel()>=min&&car.getWheel().getDiametrWheel()<=max){
				car.getBody().setColor("Green");	
		}	

	}
}
	//	Видалити усі машини, які  мають введений тип (колір) кузова та введений діапазон діаметра керма
	public static void method4(){
		System.out.println("Enter diametr of wheel: ");
		int diam = sc.nextInt();
		System.out.println("Enter color of body: ");
		String color = sc.next();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car car = (Car) iterator.next();
			if(car.getBody().getColor().equalsIgnoreCase(color)&&car.getWheel().getDiametrWheel() == diam){
				iterator.remove();	
		}
	}

	}
	
	//	Запам'ятати індекси машин, які мають введений тип(колір) кузова
	public static void method5(){
		System.out.println("Enter color of body: ");
		String color = sc.next();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car car = (Car) iterator.next();
			if(car.getBody().getColor().equalsIgnoreCase(color))
				System.out.println(cars.indexOf(car));
		}
	}
}

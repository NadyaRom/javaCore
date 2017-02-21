package collection_list;

import java.util.ArrayList;
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


	//	Знайти машини, які мають введений діаметр коліс.
	public static void method1(){
		System.out.println("Enter diametr of wheel: ");
		int diam = sc.nextInt();
		for (Car car : cars) {
			if(car.getWheel().getDiametrWheel() == diam){
				System.out.println(car);
			}

		}
	}
	//	Знайти машини, які мають введений діаметр коліс та колір кузова.
	public static void method2(){
		System.out.println("Enter diametr of wheel: ");
		int diam = sc.nextInt();
		System.out.println("Enter color of body: ");
		String color = sc.next();
		for (Car car : cars) {
			if(car.getWheel().getDiametrWheel() == diam && car.getBody().getColor().equalsIgnoreCase(color)){
				System.out.println(car);
			}

		}

	}
	//	Замінити в усіх машинах, які мають червоний колір кузова, кермо на інше.
	public static void method3(){
		System.out.println("True if you want buttons on helm/ false - if not");
		boolean helm = sc.nextBoolean();
		for (Car car : cars) {
			if(car.getBody().getColor().equalsIgnoreCase("red")){
				car.getHelm().setButtons(helm);
				System.out.println(car + " "+car.getHelm().toString());
			}

		}	

	}
	//	 Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.
	public static void method4(){
		for (Car car : cars) {
			if(car.getHelm().isButtons() == true){
				System.out.println(car + car.getWheel().toString());
				int diam = car.getWheel().getDiametrWheel()*2;
				car.getWheel().setDiametrWheel(diam);
				System.out.println(car + car.getWheel().toString()+"\n");
			}

		}


	}
	//	Замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини.
	public static void method5(){
		System.out.println("Enter diametr of wheel: ");
		int diam = sc.nextInt();
		for (Car car : cars) {
			if(car.getWheel().getDiametrWheel()<=diam){
				System.out.println( car);
				System.out.println("Enter name of the car: ");
				System.out.println("Enter diametr of wheel: ");
				System.out.println("Enter color of body: ");
				System.out.println("True if you want buttons on helm/ false - if not");
				car.setName(sc.next());
				car.setWheel(new Wheel(sc.nextInt()));
				car.setBody(new Body(sc.next()));
				car.setHelm(new Helm(sc.nextBoolean()));
				System.out.println(car+car.getWheel().toString()
						+car.getBody().toString()+car.getHelm().toString());



			}
		}
	}
}

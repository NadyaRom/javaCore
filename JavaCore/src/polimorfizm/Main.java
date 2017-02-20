package polimorfizm;

public class Main {

//	Створити interface Зарплата, в якому передбачити метод зарплата(). 
//	Створити клас Працівник з погодинною зарплатою, 
//	та Працівник з фіксованою місячною зарплатою . 
//	Формула розрахунку зарплати працівника є довільною.
//	Вивести на екран скільки заробляють перший і другий працівники.

	public static void main(String[] args) {
		EmployeeWithHourSalary em1 = new EmployeeWithHourSalary();
		EmployeeWithFixSalary em2 = new EmployeeWithFixSalary();
		System.out.println(em1.salary());
		System.out.println(em2.salary());

	}

}

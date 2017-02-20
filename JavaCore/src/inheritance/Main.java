package inheritance;

public class Main {

//	Створити клас Robot від якого слід унаслідувати CoffeRobot, RobotDancer, RobotCoocker. В Robot є метод work() , в якому слід описати роботу яку виконує кожен з роботів.
//	Для Robot в методі work() слід написати код, щоб на консоль виводився наступний текст «Я Robot – я просто працюю». 
//	Для CoffeRobot в методі work() слід написати код, щоб на консоль виводився наступний текст «Я CoffeRobot – я варю каву». 
//	Для RobotDancer в методі work() слід написати код, щоб на консоль виводився наступний текст «Я RobotDancer – я просто танцюю». 
//	Для RobotCoocker в методі work() слід написати код, щоб на консоль виводився наступний текст «Я RobotCoocker – я просто готую». 
	
	public static void main(String[] args) {
		Robot robot = new Robot();
		CoffeeRobot coffeRobot = new CoffeeRobot();
		RobotCooker robotCooker = new RobotCooker();
		RobotDancer robotDancer = new RobotDancer();
		robot.work();
		coffeRobot.work();
		robotDancer.work();
		robotCooker.work();
		
	}
}

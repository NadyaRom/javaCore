package modificators;

public class Main {
	
//	1. Створити клас MyMath. В ньому створити 2-3 константи і 3-4 статичні методи. Константи і методи повинні бути математичного характеру.
//	2. Написати клас абстрактний Pet , в якому описати абстрактний метод voice().
//	Створити класи Cow, Cat, Dog , які наслідуються від Pet.
//	Перевизначити в них метод voice(), так, щоб викликаючи його в методі main, 
//	на консоль виводилось : “Я кіт- Мяууу-Мяууу”, “Я пес- Гаууу-Гаууу”, 
//	“Я корова- Мууу-Мууу”.

	public static void main(String[] args) {
		
		Cow cow = new Cow();
		Cat cat = new Cat();
		Dog dog = new Dog();
		cow.voice();
		cat.voice();
		dog.voice();

	}

}



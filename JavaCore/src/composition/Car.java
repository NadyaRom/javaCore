package composition;

public class Car {
	
	Koleso koleso;
	Kuzov kuzov;
	Kermo kermo;
	
	
	public Car(Koleso koleso, Kuzov kuzov, Kermo kermo) {
		this.koleso = koleso;
		this.kuzov = kuzov;
		this.kermo = kermo;
	}


	public int increaseDiametr() {
		return koleso.increaseDiametr();
	}
	
	
}

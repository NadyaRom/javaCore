package composition;

public class Koleso {

	private int diametr;

	public Koleso(int diametr) {
		this.diametr = diametr;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public String toString() {
		return "Колесо [diametr=" + diametr + "]";
	}
	
	public int increaseDiametr(){
		return diametr+2;
	}
	
}

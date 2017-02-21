package collection_list;

public class Wheel {
	
	private int diametrWheel;
	
	public Wheel(int diametrWheel) {
		this.diametrWheel = diametrWheel;
	}
	
	public int getDiametrWheel() {
		return diametrWheel;
	}

	public void setDiametrWheel(int diametrWheel) {
		this.diametrWheel = diametrWheel;
	}

	
	public Wheel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Wheel [diametrWheel=" + diametrWheel  + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diametrWheel;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (diametrWheel != other.diametrWheel)
			return false;
		return true;
	}
	
	
	

}

package collection_list;

public class Helm {
	
	private boolean buttons;

	public Helm(boolean buttons) {
		this.buttons = buttons;
	}


	public Helm() {
		// TODO Auto-generated constructor stub
	}


	public boolean isButtons() {
		return buttons;
	}


	public void setButtons(boolean buttons) {
		this.buttons = buttons;
	}

	@Override
	public String toString() {
		return "Helm [buttons=" + buttons + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (buttons ? 1231 : 1237);
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
		Helm other = (Helm) obj;
		if (buttons != other.buttons)
			return false;
		return true;
	}



}
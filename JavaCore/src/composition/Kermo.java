package composition;

public class Kermo {

	private boolean buttons;

	public Kermo(boolean buttons) {
		this.buttons = buttons;
	}

	public boolean isButtons() {
		return buttons;
	}

	public void setButtons(boolean buttons) {
		this.buttons = buttons;
	}

	public String toString() {
		return "Кермо [buttons=" + buttons + "]";
	}
	

}

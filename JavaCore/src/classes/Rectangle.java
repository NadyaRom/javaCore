package classes;

public class Rectangle {

	private int length;
	
	private int width;
	
	public Rectangle() {
		this.length = 20;
		this.width = 30;
	}
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	public int  square (){
		return width*length;
	}
	
	public int parametr (){
		return 2*(width+length);
	}
}



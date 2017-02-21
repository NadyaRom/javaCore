package exceptions;

public class MyException extends IllegalArgumentException {
	
	private static final long serialVersionUID = 7500687852144923923L;

	public MyException() {
			System.err.println("a>0, b>0");
		}
	}

	
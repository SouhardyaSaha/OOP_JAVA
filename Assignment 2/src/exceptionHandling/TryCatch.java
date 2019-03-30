package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;
		
		try {
			System.out.println(x/y);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		finally {
			System.out.println("this line is in the finally block");
		}
		
		System.out.println("this line is out of the try catch block");
	}

}

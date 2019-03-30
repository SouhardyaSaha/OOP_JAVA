package exceptionHandling;

public class Throw {

	public static void main(String[] args) {
		
		try {
	      
			throw new ArithmeticException("Something went wrong!!");
		      
		   }catch (Exception exp) {
		      System.out.println("Error: " + exp);
		   }
		
	}

}

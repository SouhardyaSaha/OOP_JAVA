package exceptionHandling;

public class Throws {
	
	static int x =20, y =0;
	
	static void test() throws ArithmeticException 
    { 
        System.out.println("Inside method " + x/y); 
        throw new ArithmeticException("divided by zero"); 
    } 
	
	public static void main(String[] args) {
		
		try
        { 
            test(); 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.println("caught in main."); 
        } 
		
	}

}

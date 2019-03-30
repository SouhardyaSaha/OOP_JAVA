package multithreading;

public class ThreadOne implements Runnable {

	public static int[] sumOfThreeAndFour = new int[6];
	
	@Override
	public void run() {
		int numberThree[] = {15,16,17,18,43,13};
		int numberFour[] = {60,51,43,32,45,26};
		
		for (int i = 0; i < numberFour.length; i++) {
			sumOfThreeAndFour[i] = numberThree[i] + numberFour[i];
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}

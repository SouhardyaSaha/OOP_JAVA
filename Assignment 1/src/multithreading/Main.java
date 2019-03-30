package multithreading;

public class Main {
	public static void main(String[] args) {
		int numberOne[] = {5,6,7,8,43,3};
		int numberTwo[] = {20,1,3,2,45,6};
		
		int[] sumOfOneAndTwo = new int[6];
		
		ThreadOne obj = new ThreadOne();
		Thread t1 = new Thread(obj);
		
		t1.start();
		
		for (int i = 0; i < numberTwo.length; i++) {
			sumOfOneAndTwo[i] = numberOne[i] + numberTwo[i];
			System.out.println(Thread.currentThread().getName());
		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int finalSum = 0;
		
		for (int i = 0; i < numberTwo.length; i++) {
			finalSum = finalSum + sumOfOneAndTwo[i] + ThreadOne.sumOfThreeAndFour[i];
		}
		
		System.out.println(finalSum);
		
	}
	
}

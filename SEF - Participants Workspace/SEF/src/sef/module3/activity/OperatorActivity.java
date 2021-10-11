package sef.module3.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		
		// Subtract numbers
		int result = i-j;
		
		// Print result
		System.out.println("Difference = " + result);
		
		// Add numbers
		int sum = i + j;
		// Print result

		System.out.println("the sum is " + sum);

		// multiply

		int multi = i * j;

		System.out.println("the multiplication result is " + multi);

		double div = (double) i / (double) j;
		System.out.println("the division result is " + div);
	}

}

package coreJava;

public class Loopforeven {
	// print even numbers within the range of 100
	public static void main(String[] args) {

		for (int n = 1; n <= 100; n++) {
			if (n % 2 == 0) {
				System.out.println("even number:" + n);
			} else {
				System.out.println("odd number:" + n);

			}
		}

	}

} // for loop end

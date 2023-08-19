package day15;

public class ThrowDemo {

	void checksum(int num) 
	{
		if (num < 1) {
			throw new ArithmeticException("Number is negative, cannot calculate square...");
		} else 
		{
			System.out.println("The Square value of number is: " + (num * num));

		}

	}

	public static void main(String[] args) {
		ThrowDemo td = new ThrowDemo();
		int num= 15;
		try {
			td.checksum(num);
		} catch (Exception e) {
			System.out.println("Invalid Input Provided..");
		}
	}

}

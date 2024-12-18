package ExceptionHandling;

public class ThrowDemo {
	/* In this program we are checking the Student age
	 * if the student age<12 and weight <40 then our program 
	 * should return that the student is not eligible for registration.
	 */
	public void CheckEligibility(int age,int weight) {
		if(age<12 && weight<40) {
			throw new ArithmeticException("student not eligible");	
		}else {
			System.out.println("student eligible for registration");
		}
	}
	

	public static void main(String[] args) {
		ThrowDemo t=new ThrowDemo();
		t.CheckEligibility(20, 50);
		
	}

}

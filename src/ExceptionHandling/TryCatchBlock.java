package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		try {
			String s=null;
			System.out.println(s.length());
			
			}catch(NullPointerException e) {
				int i=10;
				int j=i/2;
				System.out.println(j);	
			}catch(ArithmeticException e) {
				String s="naveen";
				System.out.println(s.length());
				
			}finally {
				System.out.println("finally block");
			}
	}

}

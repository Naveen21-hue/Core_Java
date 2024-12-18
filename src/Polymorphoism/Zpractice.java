package Polymorphoism;

public class Zpractice extends RBI {
	
	public double getInterstRate() {
		double getInterstrate=0.5;
		return 8+getInterstrate;
		
	}
	
	


	public static void main(String[] args) {
		RBI rbi=new Zpractice();
		System.out.println(rbi.getInterstRate());
	
		
		
				

	}

}

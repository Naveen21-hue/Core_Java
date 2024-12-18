package Polymorphoism;

public class HDFC extends RBI {
	@Override
	public double getInterstRate() {
		double hdfcInterstRate=0.5;
		return 8+hdfcInterstRate;//8.5
	}

	public static void main(String[] args) {
		//upcasting //parentclass objref=new childclass();
		
		RBI r=new HDFC();
		System.out.println(r.getInterstRate());
		System.out.println(r.name);
		
	}

}
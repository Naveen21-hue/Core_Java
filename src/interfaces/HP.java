package interfaces;

public class HP implements Laptop {

	@Override
	public void copy() {
		System.out.println("Do copy action for asus laptop");


		
	}

	@Override
	public void cut() {
		System.out.println("Do cut action asus laptop");

	}

	@Override
	public void paste() {
		System.out.println("Do paste action asus latop");

		
	}

}

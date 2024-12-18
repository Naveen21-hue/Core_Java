package interfaces;

public interface Laptop {
	
	void copy();
	
	void cut();
	
	void paste();
	
	default void type() {
		System.out.println("type action method");
	}

}

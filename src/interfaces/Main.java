package interfaces;

public class Main implements First,Second{

	public static void main(String[] args) {
		Main m=new Main();
		m.print();
		
		
	}

	@Override
	public void print() {
		System.out.println("main class");
	}

}

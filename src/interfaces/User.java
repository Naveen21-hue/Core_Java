package interfaces;

public class User extends HP {

	public static void main(String[] args) {
		
		HP hp=new User();
		
		hp.copy();
		hp.paste();
		hp.cut();
		hp.paste();
		hp.type();
		

	}

}

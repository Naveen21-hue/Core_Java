package oops;

public class Manager extends Employee {
	double bonus=10000.60;
	
	public void manageteam() {
		System.out.println(" manager manage the team!");
	}
	

	public static void main(String[] args) {
		//create obj curren class
		Manager m=new Manager();
		m.manageteam();
		
	//calling child class properties
		m.setEmpName("Naveen");
		m.setEmpid(67777);
		m.setSalery(100000.00);
		
		System.out.println("Employee setails:::");
		System.out.println(m.getEmpName());
		System.out.println(m.getEmpid());
		System.out.println(m.getSalery());
		
		m.mailcheck();
		System.out.println(name);
		
		

	}

}

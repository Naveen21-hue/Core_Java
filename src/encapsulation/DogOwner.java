package encapsulation;

public class DogOwner {
	Dog tommy=new Dog();
	private String name;
	public Dog getTommy() {
		return tommy;
	}
	public void setTommy(Dog tommy) {
		this.tommy = tommy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    
	public void manageDog(String name,String color,String breed,int age) {
		//setters methods callimg assign the values
		tommy.setName(name);
		tommy.setColor(color);
		tommy.setBreed(breed);
		tommy.setAge(age);
		
		//getters methods return assign the values
		System.out.println("dog details:::");
		System.out.println("dog name :"+tommy.getName());
		System.out.println("dog color :"+tommy.getColor());
		System.out.println("dog breed :"+tommy.getBreed());
		System.out.println("dog age :"+tommy.getAge());
	}
}

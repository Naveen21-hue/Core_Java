package encapsulation;

public class StockKeeper {
	Album al=new Album();
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//parameterised constructor
	public StockKeeper(String name) {
		setName(name);
	}
	
	public void manageAlbum(String name,String Artist,double price,int copies) {
		//setters method callinng assign the values
		al.setName(name);
		al.setArtist(Artist);
		al.setPrice(price);
		al.setNumberOfCopies(copies);
		//getters methods used to return assigne values
		System.out.println("Album managed by::"+getName());
		System.out.println("Album Dtetails:");
		System.out.println("Album name :: "+al.getName());
		System.out.println("Album Artist name:"+al.getArtist());
		System.out.println("Album price:"+al.getPrice());
		System.out.println("Albuts number of copies:"+al.getNumberOfCopies());
		
		
	}

}

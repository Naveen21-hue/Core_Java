package encapsulation;

public class Album {
	private String name;
	private String artist;
    private double price;
    private int numberOfCopies;

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
		this.price = price;
		}else {
			this.price=0;
		}
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		if(numberOfCopies>0) {
		this.numberOfCopies = numberOfCopies;
		}else {
			this.numberOfCopies=0;
		}
	}
   public void sellcopies() {
	   if(numberOfCopies>0) {
		   numberOfCopies--;
		   System.out.println(" album one is sold");
		   
	   }else {
		   System.out.print(" album are not avilable");
	   }
	
}
}
  
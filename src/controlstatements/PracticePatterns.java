package controlstatements;

public class PracticePatterns {
	//print right triangle
		public static void printTriangle() {
			int n=5;
			for(int i=1;i<=n;i++) {
				
				
				for(int j=1;j<=i;j++) {
					
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		
	//left traingle
	public static void printLeftTriangle() {
		int n=5;
		for(int i=1;i<=n;i++) {       
			for(int k=i;k<n;k++) {   
				System.out.print("  ");	
			}
			
			for(int j=1;j<=i;j++) {    
				
				System.out.print("* ");
			}
			
			System.out.println();
		
	}
	}
	
	//bottom  rightDownwordTraingle
	public static void printDownWardTriangle() {
		int n=5;
		for(int i=1;i<=n;i++) {   
			
			
			for(int j=1;j<=i;j++) {    
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	

	public static void main(String[] args) {
		  //printTriangle();
		printLeftTriangle();
		// printDownWardTriangle();
		

	}

}

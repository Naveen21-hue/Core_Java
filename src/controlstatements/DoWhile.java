package controlstatements;
  // print 1 t0 5

public class DoWhile {
	public static void doWhile() {
		int i=1;  //intilization
		do {                          
			System.out.print(i+" ");   //body of the loop
			i++;
		}
		while(i<=5); 
	}
	public static void printNaturalNumbers() {
		int i=1;
		int sum=0;
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		 doWhile() ;
		// printNaturalNumbers();
		 

}
}

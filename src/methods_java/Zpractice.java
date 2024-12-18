package methods_java;

public class Zpractice {
	
	
	public static void main(String[] args) {
		
		int[] name=new int[] {10,20,40,30,40,400};
		
		int minvalue=name[0];
		
		for(int i=1;i<name.length;i++) {
			
			if(minvalue>name[i]) {
				minvalue=name[i];
				
			}
			
		}
		System.out.println(minvalue);
		
		
		
		

		
		
							
	}

}

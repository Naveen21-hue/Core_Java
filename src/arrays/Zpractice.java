package arrays;

public class Zpractice {

	public static void main(String[] args) {
		int factor=0;
		int[]a= {2,4,6,30,40,50,60,70};
		
		for(int i=0;i<a.length;i++) {
			
			int num=a[i];
			int sum=0;
			int temp=num;
			int r=0;
			
			while(num>=1) {
				
				r=num%10;
				sum=sum+r*r*r;
				num=num/10;
				
				
				
			}
			
		}
	    
		
			
	}

}

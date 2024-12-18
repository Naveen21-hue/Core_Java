package controlstatements;

public class WhilePractice {
	//print oddnumbers
	public static void printOddNumbers() {
		int i=1;
		while(i<=10) {
			if(i%2!=0) {
				System.out.print(i+" , ");
				
			}
			i++;
			
		}
		
	}
	//print Atoz alphabets
	public static void printAtoZalphabets() {
		char c='A';
		while(c<='Z') {
			System.out.print(c+" , ");	
			c++;
		}
	}
	//sum of natural nubers
	public static void printNaturalprinters() {
	
	int i=1;
	int sum=0;
	while(i<=10) {
	  
		sum=sum+i;
		i++;
		
	}
	System.out.print(sum);
	}
	

	public static void main(String[] args) {
		// printOddNumbers();
		 //printAtoZalphabets();
		 printNaturalprinters();
	
	}

}

package controlstatements;
//print 1 to 4

public class ForLoop {
	public static void PrintNumbers() {
		int i =1;
		for(i=1;i<=4;i++) {
			System.out.println(i);
			
			
		}
	}
	//matrix
	public static void PrintMatrixtable() {
		
		for(int i=1;i<=2;i++) {//1<=2||2<=2
			
			for(int j=1;j<=2;j++) {//1<=2||2<=2
				System.out.print(i+" "+j);//1 1 || 1 2 || 2 1|| 2 2 
			}
		}
	}

	public static void main(String[] args) {
		//PrintNumbers();
		//matrix
		PrintMatrixtable();
		

	}

}

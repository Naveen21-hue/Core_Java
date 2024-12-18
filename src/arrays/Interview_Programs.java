package arrays;

public class Interview_Programs {
	//find the duplicate elements in array
	public static void printDuplicatevalue() {
   //datatype[] arrayname=new datatype[]{val1,val2,......};
		int[] numbers=new int[] {10,20,40,80,20};
		
		for(int i=0;i<numbers.length;i++) { //0<5 1<5
			
			for (int j=i+1;j<numbers.length;j++) {//1<5 2<5 3<5 4<5 5<5 ||2<5
				if(numbers[i]==numbers[j]) {       //10==20,10==40,10<80 10<20 ||20==
					System.out.println(numbers[i]); 	
				}
				          
			}
		}
	}

	//find largest and smallest values in an array
	//1.largest number
	public static void findLargestSmallestValue() {
		//datatype[] arrayname={val1,val2,val3,....};
		int[] numbers= {10,40,60,100,70,500};
		int maxvalue=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(maxvalue<numbers[i]) {
				maxvalue=numbers[i];
			}
		}
		System.out.println(maxvalue);
		
	}
	//2.smallest number
	public static void findSmallest() {
		//datatype[] arrayname={val1,val2,....};
		  int[] numbers= {10,15,20,25,35,2};
		  int minvalue=numbers[0];
		  for(int i=1;i<numbers.length;i++) {  // 1<6 2<6 3<6 4<6 5<6 6<6
			  if( minvalue>numbers[i]) {      //10>15 15>20 20>25 25>35 35>2
				  minvalue=numbers[i];    //2
			  }  
		  }
		  System.out.println(minvalue);
		  
		
	}
	//3.find common elements in two arrays
	public static void findCommonElements() {
		//datatype[] arrayname={val1,val2,....};
		int[] num1= {10,20,40,60,80};
		int[] num2= {20,35,45,80,25};
		System.out.println("common elements in two arrays: " );
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num1.length;j++) {
				if(num1[i]==num2[j]) {
					System.out.print(num1[i]+ " ");
				}
			}
		}
		
		
	}
	//4.find duplicate elements in array
	public static void removeDuplicateElements() {
		//datatype[] arrayname={val1,val2,...}
		int[] num1= {2,3,5,4,2};
		System.out.println("duplicate elements in array:");
		 
		for(int i=0;i<num1.length;i++) {            //0<5
			 for(int j=i+1;j<num1.length;j++) {     //1<5 2<5 3<5 4<4 5<5
				 
			 if(num1[i]==num1[j]) {               //2==3,2==5,2==4,2==2
				 System.out.println(num1[i]);
				 
			 }
			 
				 
			 }
			 
			 }
		 }
	
			 
	
	public static void main(String[] args) {
		
		//printDuplicatevalue();
		//findLargestSmallestValue();
		//findSmallest();
		//findCommonElements();
		removeDuplicateElements();
		
	}
		

	}



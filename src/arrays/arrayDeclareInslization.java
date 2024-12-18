package arrays;

public class arrayDeclareInslization {

	public static void main(String[] args) {
		//Array declaration
		//datatype[] arrayname;
		int[] myArray;
		
		//create or initlize array
		//arrayname=new datatype[size];
		myArray=new int[4];
		
		//how to find length of an array
		//arrayname.length
		System.out.println("length of the array:"+myArray.length);
		
		//how to inserst values into array
		//arraname[index]=vaue;
		myArray[0]=37;
		myArray[1]=21;
		myArray[2]=44;
		myArray[3]=55;
		//how to accces array elements
		//arrayname[index];
		System.out.println("2nd index value:"+myArray[1]);
	
		//how to iterate the array loop using for
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		System.out.println("============================");
		//how to iterate array loop using for each loop
		//for(datatype variablename:arrayname/collentionname){  logic}
		    for(int eachnumber:myArray) {
		    	System.out.print(eachnumber+",");
		    }
		
				}

}

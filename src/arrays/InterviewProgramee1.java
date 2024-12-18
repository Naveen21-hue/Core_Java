package arrays;

import java.util.ArrayList;

public class InterviewProgramee1 {
	public static void findUnionCommonElements() {
		int[]num1= {2,4,6,5,8};
		int[]num2= {2,9,6,1,7};
		ArrayList<Integer> c1=new ArrayList<>();
		ArrayList<Integer> c2=new ArrayList<>();
		for(int num:num1) {
			c1.add(num);
		}
		for(int num:num2) {
			c2.add(num);
			
		}
		System.out.println(c1);
		System.out.println(c2);
		//c1.addAll(c2);
		//System.out.println(c1);
		
		System.out.println("====================");
		
		for(Integer n:c1) {
			if(c2.contains(n)) {
				System.out.println(n);
			}
		}
	}

	public static void main(String[] args) {
		 findUnionCommonElements();
		

	}

}

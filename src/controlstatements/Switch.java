package controlstatements;

public class  Switch {
	public static void findWorkingOrWeekend(String day) {
		switch(day) {
		
		case "monday" :
			System.out.println("it is working day:"+day);
			break;
		case "tuesday":
			System.out.println("it is working day:"+day);
			break;	
		case "wednsday":
			System.out.println("it is working day: "+day);
			break;
		case "thursday":
			System.out.println("it is working day"+day);
			break;
		case "friday":
			System.out.println("it is working day: "+day);
			break;
		case "saturday":
			System.out.println("it is holiday day: "+day);
			break;
		case "sunday":
			System.out.println("it is holiday day: "+day);
		    break;	
					
		default:
			System.out.println("invalid day");
			
			
		}
		
	}
	
	

	public static void main(String[] args) {
		findWorkingOrWeekend("sunday");
		
		}

}

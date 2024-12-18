package abstract_java;

public class SBI_ATM extends ATM_Operations{
  public double balance=500;
	

	@Override
	void deposite(double amount) {
		if(amount>0) {
		balance=balance+amount;//current balance+deposit amount
		}else {
			System.out.println("please enter valid amount");
			
		}
	}

	@Override
	void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
		
		}else {
			System.out.println("please enter valid amount");
			
		}
		
		
	}

	@Override
	double checkbalance() {
		System.out.print("avilable balance:");
		return balance;
	}
		
		
		public static void main(String[] args) {
			
			 SBI_ATM s=new  SBI_ATM ();
			 
			 s.deposite(1500.00);
			 System.out.println(s.checkbalance());
			 s.withdraw(1000.00);
			 System.out.println(s.checkbalance());
			 
			 
		
		
	}

}

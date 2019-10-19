class Account{
	protected double balance;
	//method to deposite the balance in account
	public void deposit(double in_amount){
		balance =in_amount;
	}
	//method that shows the amount after its withdrawal
	public void withdraw(double in_amount){
		
		System.out.println("Amount before withdrawal="+in_amount);
		System.out.println("Amount after withdrawal="+(balance-in_amount));
	}
}
class SavingAccount extends Account{
	private double defaultInterestRate=2.5;
        //method that returns the new balance after the added defaultInterestRate
		public double interestRate(double in_rate){
		 double a=balance+defaultInterestRate*balance; 
		 // a returns monthly amount with the added interest		 
	 return a;
	 
		}
		//method to reset the value (passed as an argument) of setDefaultInterestRate
		public void setDefaultInterestRate(double in_rate){
			defaultInterestRate=in_rate;
		}
		//mthod which shows the monthly amount with balance
		public void applyMonthlyInterest(){
			double a=balance+defaultInterestRate*balance; //a=new monthly amount with the interest
	System.out.println("THE amount along with MONTHLY INTEREST IS="+a);
	}
		
}
class Accountmain{
	public static void main(String args[]){
		SavingAccount s1=new SavingAccount(); //instance of child class that can have an access to parent's class too
		s1.deposit(100.00);
		s1.withdraw(10.00);
		
		s1.interestRate(50.00);
		s1.setDefaultInterestRate(30.00);
		s1.applyMonthlyInterest();
	}
}
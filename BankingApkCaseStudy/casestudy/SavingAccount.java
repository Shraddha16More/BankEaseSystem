package casestudy;

import java.util.Scanner;

public class SavingAccount extends Account{
	Scanner sc=new Scanner(System.in);
	static double intrestRate=2.5;
	
	
	double min_balace=10000;
	public SavingAccount(long account_no, String name, double balace) {
		super(account_no, name, balace);
	}
	

	public double getMin_balace() {
		return min_balace;
	}


	public void setMin_balace(double min_balace) {
		this.min_balace = min_balace;
	}


	@Override
	public void deposite(double amt) {
		// TODO Auto-generated method stub
//		System.out.println("Enter deposite Amount");
//		double amt=sc.nextDouble();
		this.setBalace(this.getBalace()+amt);
		System.out.println("Deposite succsesfull");
//		Transaction t=new Transaction(this.getAccount_no(),"Deposite",amt);
//		arr1[ctr1++]=t;
//		
		
	}

	@Override
	public void withdrawl(double amt) {
		// TODO Auto-generated method stub
//		System.out.println("Enter Withdrwal Amount");
//		double amt=sc.nextDouble();
		if(this.getBalace()-amt>=min_balace)
		{
			this.setBalace(this.getBalace()-amt);
			System.out.println("withdraw succsesfull");
		}
		else
		{
			System.out.println("you can withdral only:"+(this.getBalace()-min_balace));
		}
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("your Account balnce is:"+this.getBalace());
		
	}

	public void interestCal() {
		
		double intreset=(this.getBalace()+(this.getBalace()*(intrestRate/100))*3);
		System.out.println("intrest rate for saving Account is:"+intrestRate);
		System.out.println("for 3 month your balance will be"+(this.getBalace()+intreset));
	}
    
	public String toString()
	{
		String s="|"+this.getAccount_no()+"          |"+this.getName()+"                       |"+this.getBalace()+"       |";
		return s;
	}


	

}

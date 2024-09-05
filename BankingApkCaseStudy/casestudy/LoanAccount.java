package casestudy;

import java.util.Scanner;

public class LoanAccount extends Account {
	Scanner sc=new Scanner(System.in);
	double loanGiven;
	double intrestRate=2.5;
	
	public LoanAccount(long account_no, String name, double balace) {
		super(account_no, name, balace);
		double intreset=(this.getBalace()/100)*intrestRate;
		this.loanGiven = balace+intreset;
		this.setBalace(0-this.getLoanGiven());		
	}

	public double getLoanGiven() {
		return loanGiven;
	}
	
	@Override
	public void deposite(double amt)
	{
		// TODO Auto-generated method stub
//		System.out.println("Enter loan amount you want to pay: ");
//		double amt=sc.nextInt();
		if(this.getBalace()<0)
		{
			if(this.getBalace()+amt<0)
			{
				this.setBalace(this.getBalace()+amt);
				System.out.println("Deposite succsesfull");
//				Transaction t=new Transaction(this.getAccount_no(),"Deposite",amt);
//				arr1[ctr1++]=t;
			}
			
		}
		else if(this.getBalace()==0)
		{
			System.out.println("your loan is paid");
		}
	}

	@Override
	public void withdrawl(double amt)
	{
		// TODO Auto-generated method stub
		
		if(this.getBalace()==0)
		{
//			System.out.println("Amount to withdraw: ");
//			double amt=sc.nextDouble();
			this.loanGiven=this.getBalace();
			this.setBalace(0-amt);
			System.out.println("withdraw succesfull");
		}
		else
		{
			System.out.println("Previous loan pending!");
		}

	}

	@Override
	public void interestCal() 
	{
		// TODO Auto-generated method stub
		double intreset=(this.getBalace()/100)*intrestRate;
		System.out.println("intrest rate for Loan Account is:"+intreset);

	}

	@Override
	public void checkBalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("your account balance:"+this.getBalace());
		
	}
}


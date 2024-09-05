package casestudy;

import java.util.Scanner;

public class CurrentAccount extends Account{
	Scanner sc=new Scanner(System.in);
	double OverDreaftedlimit=50000;
	double OverDreaftedAmt=0;
	
	public CurrentAccount(long account_no, String name, double balace) {
		super(account_no, name, balace);
		OverDreaftedlimit=50000;
		OverDreaftedAmt=0;
	}
	
	public double getOverDreaftedlimit() {
		return OverDreaftedlimit;
	}

	public void setOverDreaftedlimit(double overDreaftedlimit) {
		OverDreaftedlimit = overDreaftedlimit;
	}

	public double getOverDreaftedAmt() {
		return OverDreaftedAmt;
	}

	public void setOverDreaftedAmt(double overDreaftedAmt) {
		OverDreaftedAmt = overDreaftedAmt;
	}

	

	@Override
	public void deposite(double amt) {
		// TODO Auto-generated method stub
//		System.out.println("Enter Deposite Amount");
//		double amt=sc.nextDouble();
		if(OverDreaftedAmt==0)
		{
			this.setBalace(this.getBalace()+amt);
		}
		else
		{
			if(amt<=OverDreaftedAmt)
			{
				this.setOverDreaftedAmt(this.getOverDreaftedAmt()-amt);
				this.setOverDreaftedlimit(this.getOverDreaftedlimit()+amt);
			}
			else
			{
				this.setOverDreaftedlimit(this.getOverDreaftedAmt()+this.getOverDreaftedlimit());
				//amt=amt-OverDreaftedAmt;
				this.setBalace(amt-this.getOverDreaftedAmt());
				this.setOverDreaftedAmt(0);;
			}
			
		}
		
	}

	@Override
	public void withdrawl(double amt) {
		// TODO Auto-generated method stub
//		System.out.println("Enter Withdraw Amount");
//		double amt=sc.nextDouble();
		if(this.getBalace()>=amt)
		{
			this.setBalace(this.getBalace()-amt);
			System.out.println("withdraw sucssesfull");
			return;
		}
		else if((this.getOverDreaftedlimit()+this.getBalace())>=amt)
		{
			amt=amt-this.getBalace();
			this.setOverDreaftedAmt(this.getOverDreaftedAmt()+amt);
			this.setBalace(0);
			this.setOverDreaftedlimit(this.getOverDreaftedlimit()-amt);
			System.out.println("withdraw sucssesfull");
			return;
		}
		else
		{
			//System.out.println("your amount is cross the overdraft limit");
			System.out.println("you can withdraw only :"+(this.getBalace()+this.getOverDreaftedlimit()));
		}
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		if(OverDreaftedAmt==0)
		{
		System.out.println("your Account balnce is:"+this.getBalace());
		}
		else
		{
			System.out.println("your Account balnce is:"+this.getBalace());
			System.out.println("your OverDreaftedAmt balnce is:"+this.getOverDreaftedAmt());
		}
	}

	@Override
	public void interestCal() {
		// TODO Auto-generated method stub
		System.out.println("current Account is not eligible to calculate rate of Intrest");
	}

	public String toString()
	{
		String s="|"+this.getAccount_no()+"          |"+this.getName()+"                       |"+this.getBalace()+"       |";
		return s;
	}

}

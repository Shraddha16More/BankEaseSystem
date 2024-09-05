package casestudy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SalaryAcount extends Account{
	Scanner sc=new Scanner(System.in);
	static double intrestRate=2;
	int TimeLimit=2;
	
	LocalDate nowDate;
	LocalDate lastTractionADate;
	public SalaryAcount(long account_no, String name, double balace,String lastTractionADate ) {
		super(account_no, name, balace);
		this.lastTractionADate=LocalDate.parse(lastTractionADate);
	}


	public LocalDate getLastTractionADate() {
		return lastTractionADate;
	}

	public void setLastTractionADate(LocalDate lastTractionADate) {
		this.lastTractionADate = lastTractionADate;
	}
	
	
	@Override
	public void deposite(double amt) {
		// TODO Auto-generated method stub
		//long diff=frozen();
		
//			System.out.println("Enter deposite Amount");
//			double amt=sc.nextDouble();
			this.setBalace(this.getBalace()+amt);
			System.out.println("Enter todays date in yyyy-mm-dd format");
			String date=sc.next();
			this.setLastTractionADate(LocalDate.parse(date));	
//			Transaction t=new Transaction(this.getAccount_no(),"Deposite",amt);
//			arr1[ctr1++]=t;
		
	}

	@Override
	public void withdrawl(double amt) {
		// TODO Auto-generated method stub
		
		//System.out.println("Enter today date");
		//LocalDate toDaysDate-LocalDate.parse(str);
		long diff=frozen();
		if(diff<TimeLimit)
		{
//			System.out.println("Enter Withdrwal Amount");
//			double amt=sc.nextDouble();
			if(this.getBalace()-amt>=0)
			{
				this.setBalace(this.getBalace()-amt);
				System.out.println("Enter todays date in yyyy-mm-dd format");
				String date=sc.next();
				this.setLastTractionADate(LocalDate.parse(date));	
				
			}
			else
			{
				System.out.println("Insuffeciant balance");
			}
		}
		else
		{
			System.out.println("your account is fronzen");
		}
		
		
		
	}
	public long frozen()
	{
		nowDate=LocalDate.now();
		long monthsDifference = ChronoUnit.MONTHS.between(this.getLastTractionADate(),nowDate);
		
		//System.out.println("month difference="+monthsDifference);
		return monthsDifference;
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("your Account balnce is:"+this.getBalace());
		
	}

	@Override
	public void interestCal() {
		// TODO Auto-generated method stub
		double intreset=(this.getBalace()+(this.getBalace()*(intrestRate/100))*3);;
		System.out.println("intrest rate for salary Account is:"+intrestRate);
		System.out.println("for 3 month your balance will be"+(this.getBalace()+intreset));
		
	}
	public String toString()
	{
		String s="|"+this.getAccount_no()+"          |"+this.getName()+"                       |"+this.getBalace()+"       |";
		return s;
	}


    
}

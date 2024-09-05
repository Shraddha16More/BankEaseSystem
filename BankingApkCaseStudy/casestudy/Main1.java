package casestudy;

import java.util.Scanner;

public class Main1 {
 
	static int ctr=0;
	static long AccountNo=100;
	static Scanner sc=new Scanner(System.in);
	static Account[] arr=new Account[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		operations();
	}
	
	
	public static void operations()
	{
		int ch;
		do
		{
			System.out.println("+-------------------------------------------+");
			System.out.println("|OPSTIONS|                 MENU             |");
			System.out.println("+-------------------------------------------+");
			System.out.println("|  1     |        Admin                     |");
			System.out.println("|  2     |        User                      |");
			System.out.println("|  3     |        Open Account              |");
			System.out.println("|  0     |        Exite                     |");
			System.out.println("+-------------------------------------------+");

			//System.out.println("1.Admin\n2.User\n3.Open Account\n0.exite");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				admin();
				break;
			case 2:
				user();
			     break;
			case 3:
				openAccount();
				break;
			}
		}while(ch!=0);
	}
	public static void user()
	{ 
		int ch;
		do
		{
			System.out.println("+-------------------------------------------+");
			System.out.println("|OPSTIONS|                 MENU             |");
			System.out.println("+-------------------------------------------+");
			System.out.println("|  1     |        Deposite                  |");
			System.out.println("|  2     |        Withdrawl                 |");
			System.out.println("|  3     |        Check Balance             |");
			System.out.println("|  4     |        Calculate Intrest Rate    |");
			System.out.println("|  5     |        Close Account             |");
			System.out.println("|  6     |      Display Acoount Your details|");
			System.out.println("|  0     |        Exite                     |");
			System.out.println("+-------------------------------------------+");

			//System.out.println("\n1.Deposite \n2.withdwral\n3.check Balance \n4.Calculate Intrest\n5.Close Account \n6.display Acoount your details\n0.exite");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter your account no");
				long ac=sc.nextLong();
				System.out.println("Enter Deposite Amount");
				double amt=sc.nextDouble();
				System.out.println(ctr);
				for(int i=0;i<ctr;i++)
				{
					if(arr[i].getAccount_no()==ac)
					{
						arr[i].deposite(amt);
						Transaction t=new Transaction(ac,"Deposite",amt);
						Transaction.arr1[Transaction.ctr1++]=t;
										}
				}	
			}
				break;
			case 2:
			{
				System.out.println("Enter your account no");
				long ac=sc.nextLong();
				System.out.println("Enter Withdraw Amount");
				double amt=sc.nextDouble();
				for(int i=0;i<ctr;i++)
				{
					if(arr[i].getAccount_no()==ac)
					{
						arr[i].withdrawl(amt);
						Transaction t=new Transaction(ac,"withdraw",amt);
						Transaction.arr1[Transaction.ctr1++]=t;
					}
				}	
			}
				break;
				
			case 3:
			{
				System.out.println("Enter your account no");
				long ac=sc.nextLong();
				for(int i=0;i<ctr;i++)
				{
					if(arr[i].getAccount_no()==ac)
					{
						arr[i].checkBalance();
					}
				}	
			}
				
				break;
			
			case 4:
			{
				System.out.println("Enter your account no");
				long ac=sc.nextLong();
				for(int i=0;i<ctr;i++)
				{
					if(arr[i].getAccount_no()==ac)
					{
						arr[i].interestCal();
					}
				}	
			}
			break;
			case 6:
			{
				String s=null;
				System.out.println("Enter your account no");
				long ac=sc.nextLong();
				int f=0;
				
				for(int i=0;i<ctr;i++)
				{
					if(arr[i].getAccount_no()==ac)
					{
						s=arr[i].toString();
						f++;
					}
				}
				if(f==0)
				{
					System.out.println("account no is invalid");//deposite();
				}
				else
				{   System.out.println("+--------------------------------------------------------+");
					System.out.println("|           YOUR ACCOUNT DETAILS                         |");
					System.out.println("|--------------------------------------------------------|");
					System.out.println("|Account No |  Account holder name:       |Account Balance|");
				    System.out.println("|--------------------------------------------------------|");
				    System.out.println(s);
				    System.out.println("+--------------------------------------------------------+");
				    
				}
			}
				break;
			
			}
		}while(ch!=0);
	}
	
	public static void openAccount()
	{
		int ch;
		do
		{
			System.out.println("+-------------------------------------------+");
			System.out.println("|OPSTIONS|                 MENU             |");
			System.out.println("+-------------------------------------------+");
			System.out.println("|  1     |        Saving Account            |");
			System.out.println("|  2     |        Salary Account            |");
			System.out.println("|  3     |        Current Account           |");
			System.out.println("|  4     |        loan Balance              |");
			System.out.println("|  0     |        Exite                     |");
			System.out.println("+-------------------------------------------+");

			//System.out.println("1.Saving Account\n2.Salary Account\n3.Current Account\n4.loan Balance \n0.exite");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
//				System.out.println("Enter user Account no");
//				long accno=sc.nextLong();
				System.out.println("Enter user Name");
				String name=sc.next();
				System.out.println("balace should be above 10000\nEnter balance ");
				double balance=sc.nextDouble();
				while(balance<10000)
				{
					System.out.println("please enter amount above 10000");
					System.out.println("balace should be above 10000\nEnter balace ");
					balance=sc.nextDouble();
				}
				Account A=new SavingAccount(AccountNo,name,balance);
				arr[ctr++]=A;
				AccountNo=AccountNo++;
				Transaction t=new Transaction(AccountNo,"saving account is created",balance);
				Transaction.arr1[Transaction.ctr1++]=t;
				break;
			}	 
			case 2:
			{
//				System.out.println("Enter user Account no");
//				long accno=sc.nextLong();
				System.out.println("Enter user Name");
				String name=sc.next();
				System.out.println("Enter balance ");
				double balance=sc.nextDouble();
				System.out.println("Enter todays date in yyyy-mm-dd format");
				String date=sc.next();
				Account A=new SalaryAcount(AccountNo,name,balance,date);
				arr[ctr++]=A;
				AccountNo=AccountNo++;
				Transaction t=new Transaction(AccountNo,"salary account is created",balance);
				Transaction.arr1[Transaction.ctr1++]=t;
				break;
			}
			case 3:
			{
//				System.out.println("Enter user Account no");
//				long accno=sc.nextLong();
				System.out.println("Enter user Name");
				String name=sc.next();
				System.out.println("Enter balance ");
				double balance=sc.nextDouble();
				
				Account A=new CurrentAccount(AccountNo,name,balance);
				arr[ctr++]=A;
				AccountNo=AccountNo++;
				Transaction t=new Transaction(AccountNo,"Current account is created",balance);
				Transaction.arr1[Transaction.ctr1++]=t;
				break;
			}	
				
			case 4:
			{
//				System.out.println("Enter user Account no");
//				long accno=sc.nextLong();
				System.out.println("Enter user Name");
				String name=sc.next();
				System.out.println("Enter loan amount you want");
				double loanamt=sc.nextDouble();
				Account A=new LoanAccount(AccountNo,name,loanamt);
				arr[ctr++]=A;
				AccountNo=AccountNo++;
				Transaction t=new Transaction(AccountNo,"Loan account is created",loanamt);
				Transaction.arr1[Transaction.ctr1++]=t;
				break;
			}
			
			}
		}while(ch!=0);
	}
	public static void admin()
	{
		System.out.println("Enter Username:");
		String un=sc.next();
		System.out.println("Enter Passward");
		String pw=sc.next();
		String password="123";
		if(pw.compareTo(password)==0)
		{
				Transaction.display();;
			    //System.out.println(s);
			    System.out.println("+------------------------------------------------------------------+");
			   
		}
		else
		{
		  System.out.println("Please enter currect password");
		}
		
	    
	}

}
	
	



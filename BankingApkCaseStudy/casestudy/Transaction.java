package casestudy;

public class Transaction {
	int srno=1;
	long Account_no;
	String opration;
	double Amount;
	static int ctr1=0;
	static Transaction[] arr1=new Transaction[10];
	public Transaction(long account_no, String opration, double amount) {
		super();
		Account_no = account_no;
		this.opration = opration;
		Amount = amount;
	}
	
	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public long getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(long account_no) {
		Account_no = account_no;
	}
	public String getOpration() {
		return opration;
	}
	public void setOpration(String opration) {
		this.opration = opration;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
	public static void display()
	{
		String s=null;
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|                       DAILY REPORT                               |");
		System.out.println("|------------------------------------------------------------------|");
		System.out.println("|SR.No |  Account No: |Opration                      |Amount       |");
	    System.out.println("|------------------------------------------------------------------|");
	    
		for(int i=0;i<ctr1;i++)
		{
			s = String.format("|%-6d|%-14s|%-30s|%,13.2f|", (i + 1), arr1[i].Account_no, arr1[i].opration, arr1[i].Amount);
            System.out.println(s);
		}
		
	}	
}

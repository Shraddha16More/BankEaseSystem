package casestudy;

public abstract class Account {
	    long Account_no;
		String name;
	    double balace;
	    
		public Account(long Account_no,String name, double balace) {
			super();
			this.Account_no =Account_no;
			this.name = name;
			this.balace = balace;
			System.out.println("your Account no is:"+this.getAccount_no());
		}
		public long getAccount_no() {
			return Account_no;
		}
		public void setAccount_no(long account_no) {
			Account_no = account_no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalace() {
			return balace;
		}
		public void setBalace(double balace) {
			this.balace = balace;
		}
		public abstract void deposite(double amt);
		public abstract void withdrawl(double amt);
		public abstract void checkBalance();
		public abstract void interestCal();
		
		public String toString()
		{
			String s=+this.getAccount_no()+"        |"+this.getName()+"                    |"+this.getBalace()+"   |";
			return s;
		}

	
	
}


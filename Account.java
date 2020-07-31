//public class Account
public class Account 
	{
	//static variable initialized to 0
	static int numAccounts = 0;
	
	//constructor
	Account()
	{ 
		
	//incrementing by one each time object created
		
		numAccounts=numAccounts+1;	

	}
	//main method to test program
	public static void main(String[]args)
{
		
		//creating 4 obj of class account
		
	Account ob1=new Account();
	Account ob2=new Account();
	Account ob3=new Account();
	Account ob4=new Account();
	
	//getNumAccounts method to display number of accounts
	System.out.println("Number of accounts= " +getNumAccounts());
}
	
	private static int getNumAccounts() {
		return numAccounts;
		
	
	}


}

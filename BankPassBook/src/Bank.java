import java.util.Scanner;

public class Bank {
	
	private String accno;
	private String name;
	private long balance;
	
	Scanner KB  = new Scanner(System.in);
	
	void openAccount ()
	{
		
		System.out.println("Enter the Account Name ");
		accno = KB.next();
		
		
		System.out.print("Enter Name: ");
		name=KB.next();
		
		
		System.out.print("Enter Balance: ");
		balance=KB.nextLong();
	
		
		
	}
	
	void showAccount()
	{System.out.println(accno +" "+name +" " +balance);}
	
	
	void deposit()
	{
		long amt;
		System.out.println("Enter you want  to deposit Ammount");
		amt = KB.nextLong();
		balance = balance + amt;
	}
	
	void withdrawal()
	{
		long amt ;
		System.out.println("Enter your ammount  to withdrawal");
		amt  = KB.nextLong();
		
		
		if(balance>=amt)
		{ 
			balance=balance-amt;
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
		
		
	}
	
	boolean search(String acn)
	{
		if(accno.equals(acn))
		{
			showAccount();
			return(true);
		}
		
		
		return (false);
	}
	
	
	

}

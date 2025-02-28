package Minor_project;

import java.util.Scanner;

class bank
{
	Scanner s1 = new Scanner(System.in);
	void deposite(double amount)
	{
		int dep;
		System.out.println("Enter amount to deposite");
		dep = s1.nextInt();
		amount = amount + dep;
		System.out.println("Ammount after deposite = " + amount);
	}
	
	void withdraw(double amount)
	{
		int with;
		System.out.println("Enter amount to withdraw : ");
		with = s1.nextInt();
		if(amount>=with)
		{
			amount = amount - with;
			System.out.println("Amount after withdraw : " + amount);
		}
		else
		{
			System.out.println("Trasaction Failed.........");
		}
	}
}

class hdfc extends bank
{
	int amount;
	void hello()
	{
		System.out.println("Welcome hdfc bank");
	}
	void deposite()
	{
		super.deposite(amount);
	}
	void withdraw()
	{
		super.withdraw(amount);
	}
}

public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bank b1 = new bank();
		hdfc h1 = new hdfc();
		h1.hello();
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ammount");
		amount = sc.nextDouble();
		System.out.println("1.deposite\n2.withdraw");
		int ch;
		System.out.println("Enter your choice: ");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			h1.deposite(amount);
			break;
			
		case 2:
			h1.withdraw(amount);
			break;
			default:
				System.out.println("Invalid");
				
		}
		
	}

}

package Training;
import java.util.Scanner;
public class ATM {
	
	
	
	public static void main(String[] args)
	{
	int balance =50000,withdraw, deposit;

	Scanner obj = new Scanner(System.in);

	while(true)
	{
	System.out.println("Welcome to SBI ATM!");
	System.out.println("select-1 for withdraw");
	System.out.println("select-2 for deposit");
	System.out.println("select-3 for balance available");
	System.out.println("select-4 exit");
	System.out.println("select any process which you need!");

	int choice = obj.nextInt();
	switch(choice)
	{
	case 1:
	System.out.println("Enter the amount");
	withdraw = obj.nextInt();

	if (balance>=withdraw)
	{
	balance = balance-withdraw;
	System.out.println("Collect your cash");
	}
	else
	{
	System.out.println("Insufficent balance in your account");
	}
	break;
	case 2:
	System.out.println("Enter the money to deposited");
	deposit = obj.nextInt();

	balance = balance + deposit;
	System.out.println("successfully deposited");
	break;
	case 3:
	System.out.println("your main balance is " + balance);
	break;
	case 4:
	System.exit(0);
	}
	}
	}

	}




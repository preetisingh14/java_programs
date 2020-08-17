package java_projects;
import java.util.*;
class payment{
	public static int account=10000;
	int amount;
	payment(int amount){
		this.amount =amount;	
	}
	void display() {
		 account=account-amount;
		System.out.print("\n Payment Successful !\n    Remaining amount : ");
	System.out.println(account);
	}
}

class pay extends payment{
	long phone;

	pay(int amount,long phone){
		super(amount);
		this.phone=phone;
	}
	void display() {
		super.display();
	}
}
class UPI extends payment{
	int accnum;
	String name;

	UPI(int amount,int accnum,String name){
		super(amount);
		this.accnum=accnum;
		this.name=name;
	}
	void display() {
		super.display();
	}
	
}

class AddMoney extends payment{
	int accnum;

	AddMoney(int amount,int accnum){
		super(amount);
		this.accnum=accnum;
	}
	void display() {
		super.account+=amount;
		System.out.println("\n Amount is successfully added to the account !");
		System.out.println("      Current amount :"+account);
	}
	
}

class MobileRecharge extends payment{
	long mobile;

	MobileRecharge(int amount,long mobile){
		super(amount);
		this.mobile=mobile;
	}
	void display() {
		super.display();
	}
	
}

public class Paytm {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("        Welcome to Paytm       :-)  ");
	boolean result=true;
	
	while(result==true) {
		
		System.out.println("\n---------------------------------------");
		System.out.println("1. Pay ");
		System.out.println("2. UPI Money Transfer");
		System.out.println("3. Add Money ");
		System.out.println("4. Mobile Recharge ");
		System.out.println("0. Exit ");
		System.out.println("---------------------------------------");
		
		int option=sc.nextInt();
		
		switch(option) {
		case 1:System.out.println("Please enter the amount to be paid : ");
		       int amount=sc.nextInt(); 
			   System.out.println("Enter the phone number to to pay: ");
		         long phone=sc.nextInt();
		         pay p1=new pay(amount,phone);
		         p1.display();
		         break;
		case 2: System.out.println("Please enter the amount to transfer :");
		         amount=sc.nextInt();
			    System.out.println("Enter the account number : ");
		         int accnum=sc.nextInt();
		         System.out.println("Enter the Name of the account holder : ");
		         String name=sc.nextLine();
		         UPI p2=new UPI(amount,accnum,name);
		         p2.display();
		         break;
		case 3:System.out.println("Please enter the amount to add : ");
		        amount=sc.nextInt(); 
			    System.out.println("Enter the Account number from which you want to add money : ");
		         int myacc=sc.nextInt();
		         AddMoney p3=new AddMoney(amount,myacc);
		         p3.display();
		         break;
		case 4:System.out.println("Please enter the amount of recharge : ");
		       amount=sc.nextInt(); 
			   System.out.println("Please enter the mobile number to recharge : ");
		         long mobile=sc.nextInt();
		         MobileRecharge p4=new MobileRecharge(amount,mobile);
		         p4.display();
		         break;
		case 0: result=false;
		        System.out.println("\n Thankyou for using Paytm ..!! :)");
		        break;
		default: System.out.println("\n Please select correct option from the list ...");
		         
		}
	}
}
}

public class AccountDemo{
public static void main(String[] args){
	
	SavingAccount obj=new SavingAccount("kamal",77311114,10000.00,"SavingAccount");
	CurrentAccount obj1=new CurrentAccount("Amal",84393473,7000.00,"CurrentAccount");
	
	obj.display();
	obj1.display();
	
	System.out.println("after Deposits is :"+obj.Deposits(5000.00));
	System.out.println("interest is :"+obj1.interest());
	System.out.println(" ");
	obj1.display();
	System.out.println("severchcharge is :"+obj.severchcharge());
	}
}
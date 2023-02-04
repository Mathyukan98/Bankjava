public class Account {
	
	String name;
	int AccountNumber;
	double Balance;
	String TypeOfAccount;
	double depposits,withdraws;
	
	public Account(String name,int AccountNumber,double Balance,String TypeOfAccount){
		this.name=name;
		this.AccountNumber=AccountNumber;
		this.Balance=Balance;
		this.TypeOfAccount=TypeOfAccount;
	}
	void display(){
		System.out.println("Name is :"+name+"AccountNumber:"+AccountNumber+"Balance"+Balance+"TypeOfAccount :"+ TypeOfAccount);
	}
	double deposits(double deoosits){
		Balance=Balance+deoosits;
		return Balance;
	} 
	double withdraws(double withdraws){
		Balance=Balance-withdraws;
		return Balance;
	} 
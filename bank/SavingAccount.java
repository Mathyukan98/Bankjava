public SavingAccount extends Account{
	public SavingAccount(String name,int AccountNumber,double Balance,String TypeOfAccount){
	super(name,AccountNumber,Balance,TypeOfAccount);
	}
	public interest(){
		return Balance+(Balance*0.03);
	}
}
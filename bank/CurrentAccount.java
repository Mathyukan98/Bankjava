public CurrentAccount extends Account{
	double sercharge;
	final double minbalance=1000.00;
	public CurrentAccount(String name,int AccountNumber,double Balance,String TypeOfAccount){
	super(name,AccountNumber,Balance,TypeOfAccount);
	}
	public servicecharge(){
		if(minbalance>=Balance){
		
		sercharge=(minbalance-Balance)*0.05;
		Balance=Balance-sercharge;
		return Balance;
		}
		return Balance;
	}
}
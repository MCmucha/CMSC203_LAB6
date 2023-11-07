
public class CheckingAccount extends BankAccount
{
	public static final double FEE = 0.15;
	
	public CheckingAccount(String name, double initialAmount) 
	{
        super(name, initialAmount);

        String updatedAccountNumber = getAccountNumber() + "-10";
        setAccountNumber(updatedAccountNumber);
	}
	
	
    @Override
    public boolean withdraw(double amount) 
    {
        double totalAmount = amount + FEE; 
        return super.withdraw(totalAmount); 
    }

}

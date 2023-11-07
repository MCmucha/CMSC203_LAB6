
public class SavingsAccount extends BankAccount
{
	private double rate = 0.025; 
    private int savingsNumber = 0;
    private String accountNumber;

    
    public SavingsAccount(String name, double initialAmount) 
    {
        super(name, initialAmount);

        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
        savingsNumber++;
    }
	
    public void postInterest() 
    {
        double interest = getBalance() * rate / 12;
        deposit(interest);
    }

    
    @Override
    public String getAccountNumber() 
    {
        return accountNumber;
    }

   
    public SavingsAccount(SavingsAccount originalAccount, double initialBalance)
    {
        super(originalAccount.getOwner(), initialBalance);
        savingsNumber = originalAccount.savingsNumber + 1;
        accountNumber = originalAccount.getAccountNumber().split("-")[0] + "-" + savingsNumber;
    }
    
}

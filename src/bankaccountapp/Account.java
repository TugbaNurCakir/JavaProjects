package bankaccountapp;

public abstract class Account implements IBaseRate{
    //List common properties for savings and checking accounts

    private String name;
    private String SSN;
    protected String accountNumber;
    protected double rate;
    private double balance;

    private static int index = 10000;
    
    //Cosntructor to set base properties and initialize the account
    public Account(String name, String SSN, double initdeposit){
       this.name = name;
       this.SSN = SSN;
       balance = initdeposit;

       
       index++;
       this.accountNumber = setAccountNumber();
    }

    public abstract void setRate();

    //set account number
    private String setAccountNumber(){
        String lastTwoOfSSN = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest : $" + accruedInterest);
        printBalance();
    }


    //List common methods - transactions
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + balance);
        printBalance();
    }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + balance);
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo(){
        System.out.println(
            "Name: " + name +
            "\n Account Number: " + accountNumber +
            "\n Balance: " + balance +
            "\n Rate: " + rate + "%"
        );
    }
}

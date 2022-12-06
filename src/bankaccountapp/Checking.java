package bankaccountapp;

public class Checking extends Account{
    //List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPIN; 

    //Constructor to initialize checking account properties
    public Checking(String name, String SSN, double initdeposit){
        super(name, SSN, initdeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
        setRate();
    }

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 12));
    }

    //List any methods specific to the checking account
    @Override
    public void showInfo(){
        System.out.println("AccountType: Checking");
        super.showInfo();
        System.out.println(" Your Checking Account Features " +
        "\n Debit Card Number: " + debitCardNumber +
        "\n Debit DepCardosit PIN: " + debitCardPIN
        );
    }

    @Override
    public void setRate() {
        // TODO Auto-generated method stub
        rate = getBaseRate() * .15;
    }

}

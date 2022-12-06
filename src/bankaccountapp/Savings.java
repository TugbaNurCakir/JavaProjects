package bankaccountapp;

public class Savings extends Account{
    //List properties specific to a Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize savings account properties
    public Savings(String name, String SSN, double initdeposit){
        super(name, SSN, initdeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
        setRate();
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }


    //List any methods specific to the savings account
    @Override
    public void showInfo(){
        System.out.println("AccountType: Savings");
        super.showInfo();
        System.out.println(" Your Savings Account Features " +
        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
        "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }

    @Override
    public void setRate() {
        // TODO Auto-generated method stub
        rate = getBaseRate() * .25;
    }
}

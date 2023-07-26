package AbroadMiniApp;

import java.util.Scanner;

public class Passenger implements IAbroadRules{
    private int fee;
    private boolean politicalBan;
    private boolean visaStatus;

    public Passenger(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fee amount: ");
        this.fee = scanner.nextInt();
        scanner.nextLine();
    
        System.out.print("Do you have any political ban?(Yes/No)");
        String answer = scanner.nextLine();

        if(answer.equals("Yes")){
            this.politicalBan = true;
        }else{
            this.politicalBan = false;
        }
        scanner.nextLine();

        System.out.println("Do you have visa?(Yes/No)");
        String answer1 = scanner.nextLine();

        if(answer1.equals("Yes")){
            this.visaStatus = true;
        }else{
            this.visaStatus = false;
        }

    }

    @Override
    public boolean foreignFeeControl() {
        if(this.fee < 150){
            System.out.println("Please pay the full abroad departure fee.");
            return false;
        }
        else{
            System.out.println("Your pay is completed.");
            return true;
        }
    }
    @Override
    public boolean politicalBanControl() {
        if(this.politicalBan == true){
            System.out.println("You have political ban. So, you can't go abroad.");
            return false;
        }
        else{
            System.out.println("You haven't any political ban. So, so you can go abroad.");
            return true;
        }
    }
    @Override
    public boolean visaStatusControl() {
        if(this.visaStatus == true){
            System.out.println("Your visa process is completed.");
            return true;
        }
        else{
            System.out.println("There is no visa for the country you want to go to.");
            return false;
        }
    }

}

package AbroadMiniApp;

import java.io.IOException;

public class Main {
     public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Welcome to Istanbul Airport");
        String conditions = "Rules for go to abroad...\n"
                            + "You must not have any political bans...\n"
                            + "You must pay the full abroad departure fee...\n"
                            + "You must have visa for country you want to go to..."; 
        String message = "You must fulfill all the foreign conditions.";

        while(true){
            System.out.println("********************************");
            System.out.println(conditions);

            Passenger passenger = new Passenger();

            System.out.println("Fee amount is controlling...");
            Thread.sleep(3000); //3seconds

            if(passenger.foreignFeeControl() == false ){
                System.out.println(message);
                continue;
            }

            System.out.println("Political ban is controlling...");
            Thread.sleep(3000); //3seconds

            if(passenger.politicalBanControl() == false ){
                System.out.println(message);
                continue;
            }

            System.out.println("Visa status is controlling...");
            Thread.sleep(3000); //3seconds

            if(passenger.visaStatusControl() == false ){
                System.out.println(message);
                continue;
            }

            System.out.println("Your process is completed. You can go to abroad!");
            break;
        }
     }
}

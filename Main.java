
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import BillsBurgerChallenge.Burger;
import BillsBurgerChallenge.Item;
import BillsBurgerChallenge.MealOrder;
import bankaccountapp.Account;
import bankaccountapp.Checking;
import bankaccountapp.Savings;
import emailApp.Email;
import studentDbApp.Student;

public class Main{
    public static void main(String[] args) throws IOException {

        //Student Database Project
/* 
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];
        
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition(); 
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        
        //Email Administration project 
        Email email1 = new Email("Tugba", "Alparslan");
        email1.setAlternateEmail("java.@gmail.com");
        System.out.println(email1.getAlternateEmail()); */

/*         Checking check1 = new Checking("Tugba Cakir", "123456789",1500);
        Savings saving1 = new Savings("Eray Alparslan","987654321",2500);

        check1.showInfo();
        System.out.println("********************");
        saving1.showInfo(); */


        //Read a CSV File then create new accounts based on that data
/*         List<Account> accounts = new LinkedList<Account>();


        String file = "C:\\Users\\10121332\\NewBankAccounts.csv";
        List<String[]> newAccountHolder = UtilitiesCSV.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initdeposit = Double.parseDouble(accountHolder[3]);

            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, SSN, initdeposit));

            }else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, SSN, initdeposit));

            }else{
                System.out.println("Error reading account type");
            }
        }
        for (Account account : accounts) {
            System.out.println("\n**********************");
            account.showInfo();
        } */
/* 
        
        Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("Topping", "avocado", 1.50);
        avocado.printItem();
 */
       
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "7-up",
        "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

        
        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
                "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
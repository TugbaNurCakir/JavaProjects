package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPassLength = 8;
    private String alternateEmail;
    private String companySuffix = "nttdata.com";

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPassLength);
        System.out.println("Your password is: " + this.password);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is "+ this.email);

    }

    private String setDepartment(){
        System.out.println("Enter the department:");
        try (Scanner in = new Scanner(System.in)) {
            String departmentChoice =  in.nextLine();
            return departmentChoice;
        }
    }
   
    private String randomPassword(int length){
        String passwordSet = "t354541231ug2543132ba4646rABDCSDKJGLSDJG?=..,,*/&%#";
        char[]  password = new char[length];
        for(int i =0; i<length; i++){
            int randomPass = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomPass);
        }
        return new String(password); 
    }

    public void setMailboxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return this.mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return this.alternateEmail;
    }

    public String getPassword(){
        return this.password;
    }

}

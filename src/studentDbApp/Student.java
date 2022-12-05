package studentDbApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = " ";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    
    public Student(){
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student class level: ");
        this.gradeYear = in.nextLine();

        setStudentID();
    }

    private void setStudentID(){
        //grade level + id
        id++;
         this.studentID = gradeYear + "" + id; 
    }

    public void enroll(){
        do{
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                this.courses = courses + "\n " + course;
                this.tuitionBalance= this.tuitionBalance+costOfCourse;
            }
            else{break;}
        } while(1!=0);
    }

    public void viewBalance(){
        System.out.println("Your balance is $" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("thank you for your payment of $ " + payment);
        viewBalance();
    }

    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName +
        "\nGradeLevel: " + gradeYear + 
        "\nStudent ID: " + studentID + 
        "\nCourses Enrolled: " + courses + 
        "\nBalance: $" + tuitionBalance;
    }
}
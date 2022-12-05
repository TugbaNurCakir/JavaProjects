
import java.util.Scanner;

import emailApp.Email;
import studentDbApp.Student;

public class Main{
    public static void main(String[] args) {

        //Student Database Project
        Student student1 = new Student();
        
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
        System.out.println(email1.getAlternateEmail());
    }
}
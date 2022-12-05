
import emailApp.Email;
import studentDbApp.Student;

public class Main{
    public static void main(String[] args) {
        Student student1 = new Student();
        
        Email email1 = new Email("Tugba", "Alparslan");
        email1.setAlternateEmail("java.@gmail.com");
        System.out.println(email1.getAlternateEmail());
    }
}
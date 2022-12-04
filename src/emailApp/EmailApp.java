package emailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Tugba", "Alparslan");
        email1.setAlternateEmail("java.@gmail.com");
        System.out.println(email1.getAlternateEmail());
    }
}

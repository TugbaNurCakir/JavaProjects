package CalcGeoShapesMiniProgram;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String processes = "Processes...\n"
                            + "1. Calc Square\n"
                            + "2. Calc Triangle\n"
                            + "3. Exit" ;

        while(true){
            System.out.println(processes);
            System.out.println("Which shape do you want to calculate the area of?");
            String typeOfShape = scanner.nextLine();
            Shapes shape = null;

            if(typeOfShape.equals("3")){
                System.out.println("You are leaving fron the program....");
                break;
            }
            else if(typeOfShape.equals("1")){
                System.out.println("Edge of square: ");
                int edge = scanner.nextInt();
                scanner.nextLine();

                shape = new Square("Square1", edge);
                shape.calcArea();

            }
            else if(typeOfShape.equals("2")){
                System.out.println("Edge1 of triangle: ");
                int edge1 = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Edge2 of triangle: ");
                int edge2 = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Edge3 of triangle: ");
                int edge3 = scanner.nextInt();
                scanner.nextLine();

                shape = new Triangle("Triangle1", edge1, edge2, edge3);
                shape.calcArea();

            }
            else{
                System.out.println("Your choosen is incorrect!!");
            }
        }
    }
}

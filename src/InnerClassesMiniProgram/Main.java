package InnerClassesMiniProgram;

import java.util.Scanner;

import org.xml.sax.SAXException;

import InnerClassesMiniProgram.Problem.Mathematic;
import InnerClassesMiniProgram.Problem.Physic;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Math ve Phy. problems");

        String processes = "Processes...\n"
                            + "1. Calc Area of Circle\n"
                            + "2. Calc Perimeter of Triangle\n"
                            + "3. InnerMultiple of Vectors\n"
                            + "q: Exit...";
        while(true){
            System.out.println(processes);
            System.out.println("Choose a process");
            String process = scanner.nextLine();

            if(process.equals("q")){
                System.out.println("You are leaving from the program....");
                break;
            }
            else if(process.equals("1")){

                System.out.println("dairenin yarıcapi:  ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                Mathematic.areaOfCircle(yaricap);
            }

              else if(process.equals("2")){

                System.out.println("edge1 of triangle:  ");
                int edge1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("edge2 of triangle:  ");
                int edge2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("edge3 of triangle:  ");
                int edge3 = scanner.nextInt();
                scanner.nextLine();

                Problem.Mathematic.perimeterOfTriangle(edge1, edge2, edge3);
            }
            else{
                System.out.println("Your choosen are incorrect.!");
            }
        }
    }
}

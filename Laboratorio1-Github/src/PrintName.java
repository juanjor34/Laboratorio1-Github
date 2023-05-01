import java.util.Scanner;
public class PrintName {
    Scanner input = new Scanner(System.in);

    String printName(){
        
        System.out.println("Broo what's ur name? ");
        String name = input.nextLine();
        return "You'r name is " + name;
    }
}1
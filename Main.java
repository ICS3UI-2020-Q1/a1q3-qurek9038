import java.util.Scanner;
/**
 *This program will prompt the user to input how many of each item they want to purchase. This program will then calculate the subtotal, the amount of tax, and the grand total.
 * @author Khazina
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a Scanner for user input
    Scanner input = new Scanner (System.in);

    //Determining Variables
    double chromebookPrice = 34.99;
    double motherboardPrice = 127.50;
    double mousePrice = 18.00;
    double subtotal;
    double tax = 0.13;
    double total;
    int numChromebook;
    int numMother;
    int numMouse; 

    //Ask the user for the amount of Chromebook chargers
    System.out.println("How many chromebook chargers?");

    //The users input
    int Chromebook = input.nextInt();

    //Money spent on Chromebook Chargers
    chromebookPrice = Chromebook * 34.99;

    //Ask the user for the amount of motherboards
    System.out.println("How many motherboards?");

    //The users input
    int Mother = input.nextInt();

    //Money spent on Motherboards
    motherboardPrice = Mother * 127.50;

    //Ask the user for the amount of mice
    System.out.println("How many mice?");

    //The users input
    int Mouse = input.nextInt();

    //Money spent on mice
    mousePrice = Mouse * 18.00;
    
    //Calculate all the Item prices together to get subtotal
    subtotal = chromebookPrice + motherboardPrice + mousePrice;

    //determing variable
    subtotal = subtotal;

    //Displaying subtotal 
    System.out.println("Subtotal = $" + subtotal);

    //Adding tax to subtotal
     tax = subtotal * 0.13;

     //Displaying Taxes
    System.out.println("Taxes = $" + tax);

    //Calculating final total
    total = subtotal + tax;

    //Displaying final total 
    System.out.println("Total = $" + total);

  








    
  }
}

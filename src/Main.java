import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Neo
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your favorite food: ");
        String favouriteFood = scanner.nextLine();
        System.out.println("\nFirst name: " + firstName + "\nAge: " + age + "\nFavourite food: " + favouriteFood);
    }

}

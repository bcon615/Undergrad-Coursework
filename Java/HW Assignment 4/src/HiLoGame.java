import java.util.Random;
import java.util.Scanner;

public class HiLoGame {
    public static void main(String [] args) {

        Random generator = new Random();
        String again;
        int randNum = generator.nextInt(100);
        int attempts = 1;

        Scanner scan = new Scanner(System.in);

        again = "y";
        while(again.equalsIgnoreCase("y")) {
            System.out.println("Pick a number between 1 and 100:");
            int userGuess = scan.nextInt();
            if (userGuess == randNum) {
                System.out.println("Good Job! You Guessed right");
                System.out.println("It took " + attempts + " times to guess right");
                again = "n";
            } else if (userGuess < randNum) {
                System.out.println("Eh, your guess was a little low!");
            } else if (userGuess > randNum) {
                System.out.println("Hmm...your guess was a little high");
            } else {
                System.out.println("Invalid User Input");
            }
            System.out.print("Do you want to try again?: ");
            again = scan.nextLine();
            attempts++;
        } // end while
    }
}

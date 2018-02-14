import java.util.Scanner;

public class SlotMachine {

    public static void main(String [] args) {

        String again;
        int slot1, slot2, slot3, counter = 0, matchedTwoCounter = 0;
        Scanner scan = new Scanner(System.in);

        again = "y";
        while(again.equalsIgnoreCase("y")) {

            slot1 = SlotMachine.spinNumber();
            System.out.print(slot1 + " ");
            slot2 = SlotMachine.spinNumber();
            System.out.print(slot2 + " ");
            slot3 = SlotMachine.spinNumber();
            System.out.print(slot3 + " \n");

        if(slot1 == slot2 && slot2 == slot3) {
            System.out.println(" JACKPOT!");
            again = "n";
        } else if(slot1 == slot2 || slot2 == slot3 || slot1 == slot3) {
            System.out.println(" Matched 2");
            matchedTwoCounter++;
        }
        //System.out.print("Do you want to continue?: ");
       // again = scan.nextLine();
            counter++;
        }  //end while

        System.out.println("It took " + counter + " times to hit the Jackpot, matched twice was realized " + matchedTwoCounter + " times");
    }

    public static int spinNumber() {

        final int DIGITS = 10;

        try {
            for (int i = 0; i < 10; i++) {
            System.out.print(i + "\b");
            Thread.sleep(5);

            }
        } catch(InterruptedException e) {
            System.out.println("An error has occurred! \n");
            }
        return (int)(Math.random() * DIGITS);
    }
}

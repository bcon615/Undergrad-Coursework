import java.util.Scanner;

public class Counter {

    public static void main(String [] args) {

        int[] count = new int[51];

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter integers: ");
        while (scan.hasNext()){
            int num = scan.nextInt();
            if (num >= 0 && num <= 50)
                count[num]++;
        }
        System.out.println("\nIntegers entered");
        for (int i = 0; i <= 50; i++)
            if (count[i] > 0)
                System.out.println(i + "\t" + count[i]);
    }
}

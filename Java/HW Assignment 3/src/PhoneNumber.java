import java.util.Random;

public class PhoneNumber {

    public static void main(String [] args) {

        //initialize Random object
        Random generator = new Random();

            String strAreaCode = "";
            String phoneNumber = "";

                for(int i = 0; i < 3; i++) {

                    int areaCode = generator.nextInt(8);
                    strAreaCode += areaCode;
                }

                phoneNumber += strAreaCode;

                int threeDigitNum = generator.nextInt(742);

                if(threeDigitNum <= 99) {
                   return;
                }

                phoneNumber += "-" + threeDigitNum;

                int fourDigitNum = generator.nextInt(10000);

                if(fourDigitNum <= 999) {
                    return;
                }

                phoneNumber += "-" + fourDigitNum;

        System.out.println(phoneNumber);
    }
}

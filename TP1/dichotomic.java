import java.util.Random;
import java.util.Scanner;

public class dichotomic {
    public static void main(String[] args) {
        // write your code here
        int num = randInt(0,1000);
        System.out.println("Please choose a number:");
        Scanner in = new Scanner(System.in);
        String sn = in.nextLine();
        int myNum = Integer.parseInt(sn);
        while(myNum!=num) {
            if(myNum>num) {
                System.out.println("Bad luck. Please choose a smaller number:");
            }
            else {
                System.out.println("Bad luck. Please choose a bigger number:");
            }
            sn = in.nextLine();
            myNum = Integer.parseInt(sn);
        }
        System.out.print("Congratulations!");
    }

    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}



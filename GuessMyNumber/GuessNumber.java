package GuessMyNumber;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public void getNumber() {
        Scanner sc = new Scanner(System.in);
        int min = 10;
        int max = 31;
        Random random = new Random(); //( so i use this in this math.random only contain double  from 0.0(inclusive)( to 1.0 exclusive)
        int RandomNumber = random.nextInt(max - min) + min;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter the value between(10 to 30)  to Guess the Number you are allow to Enter 5 time this:");
            int Guess = sc.nextInt();
            if(Guess==RandomNumber){
                System.out.println("your enter number is same ");
                break;
            } else if (Guess>RandomNumber) {
                System.out.println("your enter number is greater enter next ");
            }else{
                System.out.println("your Enter number is smaller enter next");
            }
        }
        System.out.println("the actual number :"+RandomNumber);
    }

}

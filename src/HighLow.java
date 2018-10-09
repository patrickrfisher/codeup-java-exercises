import java.util.Scanner;
import util.Input;
public class HighLow {
    public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
         Input sc= new Input();
        double number =Math.floor(Math.random()*100)+1;
        System.out.println(number);
        System.out.println("How many guesses?");
        int g=sc.getInt();
        System.out.println("Enter a number between 1-100 ");

        for(int i =g;i>=0;i--) {
            if(i == 1) {
                System.out.println("Enter a number:");
                int userNum = sc.getInt();
                if (userNum < number) {
                    System.out.println("Higher" + "\n" + "You have " + i + " guess");
                } else if (userNum > number) {
                    System.out.println("Lower" + "\n" + "You have " + i + " guess");
                } else {
                    System.out.println("GOOD GUESS!");
                    System.exit(0);
                }
            } else {
                System.out.println("Enter a number:");
                int userNum = sc.getInt();
                if (userNum < number) {
                    System.out.println("Higher" + "\n" + "You have " + i + " guesses");
                } else if (userNum > number) {
                    System.out.println("Lower" + "\n" + "You have " + i + " guesses");
                } else {
                    System.out.println("GOOD GUESS!");
                    System.exit(0);
                }
            }
        }


        System.out.println("You lose");
    }
}

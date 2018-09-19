import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int base = 5
//        System.out.println("Continue? [y/n]");
//        String userInput = sc.next();
//        boolean confirmation = userInput.equals("y");
//-----------------------------------------------------------
//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }
//    }

    //---------------------------------------------------------------

//        int i =0;
//        while (i<29){
//            System.out.println("i is"+i);
//            i++;
//        }
//
//--------------------------------------------
//        int i=5;
//        while(i<=15){
//            System.out.println("i is"+i);
//            i++;
//        }
//
//        int i = 5;
//        while(i<=15){
//            System.out.println(i+" is the current number");
//            i++;
//        }




//        for (long k=2;k<90000000000l)
        for (int i=1;i<=100;i++){
            if (i%15==0) System.out.println("FizzBuzz");
            else if (i%3==0) System.out.println("Fizz");
            else if (i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }

    }}







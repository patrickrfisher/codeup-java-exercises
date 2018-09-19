import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

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
//        -------------------------------------------------------
//        for (int i=1;i<=100;i++){
//            if (i%15==0) System.out.println("FizzBuzz");
//            else if (i%3==0) System.out.println("Fizz");
//            else if (i%5==0) System.out.println("Buzz");
//            else System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);

//        System.out.print("What number would you like to go up to?");
//
//        int userInt=sc.nextInt();
//        System.out.println("The table");
//        System.out.println();
//        System.out.println("number | squared | cubed");
//        System.out.println("-------| ----- | ----- |");
//        System.out.format("%10s | %10s | %10s",userInt,userInt*userInt,userInt*userInt*userInt);
        boolean confirm =true;
while (confirm) {
    System.out.println("Enter the grade");
    int grade = sc.nextInt();
    char letterGrade = '*';
    if (grade >= 0 && grade <= 100) {
        if (grade >= 88) letterGrade = 'A';
        else if (grade >= 80) letterGrade = 'B';
        else if (grade >= 67) letterGrade = 'C';
        else if (grade >= 60) letterGrade = 'D';
    } else letterGrade = 'F';
    System.out.println(letterGrade);
    String answer=sc.nextLine();
    if(!answer.equalsIgnoreCase(anotherString:"y"))
        confirm=false;
} }}







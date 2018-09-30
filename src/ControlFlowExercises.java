import java.util.Scanner;
import java.util.Calendar;
public class  ControlFlowExercises {
  static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        fizzBuzz();
//        theTable();
        letterGrades();

        Calendar c = Calendar.getInstance();
        System.out.println();
        System.out.format("%tB %te%n", c, c);
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
//for(long i=2;i<100000;i=(long) Math.pow(i,2)){
//    System.out.println(i);
//}}
//        int i=5;
//        while (i<=15){
//            System.out.println("i is"+ i);
//            i++;
//        }
//        long i = 2;
//        System.out.println(i);
//        do {
//            i = (long) Math.pow(i, 2);
//            System.out.println(i);
//
//        } while (i <= 10000);
//
//        for (long j = 2; j < 100000; j = (long) Math.pow(j, 2)) {
//            System.out.println(j);
//
//
//        }
//
////    }}

        public static void fizzBuzz() {
            System.out.println("To play fizzbuzz enter a number between 1-1000");
            int input = sc.nextInt();
            for (int i = 0; i < input; i++) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else System.out.println(i);
            }
        }
        public static void theTable(){
            System.out.print("What number would you like to go up to?");
            int userInt=sc.nextInt();
        System.out.println("The table");
        System.out.println();
        System.out.println(" | number | squared | cubed|");
        System.out.println("-| ------ |  -----  |  --- |");
        System.out.format("%10s|%10s|%10s|",userInt,userInt*userInt,userInt*userInt*userInt);
        }


        public static void letterGrades(){


        boolean confirm =true;
        while (confirm) {
    System.out.println("Enter the grade 1-100:");
    int grade = sc.nextInt();
    String letterGrade = "*";
    if (grade >= 0 && grade <= 100) {
        if (grade >= 98) letterGrade = "A+";
        else if (grade >= 91) letterGrade = "A";
        else if (grade >= 88) letterGrade = "A-";
        else if (grade >= 86) letterGrade = "B+";
        else if (grade >= 83) letterGrade = "B";
        else if (grade >= 80) letterGrade = "B-";
        else if (grade >= 78) letterGrade = "C+";
        else if (grade >= 75) letterGrade = "C";
        else if (grade >= 72) letterGrade = "C-";
        else if (grade >= 67) letterGrade = "D+";
        else if (grade >= 60) letterGrade = "D";
    } else letterGrade = "F";
    System.out.println("You got a(n) "+letterGrade);
            System.out.println();
            System.out.println("Do you wanna continue?");
    String answer=sc.next();
    if(!answer.toLowerCase().contains("y"))
        confirm=false;
    }
            System.out.println("Thank you for using my grading system");




}}
//    public static void fizzBuzz(){
//        System.out.println("Enter a number between 1-100");
//        int input=sc.nextInt();
//        for(int i=1;i<=input;i++) {
//            if (i % 15 == 0)
//                System.out.println("FizzBuzz");
//            else if (i % 5 == 0)
//                System.out.println("Fizz");
//            else if (i % 3 == 0)
//                System.out.println("Buzz");
//            else
////                System.out.println(i);
////        }
//            }












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
















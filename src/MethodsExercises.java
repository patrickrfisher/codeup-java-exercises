import java.util.Scanner;
public class MethodsExercises {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
//        ----Problem 1-----------
//        System.out.println(add(5,10));
//        System.out.println(subtract(5,10));
//        System.out.println(multi(5,10));
//        System.out.println(divide(10,5));
//        System.out.println(module(11,2));
////        ----------------problem 2------------------------
        System.out.print("Enter a number between 1 and 100:");
        int userIn = doInt(1, 100);
        System.out.println("User input:" + userIn);


//----------problem 3------------------
        doFactorial();
    }
//-----------------problem 1---------------------------------
//    public static String add(double num1, double num2){
//        double sum =  num1 +num2;
//        return "Function complete!" + sum;
//    }
//    public static double subtract(double num1, double num2){
//        return num1 -num2;
//    }
//    public static double multi(double num1, double num2){
//        return num1 * num2;
//    }
//    public static double divide(double num1, double num2){
//        return num1 / num2;
//    }
//    public static double module(double num1, double num2){
//        return num1 % num2;
//    }
//    ---------------------------------------------------------------
//    --------------problem 2--------------------------------
//    2. Create a method that validates that user input is in a certain range.
//
//        The method signature should look like this:
//            `public static int getInteger(int min, int max);`
//
//
//         and is used like this:
//             `System.out.print("Enter a number between 1 and 10: ");`
//             `int userInput = getInteger(1, 10);`
//
//        If the input is invalid, prompt the user again.
    public static int doInt(int min, int max){
        int input = sc.nextInt();
        if ( input >= min && input <= max){
            return input;
        }
        System.out.print("Invalid number! Try again:");
        return doInt(min,max);
    }
//-------------------------------------------------------------------
    //    3. Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//        Factorials are denoted by the exclamation point (n!).

    public static void doFactorial(){
        Scanner sc=new Scanner(System.in);
            boolean userCont =true;
            do {
                System.out.print("Enter a number between 1 and 100:");
                int userInput = doInt(1, 100);
                long factorial=1;
                System.out.println("You have entered" + userInput);
                for(int i=1;i<=userInput;i++){
                    factorial*=i;
                }
                System.out.println(userInput+"! ="+factorial+"\n\n");
                System.out.print("Wish to continue? (y/n)?");
                String userAns=sc.next();
                if (!userAns.equalsIgnoreCase("y")) {
                    userCont = false;
                }
                }while(userCont);
    }


}



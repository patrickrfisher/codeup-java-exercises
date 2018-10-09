import java.util.Scanner;

public class MethodsExercises {
    static Scanner sc = new Scanner(System.in);

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    //done without recusripon
    public static long getPower1(int base, int exponet) {
        long result = 1;
        for (int i = 1; i <= exponet; i++) {
            result = result * base;
            System.out.println(result);
        }
        return result;
    }

    public static long getPower(int base, int exponet) {
        if (exponet == 0) {
            return 1;
        } else if (exponet == 1) {
            return base;
        } else if (exponet == 2) {
            return base * base;
        }
        return base * getPower(base, exponet - 1);
    }

    public static void main(String[] args) {
//        getInteger(1,10);
        getInt(1,10);
        count(5);
        getPower(5, 5);
        System.out.println(add(1, 2));
        System.out.println(sub(6, 3));
        System.out.println(multi(2, 3));
        System.out.println(divi(6, 3));
        System.out.println(modu(10, 3));
        System.out.println(multiplyWithoutOperator(10, 4));
    }

    //-----problem one----
    public static String add(double num1, double num2) {
        double sum = num1 + num2;
        return "function complete added " + sum;
    }

    public static String sub(double num1, double num2) {
        double sub = num1 - num2;
        return "function completed sub:" + sub;
    }

    public static String multi(double num1, double num2) {
        double multi = num1 * num2;
        return "function completed multi:" + multi;
    }

    public static String divi(double num1, double num2) {
        double divi = num1 / num2;
        return "function completed divide: " + divi;
    }

    public static String modu(double num1, double num2) {
        double modu = num1 % num2;
        return "function completed modulus of: " + modu;
    }

    public static int multiplyWithoutOperator(int a, int numberOfTimes) {
        if (a == 0 || numberOfTimes == 0) {
            return 0;
        }
        int product = 0;
        if (a > 0 && numberOfTimes > 0) {
            while (numberOfTimes > 0) {
                product += a;
                numberOfTimes--;
            }
        } else if (a < 0 && numberOfTimes < 0) {
            while (numberOfTimes < 0) {
                product -= a;
                numberOfTimes++;
            }
        } else {
            if (a < numberOfTimes) {
                while (numberOfTimes > 0) {
                    product += a;
                    numberOfTimes--;
                }
            } else {
                while (numberOfTimes < 0) {
                    product -= a;
                    numberOfTimes++;
                }
            }
        }
        return product;
    }

//        ----Problem 1-----------
//        System.out.println(add(5,10));
//        System.out.println(subtract(5,10));
//        System.out.println(multi(5,10));
//        System.out.println(divide(10,5));
//////        ----------------problem 2------------------------
//        System.out.print("Enter a number between 1 and 100:");
//        int userIn = doInt(1, 100);
//        System.out.println("User input:" + userIn);
//
//
////----------problem 3------------------
//       System.out.print("Enter a number between 1 and 100:");
//
//        doFactorial();


    //-----------------problem 1---------------------------------
    public static int getInt() {
        int number = sc.nextInt();
        return number;
    }
    public static int getInt(int min, int max){
        System.out.println("enter a number between"+min+"and"+max);
        int number=getInt();
        if(number>=min&&number<=max){
            return number;
        }else{
            System.out.println(number+"is outside of range of "+min+"-"+max);
            return getInt(min,max);
        }
    }
    //        If the input is invalid, prompt the user again.
    //
    //             `int userInput = getInteger(1, 10);`
    //             `System.out.print("Enter a number between 1 and 10: ");`
    //         and is used like this:
    //
    //
    //            `public static int getInteger(int min, int max);`
    //        The method signature should look like this:
    //
    //    2. Create a method that validates that user input is in a certain range.
    //    --------------problem 2--------------------------------
    //    ---------------------------------------------------------------
    //    }
    //        return num1 % num2;
    //    public static double module(double num1, double num2){
    //    }
    //        return num1 / num2;
    //    public static double divide(double num1, double num2){
    //    }
    //        return num1 * num2;
    //    public static double multi(double num1, double num2){
    //    }
    //        return num1 -num2;
    //    public static double subtract(double num1, double num2){
    //    }
    //        return "Function complete!" + sum;
    //        double sum =  num1 +num2;
    //    public static String add(double num1, double num2){



}
//
//    public static int getInt(int min, int max){
//        int input = sc.nextInt();
//        if ( input >= min && input <= max){
//            return input;
//        }
//        System.out.print("Invalid number! Try again:");
//        return doInt(min,max);
//    }}
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




//    public static void doFactorial(){
//            boolean userCont =true;
//            do {
//                int userInput = doInt(1, 100);
//                long factorial=1;
//                System.out.println("You have entered" + userInput);
//                for(int i=1;i<=userInput;i++){
//                    factorial*=i;
//                }
//                System.out.println(userInput+"! ="+factorial+"\n\n");
//                System.out.print("Wish to continue? (y/n)?");
//                String userAns=sc.next();
//                if (!userAns.equalsIgnoreCase("y")) {
//                    userCont = false;
//                }
//                }while(userCont);
//    }
//





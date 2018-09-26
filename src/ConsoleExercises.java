import java.util.Scanner;


public class ConsoleExercises {
    private double pi;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double pi=3.14159;
//        System.out.format("the value of pi is aprox:%.2f%n",pi );
//        System.out.println("Enter a int");
//        int userInput=sc.nextInt();
//        String s1=sc.next();
//        String s2=sc.next();
//        String s3=sc.next();
//        System.out.format("%s%n%s%n%s%n",s1,s2,s3);
//        System.out.println("your word"+"\n"+s1+"\n"+s2+"\n"+s3);
//        System.out.println("Enter three words");
//        String userInputs=sc.nextLine();
//        System.out.printf("words:%s",userInputs);
        System.out.println("Enter the length");
        String userInput=sc.nextLine();
        System.out.println("enter the width");
        String userInput2=sc.nextLine();
        int input= Integer.parseInt(userInput);
        int input2=Integer.parseInt(userInput2);
        System.out.println(input);
        System.out.println(input2);
        System.out.println("the area is " + input*input2);
        System.out.println("the perm is " + (2*(input+input2)));










//        System.out.print("Enter a integer: ");
//        int num =sc.nextInt();
//        System.out.print("You enetered %s!"+ num);
//        double pi = 3.14159;
//        System.out.format("the value of pi is aprox %.4f",pi);
//Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a integer: ");
//        double val1 = sc.nextDouble();
//        System.out.format("You have entered %.2f",val1);
//        -------------------------------------------------
//        System.out.println("Please enter 3 words:");
//        String s1= sc.next();
//        String s2= sc.next();
//        String s3= sc.next();
//        System.out.format("%s%n%s%n%s%n",s1,s2,s3);

//        System.out.println(s2);
//        System.out.println(s3);
//-------------------------------------------------
//        System.out.println("Please tell me a story in one sentence:");
////        sc.next();
//        String sentence = sc.nextLine();
//        System.out.println(sentence);


//            System.out.println("Enter the length of the classroom:");
//            int length =Integer.parseInt(sc.nextLine());
////            sc.nextLine();
//            System.out.println("Enter the width of the classroom:");
//            int width = Integer.parseInt(sc.nextLine());
//            int area = length*width;
//            System.out.println("The area of class is "+ area);
//            int perm= 2*(length+width);
//            System.out.println("The perim of class is "+ perm);
//

    }
}

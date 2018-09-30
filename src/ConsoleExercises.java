import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;

public class ConsoleExercises {



    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter something:");
//      String userInput=sc.nextLine();
//      System.out.println("You entered:-->\" " + userInput + " \"<--");
//        Calender c =Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te%n", c, c);
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n",c, c, c);
//        double pi= 3.14159;
//        System.out.format("The value of pie:%.2f%n",pi);
//        System.out.println("Enter a int bro:");
//        int userInput=sc.nextInt();
//        System.out.println(userInput);
//        System.out.print("Enter a string bro:");
//        String s1=sc.next();
//        String s2=sc.next();
//        String s3=sc.next();
//        System.out.format("%s%n%s%n%s%n",s1,s2,s3);
//        String userInputs=sc.nextLine();
//        System.out.println("Enter three words home slice");
//        String userInputss=sc.nextLine();
//        System.out.printf("words:%s",userInputss);
//      System.out.print
//        System.out.println("Hello, lets have a word?");
//        String userString=sc.nextLine();
//        System.out.println(userString);
//        System.out.println("Give me three words human");
//        String s1=sc.next();
//        String s2=sc.next();
//        String s3=sc.next();
//        System.out.format("%s%n%s%n%s%n",s1,s2,s3);
//
//        System.out.println("Enter the class length");
//        int length=sc.nextInt();
//        System.out.println("Enter the class width");
//        int width=sc.nextInt();
//        int area=length*width;
//        int perm=(2*(length+width));
//        System.out.format("The area is: "+area+" The perm is:"+perm);
//



//        System.out.print("Continue? [Y/N] ");
//        String userInput=sc.next();
//        boolean confirmation=userInput.equalsIgnoreCase("y");
//        System.out.println(confirmation);
//        boolean someCondition = false;
//        boolean someOtherCondition = true;

//        if (confirmation) {
//            // executes if someCondition is true
//        } else if (someOtherCondition) {
//            // executes if someOtherCondition is true *and* all of the previous ifs in
//            // this block were false
//        } else {
//            // executes if none of the conditions checked in this block were true
//        }
//
//        int caseSwitch =1;
//        switch(caseSwitch){
//            case 1:
//                System.out.println("this is case 1");
//                //falls through
//            case 2:
//                System.out.print("this is case 2");
//                break;
//            default:
//                System.out.println("defaulted case");
//                break;
//        }

//        int i=0;
//        while(i<10){
//            System.out.println("i is "+i);
//            i++;
//        }

//        do{System.out.println("You will see this once");
//            //statements;
//        }while(true);
//
        for (int i=0;i<=10;i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }





    }
}
//        double pi=3.14159;
//        System.out.format("the value of pi is aprox:%.2f%n",pi );
//        System.out.println("Enter a int");
//        int userInput=sc.nextInt();
//        String s1=sc.next();
//        String s2=sc.next();
//        String s3=sc.next();
//        System.out.format("%s%n%s%n%s%n",s1,s2,s3);
//        System.out.println("your word"+"\n"+s1+"\n"+s2+"\n"+s3);
//        System.out.println("Enter the length");
//        String userInput=sc.nextLine();
//        System.out.println("enter the width");
//        String userInput2=sc.nextLine();
//        int input= Integer.parseInt(userInput);
//        int input2=Integer.parseInt(userInput2);
//        System.out.println(input);
//        System.out.println(input2);
//        System.out.println("the area is " + input*input2);
//        System.out.println("the perm is " + (2*(input+input2)));










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


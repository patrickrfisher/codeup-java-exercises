import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
//        String wrangell =new String("Hello World");
//        String hello ="hello";
//        wrangell.equalsIgnoreCase(hello.toLowerCase());
//        wrangell.startsWith("Hello W");
//        wrangell.endsWith("orld");
//        char letter = wrangell.charAt(7);
//        int firstPlace = wrangell.indexOf('l');//2
//        int lastPlace = wrangell.lastIndexOf('l');//9
//        wrangell.length();
//        wrangell.replace("l","p");
        Scanner sc=new Scanner(System.in);
//    String message ="Hello";
//        System.out.println(message);
//        message = message+" world!";
//        System.out.println(message);
//        System.out.print("Continue? [y/n]");
//        String userInput=sc.next();
//        boolean confirmation = userInput=="y";
//        System.out.println(userInput);

//        String input="Codeup Rocks!";
//        input.equals("codeup rocks!");//false
//        input.equals("Codeup Rocks!");//true
//
//        input.equalsIgnoreCase("codeup rocks!");//true
//        input.equalsIgnoreCase("Codeup Rocks!");//true
//
//        input.startsWith("codeup");//false
//        input.startsWith("Codeup");//true
//
//        input.endsWith("rocks");//false(because no !)
//        input.endsWith("rocks!");//false(because it is case sensitive
//        input.endsWith("Rocks!");//true
//
//        System.out.println(input.startsWith("Codeup"));
        String message="We don't need no education" + "\n" +
                "We don't need no thought control";
        System.out.print(message);
        System.out.println();
        message ="Check \"this\" out!, \"s inside of \"s!\n";
        System.out.print(message);
        System.out.println();
        message="In windows, the main drive is usually C:\\";
        System.out.print(message);
        System.out.println();
        message="I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.print(message);
        System.out.println();
    }
}

import java.util.Scanner;

//Create a class named Bob with a main method for the following exercise.
//
//Bob is a lackadaisical teenager. In conversation,
// his responses are very limited.
//
//Bob answers 'Sure.' if you ask him a question.
// (the input ends with a question mark)
// He answers 'Whoa, chill out!' if you yell at him.
// (the input ends with an exclamation mark)
// He says 'Fine. Be that way!' if you address him without actually
// saying anything. (empty input)
// He answers 'Whatever.' to anything else.
// Write the Java code necessary so that a user of your
// command line application can have a conversation with Bob.
public class Bob {


    public static void main(String[] args) {
        Scanner bobsEars = new Scanner(System.in);
        String whatYouSay;
        boolean havingANiceConvo=true;
        System.out.println("Bob sits down in front of you");
        do{
           whatYouSay=bobsEars.nextLine();
           if(whatYouSay.endsWith("?")){
               System.out.println("Sure");
           }else if(whatYouSay.endsWith("!")){
               System.out.println("Whoa,chill out!");
           }else if(whatYouSay.isEmpty()){
               System.out.println("Fine.Be that way!");
           }else if(whatYouSay.toLowerCase().contains("bye")){
               havingANiceConvo=false;
               System.out.println("Bob has walked away");
           }else{
               System.out.println("Whatever.");
           }
        }while(havingANiceConvo);
    }



}
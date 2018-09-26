package grades;
import java.util.HashMap;
import java.util.Scanner;
public class GradesApplication {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String,Student>students=new HashMap<>();
        boolean flag=true;
        students.put("patreak",new Student("Patrick"));
        students.put("Juhn",new Student("John"));
        students.put("chuggin",new Student("Chad"));
        students.put("bbradd",new Student("Brad"));
        students.get("patreak").addGrade(100);
        students.get("patreak").addGrade(100);
        students.get("patreak").addGrade(100);
        students.get("Juhn").addGrade(70);
        students.get("Juhn").addGrade(90);
        students.get("Juhn").addGrade(80);
        students.get("chuggin").addGrade(75);
        students.get("chuggin").addGrade(85);
        students.get("chuggin").addGrade(95);
        students.get("bbradd").addGrade(79);
        students.get("bbradd").addGrade(89);
        students.get("bbradd").addGrade(94);
        System.out.println("The github usernames of our students:");
        for(String key :students.keySet()){
            System.out.printf("|%s| ",key);
        }
        while(flag){
            System.out.println("\nWhich student do you wanna check out?");
            System.out.print("> ");
            String choice=input.nextLine();
            if(!students.containsKey(choice)){
                System.out.printf("\nSorry, no students found with the github username of %s\n",choice);
                }else{
                System.out.printf("Name:%s - Github Username: %s\n",
                        students.get(choice).getName(),choice);
                System.out.printf("Current average: %f\n",students.get(choice).getGradeAverage());
            }
            System.out.println("Would you like to see another student?");
            System.out.print("> ");
            String keepGoing = input.nextLine();
            flag=keepGoing.equals("y")||keepGoing.equals("yes");
        }
        System.out.println("Goodbye,have a good day!");

    }
}

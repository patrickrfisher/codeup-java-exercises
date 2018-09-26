package grades;
import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double total=0;
        for (int grade:grades){
            total +=grade;
        }
        return total/grades.size();
    }
    public Student(String name){
        this.name=name;
        this.grades=new ArrayList<>();
    }

    public static void main(String[] args) {
        Student s1= new Student("Patrick");
        Student s2= new Student("Hunter");
        Student s3= new Student("Daniel");
        s1.addGrade(87);
        s1.addGrade(80);
        s1.addGrade(81);
        s1.addGrade(89);
        s2.addGrade(98);
        s2.addGrade(92);
        s2.addGrade(97);
        s3.addGrade(100);
        s3.addGrade(57);
        s3.addGrade(67);
        System.out.printf("%s average grade is %f\n", s1.getName(), s1.getGradeAverage());
        System.out.printf("%s average grade is %f\n", s2.getName(), s2.getGradeAverage());
        System.out.printf("%s average grade is %f\n", s3.getName(), s3.getGradeAverage());


    }
}

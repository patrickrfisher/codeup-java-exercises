public class Person{
    public static void main(String[] args) {
     Person p=new Person("Patrick");
        System.out.println(p.getName());
     p.sayHello();
     Person person89=new Person("Ryan");
     person89.sayHello();
     Person person88=new Person("Hunter");
     person88.sayHello();
     Person person1=new Person("John");
     Person person2=person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(p.getName());

    }

    private String name;
//this is a getter for getting the name
    public String getName(){
        return name;
    }

//This is a setter for setting a name
    public void setName(String name){
        this.name=name;
    }

    public Person(String name){
        setName(name);
    }
    public void sayHello(){
        System.out.println("Hello " + name);
    }

}

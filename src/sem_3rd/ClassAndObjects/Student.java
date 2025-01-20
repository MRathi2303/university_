package sem_3rd.ClassAndObjects;

public class Student {
   public String name;
   public int age;
    public void display(){
        System.out.println("Name is "+name);
        System.out.println("age is "+age);
    }
    public Student(){
        System.out.println("this is first constructor");
    }

    public Student(String name,int age){
        this();
        System.out.println("this is second constructor");
    }


public static void main(String[] args){
    //Student s1 = new Student();
    //Student s2 = new Student("rahul", 18);
    
}

}

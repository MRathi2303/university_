package ClassAndObjects;

public class Student {
   public String name;
   public int age;
    public void display(){
        System.out.println("Name is "+name);
        System.out.println("age is "+age);
    }
    public Student(){
        System.out.println("hello world");
    }


public static void main(String[] args){
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    //s1.display();
}

}

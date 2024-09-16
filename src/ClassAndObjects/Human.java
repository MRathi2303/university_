package ClassAndObjects;

public class Human {
    private String Name;
    private int age;

    public Human(String Name , int age){
        this.Name = Name;
        this.age=age;
    }

    public void display(){
        System.out.println("Name:"+this.Name);
        System.out.println("Age:"+this.age);
    }

    
}

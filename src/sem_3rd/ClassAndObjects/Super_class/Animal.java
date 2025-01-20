package sem_3rd.ClassAndObjects.Super_class;

public class Animal {
    String Sound;
    public Animal(){
        System.out.println("constructor of the default parent class");
    }
    public Animal(String sound){
        System.out.println("parameterised constructor of the parent class");
    }
}

class Dog extends Animal {
    
    Dog(){
        System.out.println("constructor of the child class");
    }
    Dog(String sound){
        System.out.println("parameterised constructor of the child class");
    }

public static void main(String[] args) {
    //Dog D = new Dog();
    //Dog D2 = new Dog("bark");

}
    
}

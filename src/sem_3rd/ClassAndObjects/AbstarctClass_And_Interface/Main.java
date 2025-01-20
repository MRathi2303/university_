package sem_3rd.ClassAndObjects.AbstarctClass_And_Interface;

public class Main {
    public static void main(String[] args) {
        Abstract_class obj1 = new Abstract_class();
        obj1.greeting();
        obj1.weather();

        C1 obj = new C1();
        obj.greet();
    }
}

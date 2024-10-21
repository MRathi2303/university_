package ClassAndObjects.Abstarct_class;

abstract class A1{
    abstract void greeting();

    void weather(){
        System.out.println("how is the weather?");
    }
}

class Abstract_class extends A1 {
    void greeting(){
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        Abstract_class obj1 = new Abstract_class();
        obj1.greeting();
        obj1.weather();
    }
}

package ClassAndObjects.AbstarctClass_And_Interface;

abstract class A1 {
    abstract void greeting();

    void weather() {
        System.out.println("How is the weather?");
    }
}

interface A {
    void greet();
    String response = "hey"; // Variables in an interface are always final and static.
}

class C1 implements A {
    public void greet() {
        System.out.println("Hi! How are you?");
    }
}

class Abstract_class extends A1 {
    void greeting() {
        System.out.println("Hello!");
    }
}


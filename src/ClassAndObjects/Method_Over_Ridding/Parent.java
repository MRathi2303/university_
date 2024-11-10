package ClassAndObjects.Method_Over_Ridding;

public class Parent {
    int marks = 100;
    public void display(){
        System.out.println("parent class fxn");
    }

    public class Child extends Parent{
        public void display(){
            System.out.println("child class fxn");
        }
    }

    public void main(String[] args) {

        Parent p1 = new Parent();
        Child c1 = new Child();
        p1.display();
        p1.marks=10;
        c1.display();
        Parent obj = new Child();
        obj.display();

    }
}


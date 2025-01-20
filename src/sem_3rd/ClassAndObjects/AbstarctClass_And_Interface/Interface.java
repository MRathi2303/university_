package sem_3rd.ClassAndObjects.AbstarctClass_And_Interface;

// Purpose of Interface:
// Using an interface allows for a common method signature (size()) across different classes (Car, Bike).
// This enables us to pass any object that implements the Wheels interface to the method 'tyre' in Air_pressure.
// It promotes flexibility and reusability by allowing the method to operate on various types of "Wheels".

interface Wheels {
    void size();
}

class Car implements Wheels {
    public void size() {
        System.out.println("17 inch alloy - 35 psi");
    }
}

class Bike implements Wheels {
    public void size() {
        System.out.println("26 inch spoke - 35 psi");
    }
}

class Air_pressure {
    public void tyre(Wheels wheel) {
        wheel.size(); // Call the size() method on the Wheels object
    }
}

public class Interface {
    public static void main(String[] args) {
        Air_pressure obj1 = new Air_pressure();

        Car car = new Car();
        Bike bike = new Bike();

        obj1.tyre(car); // Pass Car instance
        obj1.tyre(bike); // Pass Bike instance
    }
}

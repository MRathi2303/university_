import airthemeticClass.addition;
import airthemeticClass.subtraction;

public class result {


    public static void main(String[] args) {
        addition addition = new addition(); // creating object out of addition class

        int a = 20;
        int b = 8;

        addition.setNum1(a,b);

        int sum = addition.sum();

        System.out.println("airthemeticClass.addition of a and b: "+sum);

        subtraction subtraction =new subtraction(); // creating object out of subtraction class

        subtraction.setNum1(a,b);

        System.out.println("airthemeticClass.subtraction of a and b : "+subtraction.sub());




    }


}

package collection_ArrayList;

import java.util.ArrayList;
public class intro {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("abed");
        List.add("few");
        List.add("body");
        List.add("ace");
        List.add(0, "first");
        System.out.println(List.get(2));
        List.set(0,"first1");


        System.out.println(List);

    }
}
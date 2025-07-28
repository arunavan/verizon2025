package day6.collections;
import java.util.*;

public class LowerBoundExample {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10); // OK
        list.add(20); // OK
        // list.add(3.14); // Error: can't add Double to <? super Integer>
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(numList); // valid
        addNumbers(objList); // valid

        System.out.println(numList); // prints [10, 20]
    }
}

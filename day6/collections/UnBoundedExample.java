package day6.collections;
import java.util.*;

public class UnBoundedExample {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
        
    }

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "b", "c");
        printList(strList); // prints a b c
        
        List<Integer> list1 = Arrays.asList(5,7,8);
        printList(list1); // prints a b c
        
        List<Double> list2 = Arrays.asList(5.0,7.0,8.0);
        printList(list2); // prints a b c
    
    }
}
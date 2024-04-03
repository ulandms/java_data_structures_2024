import java.util.ArrayList;
import java.util.Collections;

/*
   The Comparable Interface has one abstract method header in it

   public interface Comparable<E> {
        public abstract int compareTo(E other);

   }
   String class already has compareTo implemented for us
 */
public class ComparableExample {

    public static void main(String[] args) {
        String bob = "Bob";
        String jose = "Jose";

        int result = bob.compareTo(jose);
        // returns an integer < 0 because Bob comes before Jose alphabetically/lexiographically from the ASCII table
        System.out.println("Expected < 0: " + result);

        // returns an integer > 0 because Jose comes after Bob
        result = jose.compareTo(bob);
        System.out.println("Expected > 0: " + result);

        // returns 0 if the strings contain the same characters
        result = bob.compareTo(bob);
        result = jose.compareTo(jose);
        System.out.println("Expected = 0: " + result);

        // prints out a value > 0 since Brain comes after Bob
        System.out.println("Brain".compareTo("Bob"));

        ArrayList<String> names = new ArrayList<>();
        names.add(jose);
        names.add(bob);
        names.add("Abby");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

    }


}

import java.util.*;

public class PersonTester {
    public static void main(String[] args) {
        Person bob = new Person("Bob", 25);
        Person jose = new Person("Jose", 18);
        Person abby = new Person("Abby", 65);
        Person abby2 = new Person("Abby", 53);
        // bob is this, jose is other
        int result = bob.compareTo(jose);
        System.out.println(result);

        // construct an ArrayList of Person type and add the objects
        ArrayList<Person> list = new ArrayList<>();
        list.add(bob);
        list.add(jose);
        list.add(abby);
        list.add(abby2);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

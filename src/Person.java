public class Person implements Comparable<Person> {
    // instance fields
    private String name; // null
    private int age; //0

    // constructor - parameterized

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // order by age in increasing order
    public int compareTo(Person other) {
        /*
        // this person goes after other person
        if (this.age > other.age) {
            return 1;
        }

        if (this.age < other.age) {
            return -1;
        }

        // if(this.age == other.age){
        return 0;
        */

        //  return this.age - other.age;
        // sort by name instead

        //return this.name.compareTo(other.name);
        // sort by name, then if names are equal sort by ages
        if(this.name.compareTo(other.name) == 0){
            // compare the ages
            return this.age - other.age;
        }
        return name.compareTo(other.name);

    }
    // toString()

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


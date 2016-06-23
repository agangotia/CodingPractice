package fundamentals;

/**
 * Created by anupam on 6/22/16.
 * Thi class shows equals & hashCode
 */
public class Person {
    String name;

    public Person(String a) {
        name=a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

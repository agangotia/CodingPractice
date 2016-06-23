package fundamentals;

/**
 * Created by anupam on 6/22/16.
 */
public class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return (this.age-o.age);
    }
}

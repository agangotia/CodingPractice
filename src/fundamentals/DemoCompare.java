package fundamentals;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by anupam on 6/22/16.
 */
public class DemoCompare {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Anupam",50));
        list.add(new Employee("Shruti",40));
        list.add(new Employee("facebook",400));

        Collections.sort(list);
        for(Employee item :list)
            System.out.println("Name:"+item.name+", age:"+item.age);

    }
}

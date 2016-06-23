package fundamentals;

/**
 * Created by anupam on 6/22/16.
 */
public class DemoEquals {



    public static void main(String[] args) {

        Person p1 = new Person("anupam");
        Person p2 = new Person("anupam");

        if (p1==p2)
            System.out.println("equals");
        else
            System.out.println("not equals");

        if (p1.equals(p2))
            System.out.println("equals");
        else
            System.out.println("not equals");

    }
}

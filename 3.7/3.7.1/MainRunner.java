import java.util.ArrayList;

public class MainRunner {
    public static void main(String[] args)
    {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person(18,5.5,"Sally"));
        people.add(new Person(25,6.0,"Joe"));
        people.add(new Person(40,5.7,"Ella"));
        System.out.println(people);
    }
    
}

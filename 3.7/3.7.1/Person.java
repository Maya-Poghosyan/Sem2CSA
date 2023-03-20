public class Person {
    private int age;
    private double height;
    private String name;
    
    // constructor
    public Person(int a, double h, String n)
    {
        age = a;
        height = h;
        name = n;
    }
    
    public String toString()
    {
        String info = name + ", aged " + age + " height is " + height + " feet";
        return(info);

    }
}

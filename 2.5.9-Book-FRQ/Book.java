public class Book 
{ 
    private String title; 
    private String author; 
    private double price; 
    // part A: constructor
    public Book(String t, String a, double p)
    {
        title = t;
        author = a;
        price = p;
    }
    public double getPrice() 
    { 
    return price; 
    } 
    /** Decreases book price by the given amount byPercent 
    */ 
    public void giveDiscount(double byPercent) 
    {
        price = price * (1-byPercent);
    } 
} 

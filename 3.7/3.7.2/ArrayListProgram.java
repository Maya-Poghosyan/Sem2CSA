import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args)
    {
        // initialize with 3 items
        ArrayList<String> foods = new ArrayList<String>();
        foods.add("Eggs");
        foods.add("Bacon");
        foods.add("Pancakes");
        // display contents
        System.out.println(foods);
        // give choice
        System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, or re(p)lace?\n");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        // adding
        if (choice.equals("a"))
        {
            System.out.println("Type in a food to add.\n");
            Scanner scan2 = new Scanner(System.in);
            String newFood = scan2.nextLine();
            foods.add(newFood);
        }
        // insert at position
        if (choice.equals("i"))
        {
            System.out.println("Type in a food to add.\n");
            Scanner scan2 = new Scanner(System.in);
            String newFood = scan2.nextLine();
            foods.add(newFood);
            System.out.println("Enter a position.\n");
            Scanner scan3 = new Scanner(System.in);
            int position = scan3.nextInt();
            // doesn't allow to select 0 - follows layperson logic of index 1 first and checks against size
            if (position == 0 || (position-1) > foods.size())
            {
                System.out.println("Bad number! Run again!");
            }
            foods.add(position-1,newFood);
        }
        // remove at an index
        if (choice.equals("r"))
        {
            System.out.println("Type in a position for the element you want to remove.\n");
            Scanner scan4 = new Scanner(System.in);
            int position = scan4.nextInt();
            if (position == 0 || (position-1) > foods.size())
            {
                System.out.println("Bad number! Run again!");
            }
            foods.remove(position-1);
        }
        // replace at an index
        if (choice.equals("p"))
        {
            System.out.println("Type in the index you would want to replace.\n");
            Scanner scan5 = new Scanner(System.in);
            int position = scan5.nextInt();
            if (position == 0 || (position-1) > foods.size())
            {
                System.out.println("Bad number! Try again!");
            }
            System.out.println("Type in the new food with which you would like to replace the preexisting item at the index with.\n");
            Scanner scan6 = new Scanner(System.in);
            String newFood = scan6.nextLine();
            foods.set(position-1,newFood);
        }
    }   
}

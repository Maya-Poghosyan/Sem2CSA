/*
 * Activity 3.7.2
 */
import java.util.ArrayList;

public class ArrayListExample
{  
   public static void main(String args[])
   {  
      ArrayList<String> animalList = new ArrayList<String>();  
      animalList.add("Dog");
      animalList.add("Cat");
      animalList.add("Rabbit");
      animalList.add("Frog");
      animalList.add("Horse");
      animalList.add("Cow");
      // add bird
      animalList.add("Bird");
      // add snake
      animalList.add(3, "Snake");
      // remove frog
      animalList.remove(4);

      // print size
      System.out.println("Size:" + animalList.size());
      
      // isplaying elements
      System.out.println(animalList);
      
      /* your code here */ 
      
      // display elements
      System.out.println(animalList);
   }  
}

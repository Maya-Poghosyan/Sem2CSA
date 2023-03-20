/*
 * Activity 3.6.3
 */
public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets (does not require looping)
    Pet[] pets = {new Pet("Kitty1",1),new Pet("Kitty2",1), new Pet("Puppy1",2), new Pet("Puppy2",2)};
    System.out.println(pets);
    
    // adopt (create and name) four pets, two cats, two dogs (does not require looping)
    // done above

    // first things first, feed your pets
    for (Pet p : pets)
    {
        p.feed();
    }

    // next, make yourself the owner of all of your new pets
    for (Pet p : pets)
    {
        p.setOwner("Maya");
    }

    // your dogs make some noise, take them for a walk
    for (Pet p : pets)
    {
        if (p.getType() == 2)
        {
            p.walk();
        }
    }

    // when you get back, your cats make some noise
    for (Pet p : pets)
    {
        if (p.getType() == 1)
        {
            p.makeNoise();
        }
    }
    
    // give all of your pets a treat

    for (Pet p : pets)
    {
        p.giveTreat();
    }

    // groom your cats
    for (Pet p : pets)
    {
        if (p.getType() == 1)
        {
            p.groom();
        }
    }

    // grooming is done, play with all pets
    for (Pet p : pets)
    {
        p.play();
    }

    // whew, that was tiring, all pets nap and get fed
    for (Pet p : pets)
    {
        p.sleep();
        p.feed();
    }

    System.out.println("--- MY PETS ---");

    // show the state of all of your pets
    for (Pet p : pets)
    {
        System.out.println(p);
    }
    
    // You decide to get a couple of pets for your friend (does not require looping)
    Pet[] friendsPets = {new Pet("KittyA",1),new Pet("PuppyB",2)};

    // set the owner of the new pets to your friends name
    for (Pet p : friendsPets)
    {
        p.setOwner("FriendsName");
    }
    
    System.out.println("--- MY PETS ---");

    // show the state of all of your pets
    for (Pet p : pets)
    {
        System.out.println(p);
    }
  }
}

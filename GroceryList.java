import java.util.Scanner;

public class GroceryList
{
    public static void main(String[]args)
    {

    System.out.println("Please list three items on your grocery shopping list.");
        Scanner keyboard=new Scanner(System.in);
      String ItemOne;
      System.out.print("Item1?");
      ItemOne = keyboard.next();

      String ItemTwo;
      System.out.print("Item2?");
        ItemTwo = keyboard.next();

        String ItemThree;
        System.out.print("Item3?");
        ItemThree = keyboard.next();

        System.out.println("Now, please enter the quantity of each item.");
        int Milk1;
        System.out.print("How many milk?");
        Milk1=keyboard.nextInt();
        int Bread1;
        System.out.print("How many bread?");
        Bread1=keyboard.nextInt();
        int eggs1;
        System.out.print("How many eggs?");
        eggs1=keyboard.nextInt();

        System.out.println("Now, please enter the price of each item.");
        double milkcost;
        System.out.print("How much does one milk cost?");
        milkcost=keyboard.nextDouble();

        System.out.print ("How much does one bread cost?");
        double breadcost;
        breadcost=keyboard.nextDouble();

        System.out.print("How much does one eggs cost?");
        double eggscost;
        eggscost=keyboard.nextDouble();

        System.out.println("Calculating your grocery bill.");


    System.out.println("Your total cost is "+ (milkcost * Milk1 + breadcost* Bread1 + eggscost * eggs1)+".");
    }
}

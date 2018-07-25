package com.jetbrains;

import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

                out.println("The sales goal for veggie sandwiches is"+goalForVeggies+".");
        int NumberOfVeggie;
        out.println("How many veggie sandwiches were sold today?");
        NumberOfVeggie = keyboard.nextInt();

        if (NumberOfVeggie <50)
        {
            out.println("Fell short for veggie.");
        }
        else
        {
            out.println("Meets goal for veggie.");
        }
                out.println("The sales goal for burgers is"+goalForBurgers+".");
        int NumberOfBurgers;
        out.println("How many burgers were sold today?");
        NumberOfBurgers = keyboard.nextInt();

        if (NumberOfBurgers <250)
        {
            out.println("Fell short");
        }
        else
        {
            out.println("Meets goal for burgers.");
        }
        out.println("The sales goal for subs is"+goalForSubs+".");
        int NumberOfSubs;
        out.println("How many subs were sold today?");
        NumberOfSubs = keyboard.nextInt();

        if (NumberOfSubs <180)
        {
            out.println("Fell short");
        }
        else
        {
            out.println("Meets goal for subs");
        }
        out.println("The sales goal for soup is"+goalForSoup+".");
        int NumberOfSoup;
        out.println("How many soup were sold today?");
        NumberOfSoup = keyboard.nextInt();

        if (NumberOfSoup <70)
        {
            out.println("Fell short");
        }
        else
        {
            out.println("Meets goal for soup");
        }

        if (NumberOfVeggie>= 50 && NumberOfBurgers>= 250 && NumberOfSubs>=180 && NumberOfSoup>=70)
            out.println("Made goal for everything!");
    }
}
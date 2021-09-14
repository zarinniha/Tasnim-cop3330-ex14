/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class taxCalculator{

    public static void main(String args[])
    {
        double tax=0;
        System.out.print("What is the order amount? ");
        Scanner sc= new Scanner(System.in);
        double amount = sc.nextDouble();

        System.out.print("What is the state? ");
        Scanner obj1=new Scanner(System.in);
        String state = obj1.nextLine();

        if(state.equalsIgnoreCase("WI")) //only using if statement
        {
            tax = amount*( 5.5/100);


        }
        double total = amount+tax;
        //using a single output
        System.out.print(state.equalsIgnoreCase("WI")?String.format("The subtotal is %.2f\nThe tax is %.2f\nThe total is %.2f",amount,tax,total)
                :String.format("The total is %.2f",total)); //money rounded up to nearest penny



    }
}
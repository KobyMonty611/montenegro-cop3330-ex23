/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter \"y\" for yes and \"n\" for no.\nIs the car silent when you turn the key?");
        String input = scan.nextLine();

        if(input.equals("y"))
        {
            System.out.println("Are the battery terminals corroded?");
            input = scan.nextLine();

            if(input.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else
        {
            System.out.println("Does the car make a slicking noise?");
            input = scan.nextLine();

            if(input.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.println("Does the car crank up but fail to start?");
                input = scan.nextLine();

                if(input.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.println("Does the engine start and then die?");
                    input = scan.nextLine();

                    if (input.equals("y"))
                    {
                        System.out.println("Does your car have fuel injection?");
                        input = scan.nextLine();

                        if (input.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");

                    }
                }
            }
            scan.close();
        }
    }
}

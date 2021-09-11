/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner

public class App {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);    //Scanner to obtain input
        //Using try..catch statement
        try {
            System.out.println("Enter the first number: ");
            String first = sc.nextLine();   //Obtain input from the user
            Double one = Double.parseDouble(first); //Convert user input from string to double

            System.out.println("Enter the second number: ");
            String second = sc.nextLine();  //Obtain input from the user
            Double two = Double.parseDouble(second);    //Convert user input from string to double

            System.out.println("Enter the third number: ");
            String third = sc.nextLine();   //Obtain input from the user
            Double three = Double.parseDouble(third);   //Convert user input from string to double

            double largest_number = one;    //Setting the 1st number to be the largest
            //Using if-else statement
            if (largest_number < two) {  //If the 1st number is less than the 2nd number
                largest_number = two;   //The new largest number will be the 2nd number
            } else if (largest_number < three) {    //If the 2nd number is less than the 3rd number
                largest_number = three; //The new largest number will be the 3rd number
                }
            System.out.printf("The largest number is %.0f.", largest_number);    //Display the largest number
            }
        catch (NumberFormatException e) {
            //display this message if the user inputs non-numeric values
            System.out.println("Invalid input. Please enter numeric values only.");
        }
    }
}

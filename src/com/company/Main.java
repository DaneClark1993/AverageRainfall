package com.company;

import java.util.Scanner; // Imports Scanner class

/** This program has been designed to calculate total and average
 *  rainfall data across a number of user-defined years.
 */

public class Main {

    public static void main(String[] args) {
        int totalMonths; // Declares variable to contain total months
        int months = 0; // Declares variable acting as a month counter
        int years; // Declares variable to contain user-entered years
        int yearCounter = 1; // Declares variable acting as counter to display current year

        float averageTotalRainfall; // Declares variable to hold calculated average rainfall
        float totalRainfall = 0; // Declares variable to store total rainfall

        Scanner keyboard = new Scanner(System.in); // Declares variable to read user input

        System.out.print("Enter the number of years: ");
        years = keyboard.nextInt(); // Assigns user-entered integer as no. of years to record monthly rainfall

        totalMonths = 12 * years; // Calculates total number of months to record rainfall for

        System.out.println("Enter the rainfall, in centimetres, for each month.");

        while (years > 0) { // Outer loop keeping track of the number of years to record data
            while (months < 12) { // Inner loop recording ranfall per month of each year
                months += 1;
                System.out.print("Year " + yearCounter + " month " + months + ": ");
                totalRainfall += keyboard.nextFloat(); // Records user input as float for total rainfall
            }
            if (months == 12) { // Checks that end of the year has been reached, resets months to 0
                months -= 12;
            }
            yearCounter += 1; // Increases counter to display next year
            years -= 1; // Reduces user entered year value and is checked against outer loop
        }
        averageTotalRainfall = totalRainfall / totalMonths; // Calculates average rainfall
        System.out.println("Number of months: " + totalMonths); // Displays total amount of months
        System.out.println("Total rainfall: " + totalRainfall); // Displays total rainfall
        System.out.println("Average monthly rainfall: " + averageTotalRainfall); // Displays average rainfall
    }
}

// Testing changes, learning how to use Github Doobles
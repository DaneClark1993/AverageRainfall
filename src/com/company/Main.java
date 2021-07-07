package com.company;

import java.util.Scanner; // Imports Scanner class

/**
 * This program has been designed to calculate total and average
 * rainfall data across a number of user-defined years.
 */

public class Main {

    public static void main(String[] args) {
        int totalMonths; // Variable containing total months
        int months = 0; // Variable acting as a month counter
        int years; // Variable containing user-entered years
        int yearCounter = 1; // Variable acting as counter to display current year

        float averageTotalRainfall; // Variable holding calculated average rainfall
        float totalRainfall = 0; // Variable to store total rainfall
        float totalRainfallCheck; // Variable to check value is not negative

        Scanner keyboard = new Scanner(System.in); // Variable to read user input

        System.out.print("Enter the number of years: ");
        years = keyboard.nextInt(); // Assigns user-entered integer as no. of years to record monthly rainfall
        if (years <= 0) {
            System.out.println("Number of years entered must be greater than 0.");
            System.out.println("Please restart program and try again.");
            System.exit(0);
        }

        totalMonths = 12 * years; // Calculates total number of months to record rainfall for

        System.out.println("Enter the rainfall, in centimetres, for each month.");

        while (years > 0) { // Outer loop keeping track of the number of years to record data
            while (months < 12) { // Inner loop recording ranfall per month of each year
                months += 1;
                System.out.print("Year " + yearCounter + " month " + months + ": ");
                totalRainfallCheck = keyboard.nextFloat(); // Records user input as float for total rainfall
                if (totalRainfallCheck < 0) { // If rainfall entered is less than 0, loop until valid
                    while (totalRainfallCheck < 0) {
                        System.out.print("Invalid. Enter 0 or greater: ");
                        totalRainfallCheck = keyboard.nextFloat();
                    }
                }
                totalRainfall += totalRainfallCheck; // Adds valid input to totalRainfall
            }
            if (months == 12) { // Checks that end of the year has been reached, resets months to 0
                months -= 12;
            }
            yearCounter += 1; // Increases counter to display next year
            years -= 1; // Reduces user entered year value and is checked against outer loop
        }
        averageTotalRainfall = totalRainfall / totalMonths; // Calculates average rainfall
        System.out.println("Number of months: " + totalMonths);
        System.out.println("Total rainfall: " + totalRainfall);
        System.out.println("Average monthly rainfall: " + averageTotalRainfall);
    }
}
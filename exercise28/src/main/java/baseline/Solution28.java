/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

package baseline;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {

    // create scanner variable
    Scanner input = new Scanner(System.in);
    //create sum variable = 0
    int sum = 0;

    // for loop
        for(int i = 0; i < 5; i++){
            // prompt for number
            System.out.println("Enter an integer number: ");
            // scan number
            // add number to sum
            sum += input.nextInt();

        }//end for loop

    // prompt answer
    System.out.printf("The sum of the numbers is %d", sum);
    }//end main
}//end class

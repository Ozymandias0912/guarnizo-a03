/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

package baseline;

import java.util.Scanner;

public class helperClass {

    Scanner input = new Scanner(System.in);

    public String prompt(){

        System.out.println("Enter a list of numbers, separated by spaces:");

        return input.nextLine();

    }

    public String filterEvenNumbers(String list){

        String evenList = "";

        input = new Scanner(list);

        //using the space as a delimiter in the string
        input.useDelimiter(" ");

        while( input.hasNext() ){

            //reading number by number
            String number = input.next();

            //if the number is even, add it to the new string
            if( Integer.parseInt(number) % 2 == 0 ){

                evenList = evenList + " " + number;
            }
        }

        //return the filtered list
        return evenList;
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 *
 *  I do not know how to test a method that picks a random number
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {

        //instantiate helper class
        helperClass helper = new helperClass();

        //ask for names and add them to an array list in a while loop until I get the blank string
        Scanner input = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        String name = "Juan";

        while( !name.equals("")){

            name = helper.askNames(input);
            names.add(name);
        }
        //pick a random name from the list
        int winner = helper.pickWinner(names);

        //print the winner
        helper.printWinner(winner, names);

    }

}

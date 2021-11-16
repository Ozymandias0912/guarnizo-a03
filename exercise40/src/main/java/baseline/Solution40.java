/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */
package baseline;

import java.util.Scanner;

public class Solution40 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        helperClass helper = new helperClass();

        System.out.println("Enter a search string: ");

        String searchString = input.next();

        System.out.printf("Results: %n");

        helper.filter(helper.createMap(), searchString);


    }
}

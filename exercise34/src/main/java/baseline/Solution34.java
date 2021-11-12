/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {

    public static void main(String[] args) {
        //instantiate the helper class to use its methods
        helperClass helper = new helperClass();
        //create a scanner variable
        Scanner input = new Scanner(System.in);
        //create an array list and add names to it
        ArrayList<String> Employees = new ArrayList<>();

        Employees.add("Brayan Castiblanco");
        Employees.add("Sofia Puerta");
        Employees.add("Andres Avila");
        Employees.add("Mariana Pastrana");
        Employees.add("Daniela Ostos");
        //get the name to be removed from the user
        String name = helper.askName(input);
        //remove the name from the array list and print the list
        helper.remove(name, Employees);

    }//end main






}



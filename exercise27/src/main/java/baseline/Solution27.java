/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

package baseline;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {

        String firstName = "";
        String lastName = "";
        String ID = "";
        int zipcode = 0;

        //scanInfo(firstname, lastname, ID, zipcode)
        firstName = scanFirstName();
        lastName = scanLastName();
        ID = scanID();
        zipcode = scanZipcode();

        //create employee object
        Employee employee01 = new Employee(firstName, lastName, ID, zipcode);

    }

    static String scanFirstName() {

        String firstname;
        Scanner input = new Scanner(System.in);

        System.out.println("Please type the first name");
        firstname = input.next();

        return firstname;
    }

    static String scanLastName() {

        String lastname;
        Scanner input = new Scanner(System.in);

        System.out.println("Please type the last name");
        lastname = input.next();

        return lastname;
    }

    static String scanID() {

        String ID;
        Scanner input = new Scanner(System.in);

        System.out.println("Please type the ID");
        ID = input.next();

        return ID;
    }

    static int scanZipcode() {

        int zipcode;
        Scanner input = new Scanner(System.in);

        System.out.println("Please type the zipcode");
        zipcode = input.nextInt();

        return zipcode;
    }

}

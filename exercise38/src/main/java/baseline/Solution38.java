/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

package baseline;

public class Solution38 {

    public static void main(String[] args) {

        helperClass helper = new helperClass();

        System.out.printf("The even numbers in the list are: %s",helper.filterEvenNumbers(helper.prompt()));
    }
}

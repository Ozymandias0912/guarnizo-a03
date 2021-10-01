/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */



package baseline;

import java.util.Scanner;



public class Solution29 {
    public static void main(String[] args) {

        baseline.Solution29.calculateDoublingTime();


    }//end main

    static void calculateDoublingTime(){
        //create scanner variable
        Scanner input = new Scanner(System.in);
        //create rate variable
        String rate;
        //create years variable
        double years = 0;
        //Prompt for the rate of return
        System.out.println("Please type the rate of return");
        //save the input in rate
        rate = input.next();

        while(!checkInput(rate)){
            //prompt  invalid input
            System.out.println("Your input was invalid, please type a valid input");
            rate = input.next();
        }//end while loop

        //parse string to double
        double validRate = Double.parseDouble(rate);


        years = 72 / validRate;

        System.out.printf("You will double your money in approximately %.1f years", years);


    }//end calculateDoublingTime method

    static boolean checkInput(String rate){
        //if (rate <= 0)
            //return false
        boolean stringNumber = true;
        if(rate.charAt(0) == '0')
            stringNumber = false;
        for(int i = 0; i < rate.length(); i++){
            if(!isDigit(rate.charAt(i))) {
                stringNumber = false;
                break;
            }
        }//end for loop



        return stringNumber;
    }

    //end for loop
    //end checkInput method

    //isDigit method
    public static boolean isDigit(char c)
    {
        boolean test;
        test =  ((c >= '0' && c <= '9') || (c == '.'));
        return test;
    }
    //end  isDigit method
}//end class

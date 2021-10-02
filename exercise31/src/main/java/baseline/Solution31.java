/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;
//fitness class
    //age
    //restingPulse







//end fitness class

//solution31 class
    //main



    //end main

import java.util.Scanner;

//end solution31 class
public class Solution31 {
    public static void main(String[] args) {
        //ask for age and resting pulse
        Scanner input = new Scanner(System.in);
        String ageStr;
        String restingPulseStr;

        System.out.println("Type your age");
        ageStr = input.next();

        System.out.println("Type your resting pulse");
        restingPulseStr = input.next();

        double age = 0.0;
        double restingPulse = 0.0;

        if(checkDigits(ageStr)){
            age = Double.parseDouble(ageStr);
        }
        else{
            System.out.println("Please try again with a valid input");
        }
        if(checkDigits(restingPulseStr)){
            restingPulse = Double.parseDouble(restingPulseStr);
        }
        else{
            System.out.println("Please try again with a valid input");
        }
        //call constructor
        fitness fitObject = new fitness(age, restingPulse);


        //call print method

        fitObject.print();





    }

    static public boolean isDigit(char c)
    {
        return  (c >= '0' && c <= '9');
    }

    static public boolean checkDigits(String test){
        boolean check = true;
        for(int i = 0; i < test.length(); i++){
            if(!isDigit(test.charAt(i)) ){
                check = false;
                break;
            }

        }
        return check;
    }
}



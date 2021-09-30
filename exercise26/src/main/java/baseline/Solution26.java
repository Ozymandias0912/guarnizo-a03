/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

/*      Months to Pay Off a Credit Card

   //begin class Solution26


       //begin main
            create n
            create i
            create b
            create p

            prompt(i, b, p)

           PaymentCalculator payment1 = new PaymentCalculator(i, b, p)

           n = calculateMonthsUntilPaidOff()



       //end main


    //end class Solution26





*
*
*
*
*
*
*
*
*
* */

package baseline;


import java.util.Scanner;

public class Solution26 {


    public static void main(String[] args) {
        double APR = 0.0;
        double balance = 0.0;
        double monthlyPayment = 0.0;
        double numberMonths;

        balance = prompt1();
        APR = prompt2();
        monthlyPayment = prompt3();

        PaymentCalculator calculator1 = new PaymentCalculator(APR, balance, monthlyPayment);

        numberMonths = calculator1.calculateMonthsUntilPaidOff();


        numberMonths = Math.ceil(numberMonths);//rounding up

        System.out.printf("It will take you %.0f months to pay off this card.", numberMonths);

    }//end main

    //begin void prompt function( i, b, p)
    static double prompt1(){
        //prompt for i and return it
        double i;
        Scanner input = new Scanner(System.in);

        System.out.println("Please type your balance");
        i = input.nextDouble();

        return i;

    }//end prompt function

    static double prompt2(){
        //prompt for i and return it
        double i;
        Scanner input = new Scanner(System.in);

        System.out.println("Please type your APR");
        i = input.nextDouble();

        return i;

    }//end prompt function

    static double prompt3(){
        //prompt for i and return it
        double i;
        Scanner input = new Scanner(System.in);

        System.out.println("Please type your monthly payment");
        i = input.nextDouble();

        return i;

    }//end prompt function

}//end class


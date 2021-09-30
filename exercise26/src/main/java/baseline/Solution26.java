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

       //begin void prompt function( i, b, p)

            prompt for i and save it
            prompt for b and save it
            prompt for p and save it

       //end prompt function
    //end class Solution26


    //begin class   PaymentCalculator

       private     double n //number of months
       private     double i //APR divided by 365
       private     double b //balance on the credit card
       private     double p //monthly payment


       public PaymentCalculator( double APR, double balance, double monthlyPayment)
        {

                i = APR / 365;
                b = balance;
                p = monthlyPayment;
        }

       public double calculateMonthsUntilPaidOff()
       {
             return -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i);

       }




    //end class  PaymentCalculator


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



public class Solution26 {
}

package baseline;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class PaymentCalculator {

    private     double i; //APR divided by 365
    private     double b; //balance on the credit card
    private     double p; //monthly payment


    public PaymentCalculator( double APR, double balance, double monthlyPayment)
    {

        this.i = APR / 36500.00;
        this.b = balance;
        this.p = monthlyPayment;

    }


    public double calculateMonthsUntilPaidOff()
    {
       return (-1.0 / 30.0) * log(1.0 + b / p * (1.0 - (pow(1.0 + i , 30.0)))) / log(1.0 + i);


    }






}//end class  PaymentCalculator


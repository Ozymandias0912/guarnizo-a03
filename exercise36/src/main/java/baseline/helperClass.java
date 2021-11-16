/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */


package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class helperClass {

    ArrayList<Double> list = new ArrayList<>();

    public helperClass(ArrayList<Double> list) {
        this.list = list;
    }

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }

    //find average from list
    public double average(ArrayList<Double> list){

        double sum = 0;

        for(int i = 0; i < list.size(); i++){

            sum += list.get(i);
        }

        return sum / list.size();
    }
    //find maximum value from list
    public double max(ArrayList<Double> list){

        double max = -1.0;

        for(int i = 0; i < list.size(); i++){

            if(list.get(i) > max){

                max = list.get(i);
            }
        }

        return max;
    }
    //find minimum value from list
    public double min(ArrayList<Double> list){

        double min = 1000000000.0;

        for(int i = 0; i < list.size(); i++){

            if(list.get(i) < min){

                min = list.get(i);
            }
        }

        return min;
    }
    //find standard deviation from list
    public double std(ArrayList<Double> list){

        ArrayList<Double> tempList =new ArrayList<>();

        helperClass helper = new helperClass(list);

        double average = helper.average(helper.getList());

        for(int i = 0; i < list.size(); i++){

            tempList.add(  Math.pow(helper.getList().get(i) - average, 2)  );
        }

        helperClass temp = new helperClass(tempList);

        return  Math.sqrt(temp.average(temp.getList()));

    }
    //ask for number to add to a list, print the numbers and print the statistics
    public void askAndPrint(){

        Scanner input = new Scanner(System.in);

        String tempInput = "UCF";

        ArrayList<Double> holder = new ArrayList<>();

        while(!tempInput.equals("done")){

            System.out.println("Enter a number:");

            tempInput = input.next();

            if(!tempInput.equals("done")){
                holder.add(Double.parseDouble(tempInput));
            }

        }

        System.out.printf("The numbers are: %n");

        for(int i = 0; i < holder.size(); i++){

            System.out.printf("%.2f ",holder.get(i));
        }

        helperClass helper = new helperClass(holder);

        System.out.printf("%nThe average is: %.2f%n", helper.average(helper.getList()));

        System.out.printf("The minimum is: %.2f%n", helper.min(helper.getList()));

        System.out.printf("The maximum is: %.2f%n", helper.max(helper.getList()));

        System.out.printf("The standard deviation is: %.2f%n", helper.std(helper.getList()));
    }
}

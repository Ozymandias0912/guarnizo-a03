/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */



package baseline;

public class Solution30 {

    public static void main(String[] args) {
        //create table object
        table multiplicationTable = new table(12, 12);
        //create data array with the first row in the table
        int[] data = new int[12];
        //fill the array out
        for(int i = 0; i < 12; i++){
            data[i] = i + 1;
        }

        for(int i = 0; i < 12; i++) {
            //filling the array changing the row each time
            multiplicationTable.fillMultiplicationRow(data, i);
        }
        //getting the table
        int[][] mTable = multiplicationTable.getDoubleArray();
        //printing the table
        multiplicationTable.printTable(12,12, mTable);

    }//end main


}//end class

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

package baseline;

import java.util.Scanner;

public class Solution24 {

    public static void main(String[] args) {

        //new Scanner input variable;
        Scanner input = new Scanner(System.in);

        //String 1;
        String string1 = "";

        //String 2;
        String string2 = "";

        // print("Enter two strings, and I'll tell you if they are anagrams:");
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        //print("Enter the first string: ");
        System.out.println("Enter the first string: ");

        //scan the second string and save it to input1
        string1 = input.next();

        //print("Enter the second string: ");
        System.out.println("Enter the second string: ");

        //scan the second string and save it to input2
        string2 = input.next();

        //boolean check = isAnagram(string1, string2)
        boolean check = isAnagram(string1, string2);

        //if (check is true)
            //print(""note" and "tone" are anagrams.");
        //else
           // print(""note" and "tone" are not anagrams.");

        if(check)
            System.out.printf(" %s and %s are anagrams.%n", string1, string2);
        else
            System.out.printf(" %s and %s are not anagrams.%n", string1, string2);

    }//end main function


    //create function boolean isAnagram(String input1, String input2)
    public static boolean isAnagram(String input1, String input2)
    {
        int size;

        //  check if the strings have the same length
        if (input1.length() == input2.length())
            //size will be the length of either string
            size = input1.length();
            //else
        else
            //return false
            return false;

        //create char array1

        char[] array1 = new char[size];
        //create char array2

        char[] array2 = new char[size];

        //initialize char arrays
        input1.getChars(0, size , array1, 0);

        input2.getChars(0, size , array2, 0);

        //create char used
        int[] used = new int[size];


        //create first loop
        //nest second loop
        //check if the character has been used
        //check if the characters are the same
        //use the character


        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if ((used[i] == 0) && (array1[i] == array2[j]))
                {
                    used[i] = 1;
                }
            }
        }//end loops




            //return  = checkAnagram()
            return checkAnagram(size, used);


        }//end checkAnagram function

    //boolean checkAnagram( used[size])
        //for loop going through the used array
       //check if the ith integer is zero
           // return false

        //return true

    //end checkAnagram function

        public static boolean checkAnagram(int size, int[] used)
        {
            for(int i = 0; i < size; i++)
            {
                if(used[i] == 0)
                    return false;
            }

            return true;
        }


    }
    //end solution
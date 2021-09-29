/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

/*
    Anagram Checker

    create function boolean isAnagram(String input1, String input2)
    {

        new Scanner input variable;
        print("Enter two strings and I'll tell you if they are anagrams:\n");

        print("Enter the first string: \n");
        scan first string and sve it to input1


        print("Enter the second string: \n");
        scan the second string and save it to input2

        create char array1[input1.length];
        create char array2[input2.length];

        create char used1[input1.length];

        create first loop
            nest second loop
                if(used[i] == 0) check if the character has been used
                    if(input1[i].equals(input2[j])) check if the characters are the same
                        used[i] = 0; //use the character
        end loops
        create boolean check = checkAnagram();
        return check;

        end function isAnagram

        boolean checkAnagram(int used[size])
            for loop going through the used array
                if(used[i] = 0)
                    return false
                else
                    continue
                return true

        end checkAnagram function;


        





        



    }


 *
 *
 */


package baseline;

public class Solution24 {
}

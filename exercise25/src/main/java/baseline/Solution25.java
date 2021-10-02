package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

public class Solution25
{
    public static void main(String[] args)
    {
        String password;

        //scan a string from the user and save it as the password
        System.out.println("Please type your new password");
        Scanner input = new Scanner(System.in);
        password = input.next();
        //call passwordStrength function
        int strength = passwordStrength(password);

        //Use switch statement
        switch (strength) {
            //case 1 :  password strength variable is very weak
            case 1:
                System.out.println("password strength is very weak");
                break;
            //case 2 :  password strength variable is weak
            case 2:
                System.out.println("password strength is weak");
                break;
            //case 3 :  password strength variable is strong
            case 3:
                System.out.println("password strength is strong");
                break;
            //case 4 :  password strength variable is very strong
            case 4:
                System.out.println("password strength is very strong");
                break;
            //case 5 : please use valid characters and try again
            case 5:
                System.out.println("please use valid characters and try again");
                break;
            //default:  password strength variable is unknown strength
            default:
                System.out.println("password strength has unknown strength");
                break;
        }
    }//end main function

    //begin passwordStrength function
     public static int  passwordStrength(String password)
    {



        int size = password.length();

        //check if the characters are digits, letters, or special characters
        int[] isDigit = new int[size];
        int[] isLetter = new int[size];
        int[] isSpecialCharacter = new int[size];


        for (int i = 0; i < size; i++)
        {
            if(isDigit(password.charAt(i)))
                isDigit[i] = 1;
            if(isLetter(password.charAt(i)))
                isLetter[i] = 1;
            if(isSpecialCharacter(password.charAt(i)))
                isSpecialCharacter[i] = 1;
        }


        //check if there is 1 digit or if all the characters are digits
        boolean allDigits = allDigits(isDigit, password.length(), 0);
        boolean oneDigit = false;
        for (int i = 0; i < size; i++)
        {
            if(isDigit[i] == 1)
                oneDigit = true;

        }




        //check if every character is a letter or every character is a letter
        boolean allLetters = allLetters(isLetter, password.length(), 0);
        boolean oneLetter = false;

        for (int i = 0; i < size; i++)
        {
            if(isLetter[i] == 1)
                oneLetter = true;
        }

        //check if there is a special character
        boolean specialCharacter = false;
        for (int i = 0; i < size; i++)
        {
            if(isSpecialCharacter(password.charAt(i)))
                specialCharacter = true;

        }
        //check if there is a not valid character
        boolean invalidCharacter = false;
        for (int i = 0; i < size; i++)
        {
            if(invalidCharacter(password.charAt(i)))
                invalidCharacter = true;

        }



        int strength = 0;
        //if the password contains only numbers and is fewer than eight characters.
        if(allDigits && (password.length() < 8))
        {
            strength = 1;
        }
        //if the password contains only letters and is fewer than eight characters.
        if(allLetters  && (password.length() < 8))
        {
            strength = 2;
        }
        //if the password contains letters and at least one number and is at least eight characters.
        if((oneLetter) && (oneDigit) && (password.length() >= 8))
        {
            strength = 3;
        }
        //if the password contains letters, numbers, and special characters and is at least eight characters.
        if((oneLetter) && (oneDigit) && (password.length() >= 8) && (specialCharacter))
        {
            strength = 4;
        }

        //if the password does not meet any of these rules.
        if(invalidCharacter)
        {
            strength = 5;
        }

        return strength;








    }//end of passwordStrength function

    //begin isLetter function
    static boolean isLetter(char c)
     {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));

     }
    //begin isDigit function
    static boolean isDigit(char c)
     {
        return  (c >= '0' && c <= '9');
     }

    //begin isSpecialCharacter function
    static boolean isSpecialCharacter(char c)
    {
        return  (c >= '!' && c <= '/') || (c >= ':' && c <= '@');
    }

    //begin notValidCharacter function
    static boolean invalidCharacter(char c)
    {

        return ((!isLetter(c)) && (!isDigit(c)) && (!isSpecialCharacter(c)));
    }

    static boolean allLetters(int[] isLetter, int size, int k)
        {
            if(k == size)
                return true;
            if((isLetter[k] == 1 && allLetters(isLetter, size, k+1)))
            {
                return true;
            }

            return false;

        }

    static boolean allDigits(int[] isDigit, int size, int k)
    {
        if(k == size)
            return true;
        if((isDigit[k] == 1 && allLetters(isDigit, size, k+1)))
        {
            return true;
        }

        return false;

    }
}//end of class

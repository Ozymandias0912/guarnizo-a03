/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

/*
*
*   //Solution38 class
*       //main
*           ask()
*       //end main
*   //end Solution38 class
*
*
*
* */
package baseline;

import baseline.Magic8Ball;

import java.util.Scanner;

public class Solution33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Magic8Ball game = new Magic8Ball();

        game.ask();

        game.shake();


        int choice = game.playAgain();

        switch (choice){
            case 1 : System.out.println("What is your question?");
                     String question = input.nextLine();
                     game.shake();
                     choice = game.playAgain();
                     break;
            case 2 : System.exit(0);

            case 3 : choice = game.playAgain();
                     break;

            default : choice = game.playAgain();
                        break;
        }
    }

}

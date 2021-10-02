/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

package baseline;

import java.util.Scanner;

import static baseline.gameSet.guess;

/*
*   Guess the Number Game
*
*
*
* //solution38 class
*   //main
*
*   //end main
*
*
* //end solution38 class
*
*
*
*
* */
public class Solution32 {
    public static void main(String[] args) {
        //call startGame method()
        startGame();
        //call playAgain method
        playAgain();

    }

    //startGame method()
    static void startGame(){
        //create scanner
        Scanner input = new Scanner(System.in);


        //ask the user for difficulty
        System.out.println("Enter the difficulty level (1, 2, or 3):");
        int difficultyLevel = input.nextInt();

        //call the constructor
        gameSet game01 = new gameSet();
        int upperBound = game01.gameSet(difficultyLevel);
        //call pickNumber method()
        int randomNumber = game01.randomNumber(upperBound);

        int counter = 0;

        int check = guess(randomNumber);

        while(check == 0){
            counter = counter + 1;
            check = guess(randomNumber);
        }

        counter = counter + 1;

        System.out.printf("you got it in %d guesses!%n", counter);


    } //end startGame method()

    //play again method
    static void playAgain(){
        //print do you want to play again?
        System.out.println("Do you want to play again?");
        //scan input in answer variable
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        //if(answer = yes)
        if(answer.charAt(0) == 'Y' || answer.charAt(0) == 'y'){
            //call startGame()
            startGame();
        }

            //if(answer = no)
        if(answer.charAt(0) == 'N' || answer.charAt(0) == 'n'){
                //exit program
                System.exit(0);
        }
        else{
                //call playAgain method
                playAgain();
        }

    }



}

package baseline;

import java.util.Scanner;

public class gameMethods {

    gameSet gameset = new gameSet();

    public void startGame(){
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

        int check = gameset.guess(randomNumber);

        while(check == 0){
            counter = counter + 1;
            check = gameset.guess(randomNumber);
        }

        counter = counter + 1;

        System.out.printf("you got it in %d guesses!%n", counter);


    } //end startGame method()

    //play again method
    public void playAgain(){
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

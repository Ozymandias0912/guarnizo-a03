package baseline;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class gameSet {


    public int gameSet(int selection){
        int size = 0;
        switch (selection)
        {
            case 1 : size = 10;
                     System.out.println("You will guess a number between 1 and 10");
                     break;
            case 2 : size = 100;
                     System.out.println("You will guess a number between 1 and 100");
                     break;
            case 3 : size = 1000;
                     System.out.println("You will guess a number between 1 and 1000");
                     break;
            default : System.out.println("invalid input, please try again");
                      //break;
        }



        return size;
    }
    //pick random number method()
    public int randomNumber(int size){
        Random rand = new Random();
        int randomNumber = rand.nextInt(size) + 1;
        return randomNumber;
    }

    //boolean guess method()
    public int guess( int randomNumber) {
        int check = 0;

        System.out.println("Guess the number...");
        Scanner input = new Scanner(System.in);
        String guess;
        int guessNum;
        guess = input.next();
        //uses checkInput method()
        if (checkInput(guess)) {
            guessNum = Integer.parseInt(guess);
            if(guessNum == randomNumber){
                check = 1;
                return check;
            }
            else{//guessNum != randomNumber
                hint(guessNum, randomNumber);
                return check;
            }
        }
        else {
            System.out.println("Please try a number");
            return check;
        }


    }


    //boolean checkInput method(input)
    public boolean checkInput(String input){
        int size = input.length();
        boolean check = true;
        for(int i = 0; i < size; i++){
            if(!isDigit(input.charAt(i))){
                check = false;
                break;
            }
        }
        return check;
    }


    //void hint method(input)
    public void hint(int guessNum, int randomNum){
        if(guessNum < randomNum){
            System.out.println("Your guess was too low");
        }
        else{
            System.out.println("Your guess was too high");
        }
    }

}  //end gameSet class

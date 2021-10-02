package baseline;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
   //Magic8Ball class
    private  String[] array = {"Yes", "No", "Maybe", "Ask again later"};
    //shake method()
    Scanner input = new Scanner(System.in);

    public void shake(){
        Random pick = new Random();
        int choice = pick.nextInt(array.length);
        System.out.println(array[choice]);

    }

    public void ask(){
        //print what is your question?
        System.out.println("What is your question?");

        //scan input
        String question = input.nextLine();



    }

    public int playAgain(){

        //print do you have another question
        System.out.println("Do you have another question? (Y/N)");

        //scan answer
        String answer = input.next();

        //if yes  ask  else  exit program
        if(answer.charAt(0) == 'Y' || answer.charAt(0) == 'y'){
            return 1;
        }
        if(answer.charAt(0) == 'N' || answer.charAt(0) == 'n'){
            return 2;
        }
        else{
            return 3;
        }


    }





}

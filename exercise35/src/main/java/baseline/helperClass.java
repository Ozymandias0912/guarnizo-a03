package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class helperClass {

    public String askNames(Scanner input){

        System.out.println("Enter a name:");

        String name = input.nextLine();

        return name;
    }

    public int pickWinner(ArrayList<String> names){

        Random rand = new Random();

        int winner = rand.nextInt(names.size());

        return winner;
    }

    public void printWinner(int winner, ArrayList<String> names){

        System.out.printf("The winner is : %s", names.get(winner));
    }
}

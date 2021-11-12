package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class helperClass {
    //helper class containing methods that I will use in the Solution34 class

    public String askName(Scanner input){
        //Will scan for the name to be deleted

        System.out.println("Enter an Employee name to remove:\n");

        String name = input.nextLine();

        return name;

    }

    public void remove(String name, ArrayList<String> Employee){
        //Will remove and print new list
        for(int i = 0; i < Employee.size(); i++){

            if( name.equals(Employee.get(i))){

                Employee.remove(i);
            }
        }

        printList(Employee);
    }

    public void printList(ArrayList<String> Employee){
        //Will be used by remove() method to print the list

        System.out.printf("There are %d employees:\n", Employee.size());

        for (int i = 0; i < Employee.size(); i++){

            System.out.printf("%s\n", Employee.get(i));
        }
    }
}

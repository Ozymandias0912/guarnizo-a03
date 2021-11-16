package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class helper {

    Random rand = new Random();

    // Prompt the user for the minimum length, the number of special characters, and the number of numbers.
    public int promptMinLength(){

        Scanner input = new Scanner(System.in);

        System.out.println("What is the minimum length of the password?");

        return input.nextInt();
    }

    public int promptSpecial(){

        Scanner input = new Scanner(System.in);

        System.out.println("How many special characters do you want?");

        return input.nextInt();
    }

    public int promptNumbers(){

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want?");

        return input.nextInt();
    }

    public char pickRandomLetter(ArrayList<Character> list){

        int index = rand.nextInt(52);

        return list.get(index);
    }

    public char pickRandomSpecialCharacter(ArrayList<Character> list){

        int index = rand.nextInt(5) + 52;

        return list.get(index);
    }

    public char pickRandomNumber(ArrayList<Character> list){

        int index = rand.nextInt(10) + 57;

        return list.get(index);
    }

    public String createPassword(int minLength, int specialChars, int numbers){

        ArrayList<Character> list = new ArrayList<>();

        //initialize character's array
        for(char i = 'a'; i <= 'z'; i++){
            list.add(i);
        }
        for(char i = 'A'; i <= 'Z'; i++){
            list.add(i);
        }
        //There are 5 special characters
        for(char i = '!'; i <= '%'; i++){
            list.add(i);
        }
        for(char i = '0'; i <= '9'; i++){
            list.add(i);
        }

        //create an array for the password
        ArrayList<Character> passwordArray = new ArrayList<>();

        int letterCounter = 0;
        int specialCounter = 0;
        int numberCounter = 0;

        while(true){

            //pick a random action between adding a letter (0), special character(1), or number(2)
            int action = rand.nextInt(3);

            if(action == 0 && (letterCounter < (specialChars + numbers) || passwordArray.size() < minLength) ){
                passwordArray.add(pickRandomLetter(list));
                letterCounter++;
            }
            if(action == 1 && specialCounter < specialChars ){
                passwordArray.add(pickRandomSpecialCharacter(list));
                specialCounter++;
            }
            if(action == 2  &&  numberCounter < numbers){
                passwordArray.add(pickRandomNumber(list));
                numberCounter++;
            }
            if(numberCounter >= numbers && specialCounter >= specialChars
            && letterCounter >= (specialChars + numbers) && passwordArray.size() >= minLength){
                break;
            }

        }

        //turn the array into a string and return it
        return passwordArray.toString();

    }

    //checks if the string has a digit
    public boolean hasDigit(String string){

        char[] array = string.toCharArray();

        for(int i = 0; i < array.length; i++){

            if( array[i] >= '0' && array[i] <= '9'){
                return true;
            }
        }

        return false;
    }

    //checks if the string has a special character
    public boolean hasSpecialCharacter(String string){

        char[] array = string.toCharArray();

        for(int i = 0; i < array.length; i++){

            if( array[i] >= '!' && array[i] <= '%'){
                return true;
            }
        }

        return false;
    }
}

package baseline;

public class Solution37 {

    public static void main(String[] args) {

        helper help = new helper();

        int minLength = help.promptMinLength();
        int specialChars = help.promptSpecial();
        int numbers = help.promptNumbers();

        String password = help.createPassword(minLength, specialChars, numbers);

        System.out.printf("Your password is : %s", password);
    }
}

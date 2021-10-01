package baseline;

public class Employee {

    //begin employee class

    private String firstName;
    private String lastName;
    private String ID;
    private int zipcode;












       public void Employee(String firstName, String  lastName, String ID, int zipcode){


           validateInput(firstName, lastName, ID, zipcode);




       }//end Employee method

        void validateInput(String firstName, String  lastName, String ID, int zipcode){

            String[] errorStringArray = new String[7];
            errorStringArray[0] = "The first name must be at least 2 characters long.";
            errorStringArray[1] = "The first name must be filled in.";
            errorStringArray[2] = "The last name must be at least 2 characters long.";
            errorStringArray[3] = "The last name must be filled in.";
            errorStringArray[4] = "The employee ID must be in the format of AA-1234";
            errorStringArray[5] = "The zipcode must be a 5 digit number.";
            errorStringArray[6] = "There were no errors found";

            int[] errorArray = new int[7];

            for(int i = 0; i < 7; i++) {

                errorArray[i] = 0;
            }


            if(checkFirstName(firstName)) {
                this.firstName = firstName;
            }
            else{
                if(firstName.length() == 1){
                    errorArray[0] = 1;

                }
                else{
                    errorArray[1] = 1;
                }

            }
            if(checkLastName(lastName)) {
                this.lastName = lastName;
            }
            else{
                if(lastName.length() == 1){
                    errorArray[2] = 1;
                }
                else{
                    errorArray[3] = 1;
                }

            }
            if(checkID(ID)) {
                this.ID = ID;
            }
            else{
                errorArray[4] = 1;
            }
            if(zipcode < 99999 && zipcode > 9999) {
                this.zipcode = zipcode;
            }
            else{
                errorArray[5] = 1;
            }
            if((checkFirstName(firstName)) && (checkLastName(lastName)) && (checkID(ID)) && (zipcode < 99999 && zipcode > 9999))
            {
                errorArray[6] = 1;
            }

            for(int j = 0; j < 7; j++ ){

                if(errorArray[j] == 1){

                    System.out.printf("%s%n", errorStringArray[j]) ;
                }



            }//Using only one printing statement
        }//end validate input



            public static boolean checkFirstName(String firstname){

                boolean check;
                    if(firstname.length() == 0)
                        check = false;
                    if(firstname.length() >= 2)
                        check = true;
                    else{
                    check = false;
                    }
                return check;

            }


            public boolean checkLastName(String lastname){
                if(lastname.length() == 0){
                    return false;
                }
                else{
                        if (lastname.length() >= 2)
                            return true;
                        else{
                            return false;
                        }
                }
            }


            public boolean checkID(String ID){
                    if(ID.length() != 7)//check the length of the ID
                        return false;
                    if((isLetter(ID.charAt(0))) && (isLetter(ID.charAt(1))) && (ID.charAt(2) == '-')){//check the first 3 characters

                        boolean result = true;
                        //check the last 4 characters
                        if(!isDigit(ID.charAt(3)) || !isDigit(ID.charAt(4)) || !isDigit(ID.charAt(5)) || !isDigit(ID.charAt(6))) {
                            result = false;

                        }

                        return result;

                    }
                    return false;
             }



            public boolean isDigit(char c)
            {
                return  (c >= '0' && c <= '9');
            }

            public boolean isLetter(char c)
            {
                return (c >= 'A' && c <= 'Z');

            }


    }//end of class

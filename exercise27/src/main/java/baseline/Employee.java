package baseline;

public class Employee {

    //begin employee class

       private String firstName;
       private String lastName;
       private String ID;
       private int zipcode;

       public void Employee(String firstName, String  lastName, String ID, int zipcode){

           if(checkFirstName(firstName)) {
               this.firstName = firstName;
           }
           else{
               if(firstName.length() == 1){
                   System.out.println("The first name must be at least 2 characters long.");
               }
               else{
                   System.out.println("The first name must be filled in.");
               }

           }
           if(checkLastName(lastName)) {
               this.lastName = lastName;
           }
           else{
               if(lastName.length() == 1){
                   System.out.println("The last name must be at least 2 characters long.");
               }
               else{
                   System.out.println("The last name must be filled in.");
               }

           }
           if(checkID(ID)) {
               this.ID = ID;
           }
           else{
               System.out.println("The employee ID must be in the format of AA-1234");
           }
           if(zipcode < 99999 && zipcode > 9999) {
               this.zipcode = zipcode;
           }
           else{
               System.out.println("The zipcode must be a 5 digit number.");
           }
           if((checkFirstName(firstName)) && (checkLastName(lastName)) && (checkID(ID)) && (zipcode < 99999 && zipcode > 9999))
           {
               System.out.println("There were no errors found");
           }

       }



      public boolean checkFirstName(String firstname){

        if(firstname.length() == 0){

            return false;
        }

        if (firstname.length() >= 2)
                return true;
        else{
                return false;
        }


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
          if(!isDigit(ID.charAt(3)) || !isDigit(ID.charAt(4)) || !isDigit(ID.charAt(5)) || !isDigit(ID.charAt(6))){
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

}

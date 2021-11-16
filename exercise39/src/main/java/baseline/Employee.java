/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */
package baseline;

public class Employee {

    String firstName;
    String lastName;
    String position;
    String date;

    public Employee(String firstName, String lastName, String position, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.date = date;
    }

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.date = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

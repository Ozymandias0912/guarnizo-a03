/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */
package baseline;

import java.util.HashMap;
import java.util.Map;

public class helperClass {

    public void createMap(){

        // Creating object for Map.
        Map<String, Employee> map
                = new HashMap<String, Employee>();
        //create Employees
        Employee employee1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        Employee employee2 = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Employee employee3 = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Employee employee4 = new Employee("Jake", "Jacobson", "Programmer");
        Employee employee5 = new Employee("Jacquelyn", "Jackson", "DBA");
        Employee employee6 = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");

        // Adding Elements using Map.
        map.put(employee1.firstName + " " + employee1.lastName, employee1);
        map.put(employee2.firstName + " " +  employee2.lastName, employee2);
        map.put(employee3.firstName + " " +  employee3.lastName, employee3);
        map.put(employee4.firstName + " " +  employee4.lastName, employee4);
        map.put(employee5.firstName + " " +  employee5.lastName, employee5);
        map.put(employee6.firstName + " " +  employee6.lastName, employee6);
        //Print Employees
        System.out.printf("%-20s | %-20s | %-20s %n", "Name", "Position", "Separation Date");
        System.out.printf("------------------------------------------------------------ %n");
        for (Map.Entry m : map.entrySet()) {
            System.out.printf("%-20s | %-20s | %-20s %n" + "------------------------------------------------------------ %n"
                    ,m.getKey(), ((Employee)m.getValue()).getPosition(), ((Employee)m.getValue()).getDate());
        }
    }
}

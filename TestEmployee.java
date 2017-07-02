/*
 *CMIS242
 *Project#1
 * Author: Lawrence Babay
 * File: TestEmployee.java
 * Instructor: Prof. Therese Smith
 * Purpose: This program will output the monthly salary,
 * annual salary, and stock prize of Employee, Salary, 
 * and Executive using the super class and subclass
 * This program will also calculate and output 
 * the annual salary of Employee, Salesman, and Executive.
 * Annual salary will output and part of Salesman's pay. 
 * Stock prize will output and part of Executive's pay. 
 */

import java.util.ArrayList;

//Start main class
public class TestEmployee {
    //Start main method
	public static void main(String[] args) {
		//This will hold the Employee's information
		ArrayList <Employee> info = new ArrayList<>();
		//Employee information
		info.add(new Employee("Napoles, Janet", 3000));
		//Salesman information
		info.add(new Salesman("Binay, Jejomar ", 3500, 1000000));
		//Executive information
		info.add(new Executive("Aquino III, Benigno ", 6000, 55));
		//This will output all the information of the employees
		for(int i = 0; i < info.size(); i++) {
			System.out.println(info.get(i));
		}
		
	}//End main method

}//End main class

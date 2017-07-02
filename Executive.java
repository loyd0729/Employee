/*
 *CMIS242
 *Project#1
 * Author: Lawrence Babay
 * File: Executive.java
 * Instructor: Prof. Therese Smith
 * Purpose: This program will output the monthly salary,
 * annual salary, and stock prize of Employee, Salary, 
 * and Executive using the super class and subclass
 * This program will also calculate and output 
 * the annual salary of Employee, Salesman, and Executive.
 * Annual salary will output and part of Salesman's pay. 
 * Stock prize will output and part of Executive's pay. 
 */

//Start subclass
public class Executive extends Employee {
	            //Declared variable
				private int stockPrize;
				//Constructors with parameters
				public Executive(String employeeName, int monthlySalary, int s) {
					//This will inherit from superclass
					super(employeeName, monthlySalary);
					stockPrize = s;
			}
				//Getter that will return the stock prize
				public int getStockPrize() {
					return stockPrize;
				}
				//Setter that will return the stock prize
				public void setStockPrize(int s) {
					stockPrize = s;
				}
			//Annual salary method that calculates the monthly salary to output annual salary
			@Override
				public int annualSalary() {
				int anSalary = getMonthlySalary() * 12 + 30000;
					  return anSalary; 
					  }
				//This will override the Employee name, monthly salary, annual salary, and stock prize at toString method
				@Override
				public String toString() {
					String str3 =  "2014 Executive name: " + this.getEmployeeName() + "Monthly salary: " +
				"$" + this.getMonthlySalary() + " Annual salary: " + "$" + this.annualSalary() +
				" Stock prize: " + "$" + this.getStockPrize();
					 return str3;   
				}
				
}//End subclass



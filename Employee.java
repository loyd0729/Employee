/*
 *CMIS242
 *Project#1
 * Author: Lawrence Babay
 * File: Employee.java
 * Instructor: Prof. Therese Smith
 * Purpose: This program will output the monthly salary,
 * annual salary, and stock prize of Employee, Salary, 
 * and Executive using the super class and subclass
 * This program will also calculate and output 
 * the annual salary of Employee, Salesman, and Executive.
 * Annual salary will output and part of Salesman's pay. 
 * Stock prize will output and part of Executive's pay. 
 */

//Start Superclass
public class Employee {
  //Declared variables
  private String employeeName;
  private int monthlySalary;
  //Constructors with parameters
  public Employee(String e, int m) {
	  employeeName = e;
	  monthlySalary = m;
  }
  //Getter that will return the employee name
  public String getEmployeeName() {
	  return employeeName;
	  }
 //Setter that will set the employee name
 public void setEmployeeName(String e) {
	 employeeName = e;
 }
 //Getter that will return the monthly salary
 public int getMonthlySalary() {
	 return monthlySalary;
 }
 //Setter that will set the monthly salary
 public void setMonthlySalary(int m) {
	 monthlySalary = m;
 }
    //Annual salary method that calculates the monthly salary to output annual salary
	public int annualSalary() {
		 int anSalary = monthlySalary*12;
		 return anSalary; 
	  }
 //This will override the employee name, monthly salary, and annual salary at toString method
 @Override
  public String toString() {
	 String str1 = "2014 Employee name: " + this.getEmployeeName() + 
			 " Monthly salary: " + "$" + this.getMonthlySalary() + " Annual salary: " + "$" + this.annualSalary();
	 return str1;
 }
  
}//End class
  


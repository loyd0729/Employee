/*
 *CMIS242
 *Project#1
 * Author: Lawrence Babay
 * File: Salesman.java
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
public class Salesman extends Employee {
	//Declared variable
	private int annualSales;
	//Declared static variable
	private static double COMMISSION = .02;
	//Constructors with parameters
	public Salesman(String employeeName, int monthlySalary, int a) {
		//This will inherit from superclass
		super(employeeName, monthlySalary);
		annualSales = a;
		}
	//Getter that will return the annual sales
	public int getAnnualSales() {
		return annualSales;
	}
	//Setter that will set the annual sales
	public void setAnnualSales(int a) {
		annualSales = a;
	}
	//Annual salary method that calculates the monthly salary to output annual salary
	@Override
	public int annualSalary() {
		 int anSalary = getMonthlySalary()*12;
		 return anSalary; 
		}
	//This will override the Employee name, monthly salary, annual salary, and annual sales at toString method
	@Override
	public String toString() {
		String str2 = "2015 Salesman name: " + this.getEmployeeName() + "Monthly salary: " + 
	    "$" + this.getMonthlySalary() + " Annual salary: " + "$" + this.annualSalary()+
				" Annual sales: " + "$" + this.getAnnualSales()*COMMISSION;
		return str2;  
	}

}//End subclass

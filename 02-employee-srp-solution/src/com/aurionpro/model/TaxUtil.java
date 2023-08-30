package com.aurionpro.model;

public class TaxUtil {
	public double calculateTax(Employee employee) {
		  double tax = 0; 
		if(employee.calculateTotalSalary()*12>500000 && employee.calculateTotalSalary()*12 <800000) {
			tax = (employee.calculateTotalSalary()*12) * 10/100;
			System.out.println("adf");
		}
		else if(employee.calculateTotalSalary()*12 > 800000 && employee.calculateTotalSalary()*12 <1000000) {
			tax = (employee.calculateTotalSalary()*12) * 20/100;
		}else {
			tax = (employee.calculateTotalSalary()*12)*30/100;
		}
		return tax;
	}

}

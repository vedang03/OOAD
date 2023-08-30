package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.PrinterUtil;
import com.aurionpro.model.TaxUtil;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(1,"Vedang",50000);
		
		TaxUtil t1 = new TaxUtil();
		System.out.println(t1.calculateTax(e1));
		
		PrinterUtil p1 = new PrinterUtil();
		p1.printSalarySlip(e1, t1);
	}

}

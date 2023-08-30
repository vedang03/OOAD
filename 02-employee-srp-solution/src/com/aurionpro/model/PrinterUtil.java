package com.aurionpro.model;

public class PrinterUtil {
	public void printSalarySlip(Employee employee , TaxUtil t) {
		System.out.println("Basic salary is: "+employee.getBasic() + " Hra is: "+employee.getHra() +
				" ta is: "+employee.getTa() + " da is: "+employee.getDa()
				+ " Tax is: "+t.calculateTax(employee)/12);
				
	}

}

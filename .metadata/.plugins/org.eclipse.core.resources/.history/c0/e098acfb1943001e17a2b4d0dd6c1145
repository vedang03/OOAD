package com.aurionpro.model;

public class Employee {
private int id;
private String name;
private double basic;
private double hra;
private double da;
private double ta;

public Employee(int id, String name, double basic) {
	super();
	this.id = id;
	this.name = name;
	this.basic = basic;
	this.hra =basic *20/100;
	this.da = basic*15/100;
	this.ta = basic*10/100;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBasic() {
	return basic;
}
public void setBasic(double basic) {
	this.basic = basic;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}
public double getDa() {
	return da;
}
public void setDa(double da) {
	this.da = da;
}
public double getTa() {
	return ta;
}
public void setTa(double ta) {
	this.ta = ta;
}

public double calculateTotalSalary(){
       return basic + hra + da + ta;
}
public double calculateTax() {
	  double tax = 0; 
	if(calculateTotalSalary()*12>500000 && calculateTotalSalary()*12 <800000) {
		tax = (calculateTotalSalary()*12) * 10/100;
		System.out.println("adf");
	}
	else if(calculateTotalSalary()*12 > 800000 && calculateTotalSalary()*12 <1000000) {
		tax = (calculateTotalSalary()*12) * 20/100;
	}else {
		tax = (calculateTotalSalary()*12)*30/100;
	}
	return tax;
}

public void printSalarySlip() {
	System.out.println("Basic salary is: "+basic + " Hra is: "+hra + " ta is: "+ta + " da is: "+da
			+ " Tax is: "+calculateTax()/12);
			
}

}

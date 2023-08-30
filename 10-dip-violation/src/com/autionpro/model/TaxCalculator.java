package com.autionpro.model;

public class TaxCalculator {
DBLogger dbLogger;

public TaxCalculator(DBLogger dbLogger) {
	super();
	this.dbLogger = dbLogger;
}

public DBLogger getDbLogger() {
	return dbLogger;
}

public void setDbLogger(DBLogger dbLogger) {
	this.dbLogger = dbLogger;
}

public int calculateTax(int amount , int rate) {
	int tax = 0;
	try {
		tax=amount/rate;
		System.out.println(tax);
	}
	
	catch(Exception e) {
		new DBLogger().log("Divide by zero");
	}
	return tax;
}
}

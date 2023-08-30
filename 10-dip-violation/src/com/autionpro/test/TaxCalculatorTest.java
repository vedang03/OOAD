package com.autionpro.test;

import com.autionpro.model.DBLogger;
import com.autionpro.model.TaxCalculator;

public class TaxCalculatorTest {
public static void main(String[] args) {
	TaxCalculator t1 = new TaxCalculator(new DBLogger());
	t1.calculateTax(100, 10);
	
	TaxCalculator t2 = new TaxCalculator(new DBLogger());
	t2.calculateTax(2000, 0);
}
}

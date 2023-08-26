package com.aurionpro.model;

public class Calculate {
   
	public double calculateSimpleInterest(FixedDeposit fd , DiwaliInterest d1) {
		return (fd.getPrincipal() * fd.getDuration() * d1.getInterestRate())/100;
	}
}

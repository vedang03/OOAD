package com.aurionpro.test;

import com.aurionpro.model.Calculate;
import com.aurionpro.model.DiwaliInterest;
import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.HoliInterest;

public class FDTest {

	public static void main(String[] args) {
		
		FixedDeposit fd1 = new FixedDeposit(6534,"Vedang",10000,5,new HoliInterest());
		Calculate c1 = new Calculate();
		
		System.out.println(c1.calculateSimpleInterest(fd1,new HoliInterest()));
		
		

	}

}

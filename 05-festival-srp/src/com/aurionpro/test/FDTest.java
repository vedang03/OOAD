package com.aurionpro.test;

import com.aurionpro.model.Calculate;
import com.aurionpro.model.DiwaliInterest;
import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.HoliInterest;
import com.aurionpro.model.NewYearInterest;
import com.aurionpro.model.OtherInterest;

public class FDTest {

	public static void main(String[] args) {
		
		FixedDeposit fd1 = new FixedDeposit(6534,"Vedang",10000,5,new NewYearInterest());
		Calculate c1 = new Calculate();
		
		System.out.println(c1.calculateSimpleInterest(fd1,new NewYearInterest()));
		
		

	}

}

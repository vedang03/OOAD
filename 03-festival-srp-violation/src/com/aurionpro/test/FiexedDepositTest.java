package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FiexedDepositTest {

	public static void main(String[] args) {
	  FixedDeposit f1 = new FixedDeposit(6632, "Vedang", 10000,5, FestivalType.DIWALI);
       System.out.println(f1.calculateSimpleInterest());
	}

}

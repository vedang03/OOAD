package com.aurionpro.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festivalType;
	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType festivalType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festivalType = festivalType;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public FestivalType getFestivalType() {
		return festivalType;
	}
	public void setFestivalType(FestivalType festivalType) {
		this.festivalType = festivalType;
	}
	
	private double getInterestRates() {
		double rates = 0;
		if(festivalType.equals("NEWYEAR")) {
			rates = 8;
		}
		else if(festivalType.equals("DIWALI")) {
			rates = 8.5;
		}
		else if(festivalType.equals("HOLI")) {
			rates = 7.5;
		}else {
			rates = 6.5;
		}
		return rates;
	}
	public double calculateSimpleInterest() {
		return (principal*duration*getInterestRates())/100;
	}
}

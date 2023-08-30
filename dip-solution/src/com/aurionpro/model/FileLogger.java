package com.aurionpro.model;

public class FileLogger implements ILogger {

	@Override
	public void log(String err) {
		System.out.println("Loggged to File " + err);

	}

}

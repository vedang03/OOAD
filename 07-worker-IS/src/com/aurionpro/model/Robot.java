package com.aurionpro.model;

public class Robot implements IWorkable {
@Override
public void start() {
	 System.out.println("Robot Started working");
}
public void stop() {
	 System.out.println("Robot Stoped working");
}
}

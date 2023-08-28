package com.aurionpro.model;

public class Loader implements IWorker {
 @Override
 public void start() {
	 System.out.println("Worker Started working");
 }
 public void stop() {
	 System.out.println("Worker Stoped working");
 }
 public void eat() {
	 System.out.println("Worker is Eating");
 }
 public void rest() {
	 System.out.println("Worker is Resting");
 }
}

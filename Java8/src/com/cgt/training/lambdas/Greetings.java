package com.cgt.training.lambdas;

@FunctionalInterface
public interface Greetings {
	void sendGreeting(String msg);
	default void fun() {
		
	}
}

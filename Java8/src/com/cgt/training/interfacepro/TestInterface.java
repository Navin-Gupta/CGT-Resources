package com.cgt.training.interfacepro;

public interface TestInterface {

	default void fun() {
		System.out.println("Inside fun of interface");
	}
	
	static void sfun() {
		System.out.println("Inside static of interface");
	}
}

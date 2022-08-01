package com.josh.java.training.exceptionhandling;

public class NoEntryException extends RuntimeException{
	NoEntryException(String msg){
		super(msg);
	}
}

package com.josh.java.training.exceptionhandling;

public class NoEntryException extends RuntimeException{
	NotWorkingException(String msg){
		super(msg);
	}
}

package com.josh.java.training.java8features;

import java.util.Optional;

public class OptionalClass {

	public static Optional<String> getopps() {
		String Name = "Sharda Mishra";
		return Optional.ofNullable(Name);
	}

	public static void main(String[] args) {
		String Data = "she is a great person";
		Optional<String> optional = Optional.of(Data);
		System.out.println(optional.isPresent());
		System.out.println(optional.isPresent());
		System.out.println(optional.filter((x) -> x.startsWith("s")).get());
		System.out.println(optional.map((x) -> x.toUpperCase()).get());
		Optional<String> optional1 = getopps();
		System.out.println(optional1.get());
	}

}

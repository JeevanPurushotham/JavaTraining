package com.josh.java.Training.java8feature;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalClass {
	String name;

	public static Optional<String> getname() {
		String name = "gireesh";
		return Optional.of(name);
	}

	public static void main(String[] args) {
		String data = "Josh software ";
		Optional<String> optional = Optional.ofNullable(data);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		System.out.println(optional.orElse("g1"));
		System.out.println(optional.filter(x -> x.startsWith("J")).get());
		System.out.println(optional.map(x -> x.toUpperCase()).get());
		List<String> list = optional.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(list);
		Optional<String> optional2 = getname();
		System.out.println(optional2.get());
		if (optional2.isPresent()) {
			System.out.println("present");
		}

	}

}

package dev_1.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercise6 {
    public static void main(String args[]) {
		List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		Predicate<String> p=(str)->str.startsWith("J");
		filter(countries,p );
	}

	public static void filter(List names, Predicate condition) {
		names.stream()
		.filter((name) -> (condition.test(name)))
		.forEach((name) -> {
			System.out.println(name + " ");
		});
	}

}

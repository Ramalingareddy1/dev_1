package dev_1.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise13 {
    public static void main(String[] args) {
         
        List<String> list = Arrays.asList("banana", "mango", "apple", "watermelon");
        
        List<String> uppercaseList = transform(list);

        System.out.println(uppercaseList); 
    }

	public static List<String> transform(List<String> listOfString) { 
		return listOfString.stream().map(String::toUpperCase).collect(Collectors.toList()); 
	}

}

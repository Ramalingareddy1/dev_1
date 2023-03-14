package dev_1.Lambdas;

import java.util.function.Function;

public class Exercise11 {
    public static void main(String[] args) {
        Function<String, Integer> fun= (t)->t.length();

        Integer integer=fun.apply("Ramalingareddy");
        System.out.println(integer);
    }
    
}

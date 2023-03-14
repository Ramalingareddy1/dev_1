package dev_1.Lambdas;

public interface StringReverse {
    String reverseString(String s);
}

public class Exercise2 {
    public static void main(String[] args) {
        StringReverse sr = (s) -> {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        };
        String original = "HI HELLO";
        String reversed = sr.reverseString(original);
        System.out.println(" Original String is:" + original);
        System.out.println(" Reversed String is: " + reversed);
    }
}

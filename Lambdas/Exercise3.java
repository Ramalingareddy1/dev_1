package dev_1.Lambdas;

public interface UpperCaseConverter {
    String convertToUppercase(String lowerCase);

}

public class Exercise3 {
    public static void main(String[] args) {
        UpperCaseConverter ucc= (lowerCase) -> {
            return  lowerCase.toUpperCase();
        };
        String lowerCase= " hi hello";
        String upperCase = ucc.convertToUppercase(lowerCase);
        System.out.println(" Lowercase String is:"+lowerCase);
        System.out.println("Upercase String is:"+upperCase);
    }
    
}

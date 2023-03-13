package dev_1.Generics;

class Printer
{
   public <T> void printArray(T[] arr){
       for(T obj:arr){
           System.out.println(obj);
       }
   }
 
}

public class Exercise5 {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
} 
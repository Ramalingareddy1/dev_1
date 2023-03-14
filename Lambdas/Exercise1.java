package dev_1.Lambdas;

public class Exercise1 {
    public static void main(String[] args) {
        Thread t= new Thread(()-> {
            for(int i=1; i<=10; i++){
                System.out.println(" Count :"+i);
            }
        });
        t.start();
    }
    
}

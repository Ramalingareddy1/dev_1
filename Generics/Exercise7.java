package dev_1.Generics;
 class Util<T> {
 
    public static <T> int count(T[] array, T item) {
        int count = 0;
     
        if (item == null) {
            for (T element : array) {
                if (element == null) count++;
            }
        } else {
            for (T element : array) {
                if (item.equals(element)) {
                    count++;
                }
            }
        }
     
        return count;
     
    }
    }

public class Exercise7 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 2, 7, 8, 2};
        int countTwos = Util.count(numbers, 2);
        System.out.println("The number of 2s in the array is: " + countTwos);

        String[] words = {"apple", "banana", "cherry", "banana", "date", "banana"};
        int countBananas = Util.count(words, "banana");
        System.out.println("The number of bananas in the array is: " + countBananas);
    }
}

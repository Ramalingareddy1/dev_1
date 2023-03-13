package dev_1.Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise2 {

    public static void main(String[] args) {

        Map<Integer,Integer> integermap = new HashMap<Integer, Integer>();
        integermap.put(2, 10);
        integermap.put(3, 11);

        Iterator<Integer> integerIterator   = integermap.keySet().iterator();

        while(integerIterator. hasNext()){
            int key=integerIterator.next();
            System.out.printf("key : %d\n", key);
            System.out.printf("value :%d\n", integermap.get(key));
        }
    
    }
    
}

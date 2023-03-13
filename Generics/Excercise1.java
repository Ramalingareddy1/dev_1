package dev_1.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Excercise1 {
   public static void main(String[] args) {

      List<Integer> integerList = new ArrayList<Integer>();
  
      integerList.add(Integer.valueOf(10));
      integerList.add(Integer.valueOf(11));

      for(Integer data: integerList) {
         System.out.printf("Integer Value :%d\n", data);
      }
   }  
}
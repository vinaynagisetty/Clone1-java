package com.java.Telusko.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<Integer> ar=new TreeSet<Integer>();
        ar.add(51);
        ar.add(5);
        ar.add(8);
        ar.add(5);
        ar.add(8);
        System.out.println(ar);
        Iterator<Integer> value=ar.iterator();
        while (value.hasNext()) {
          System.out.println(value.next());  
            
        }
    }
   
    

}

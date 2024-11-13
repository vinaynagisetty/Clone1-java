package com.java.Telusko.collections;

import java.util.ArrayList;
import java.util.List;


public class ListExample {
    public static void main(String[] args) {
        List<Integer> ar=new ArrayList<Integer>();
        ar.add(5);
        ar.add(8);
    //  for(int n: ar){
    //     System.out.println(n);
    //  }
     System.out.println(ar.get(1));
    }

}

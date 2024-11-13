package com.java.Telusko.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
public static void main(String[] args) {
    Map<String,Integer> studentMarks=new HashMap<>();
    studentMarks.put("vinay",56);
    studentMarks.put("vamsi",856);
    studentMarks.put("nag",586);
    studentMarks.put("vinay",0);
    System.out.println(studentMarks);
    System.out.println(studentMarks.keySet());
    System.out.println(studentMarks.values());
    for(String key:studentMarks.keySet()){
        System.out.println(key+" "+ studentMarks.get(key));
    }
    // map is combination of set by keys and List by values
    //thats why key are unique aand values are not
}
}

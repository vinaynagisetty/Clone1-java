package com.java.Telusko.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparartorExample {
    public static void main(String[] args) {
        // List<Integer> studentMarks=new ArrayList<>();
        // studentMarks.add(59);
        // studentMarks.add(22);
        // studentMarks.add(10);

        // Comparator<Integer> compFunction =new Comparator<Integer>(){
        //     public int compare(Integer i,Integer j){
        //         if(i%10 > j%10){
        //             return 1;
        //         }
        //        return -1;
        //     }
        // };
        // // Collections.sort(studentMarks); for automatic sort
        // //for custome sort
        // Collections.sort(studentMarks,compFunction);
        // System.out.println(studentMarks);
        Comparator<String> lengthComp=new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
               if(o1.length() <o2.length()){
                return 1;
               }
               return -1;
            }
            
        };

        List<String> name=new ArrayList<>();
        name.add("vinay");
        name.add("akashssss");
        name.add("vina");
   
        //basic sorting 

        // Collections.sort(name);
        // System.out.println(name);

        //custom sorting based on the length

        Collections.sort(name,lengthComp);
         System.out.println(name);

    }

}

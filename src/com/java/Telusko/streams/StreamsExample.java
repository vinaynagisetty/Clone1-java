package com.java.Telusko.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(10,2,3,5,6,7,8);
        //  nums.forEach(n->System.out.println(n));  if you do any changes in array it will change the original array
        
    //    Stream<Integer> s1=  nums.stream();
    //    Stream<Integer> s2=s1.filter(n->n%2==0);
    //    Stream<Integer>s3=s2.map(n -> n*2);
    //    int result=s3.reduce(0, (c,e)->c+e);
    //    System.out.println(result);

        //  int result = nums.stream()
        //     .filter(n -> n % 2 == 0)
        //     .map(n -> n * 2)
        //     .reduce(0, (c, e) -> c + e);

        // List<Integer> test=Arrays.asList(1,2,3,4);
        //    int sum=test.stream().reduce(10,(c,e)-> c+e);



        List<Integer> test=Arrays.asList(5,1,3,4,2,0,4,33,4);

        Stream<Integer>s1=test.stream().filter(n -> n%2==0).sorted();
        s1.forEach(n -> System.out.println(n));

            
                             

        
        // s3.forEach(s -> System.out.println(s));
    }

}

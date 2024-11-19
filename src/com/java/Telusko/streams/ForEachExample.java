package com.java.Telusko.streams;
import java.util.Arrays;
import java.util.List;
public class ForEachExample {


    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,4,5,5,667,777,8);
        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        // for(int value:nums){
        //     System.out.println(value);
        // }
        nums.forEach(n->System.out.println(n));
    }
}

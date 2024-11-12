package com.java.Telusko.lamda;
@FunctionalInterface
 interface ISecondClass {
    int addToNumber(int i,int j);
    
}

public class SecondClass {
public static void main(String[] args) {
    ISecondClass fc1=(i,j)->  i+j;       
         

    ;
    System.out.println( fc1.addToNumber(5, 6));
   
}
}

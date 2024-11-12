package com.java.Telusko.lamda;


public class BasicLamda  implements FuntionalInterfaceExample {

    public static void main(String[] args) {
        FuntionalInterfaceExample fc= (i) ->   System.out.println("exapmle"+ " " +i);
        fc.show(5);
    }



    // @Override
    // public void show() {
       
    //     System.out.println("exapmle");
        
    // }

}

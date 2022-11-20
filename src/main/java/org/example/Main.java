package org.example;

public class Main {

    public static void main(String[] args) {

        aircraft MI28 = new Helicopter();
        aircraft B720 = new airplane();
        aircraft UFO = new UFO();

        test(MI28);
        test(B720);
        test(UFO);
    }
     public static void test (aircraft type){
         System.out.println(type.fly());
     }
}
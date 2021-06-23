package com.employeeprogram;

public class Utility {

    public static double getRandomDouble() {
        return Math.floor(Math.random() * 10) % 3;
    }

    public static int getRandomInt() {
        return (int)(Math.random() * 10) % 3;
    }

}

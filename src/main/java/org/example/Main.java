package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] c = new int[27];
        initArray(c);
        printArray(c);
        swapLastValue(c);
        System.out.println();
        printArray(c);
    }

    public static void swapLastValue(int[] c) {
        int index = -35;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 2 != 0 && c[i] > maxValue) {
                maxValue = c[i];
                index = i;
            }
        }
        int temp = c[c.length - 1];
        c[c.length - 1] = c[index];
        c[index] = temp;
    }
    public static void printArray (int[] c){
        for (int e: c) {
            System.out.print(e + " ");
        }
    }
    public static void initArray(int[] c){
        Random rand = new Random();
        for(int i = 0; i < c.length; i++){
            c[i] = rand.nextInt(61) - 35;
        }
    }
}
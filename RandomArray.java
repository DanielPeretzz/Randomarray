package com.homework.daniel;
import java.util.Scanner;

public class RandomArray {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a array length : ");
        int length = SCANNER.nextInt();
        printArray(createArray(length));
    }
    static int[] createArray(int length){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*101);
        }
        return array;
    }
    static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

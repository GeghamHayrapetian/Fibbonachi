package com.rau.fibbonachi;

public class Main {
    public static void main(String[] args) {
        Fibbonachi fib=new Fibbonachi();
        for (int i : fib) {
            if (i > 100) break;
            System.out.print(i + " ");
        }
        System.out.print("\n");

    }
}

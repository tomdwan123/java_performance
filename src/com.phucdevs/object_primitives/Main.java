package com.phucdevs.object_primitives;

public class Main {

    public static void main(String[] args) {
        lowPerformance();
        //highPerformance();
    }

    private static void lowPerformance() {
        Long sum = 0L;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println("sum is " + sum);
    }

    private static void highPerformance() {
        long sum = 0;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println("sum is " + sum);
    }
}

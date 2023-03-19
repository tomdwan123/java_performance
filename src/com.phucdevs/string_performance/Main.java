package com.phucdevs.string_performance;

public class Main {

    private static final int LIMIT = 1_000_000;

    public static void main(String[] args) {

        Long startTime1 = System.currentTimeMillis();
        slow();
        System.out.println("slow time is " + (System.currentTimeMillis() - startTime1));

        Long startTime2 = System.currentTimeMillis();
        fast();
        System.out.println("fast time is " + (System.currentTimeMillis() - startTime2));
    }

    private static void slow() {
        String s = "";
        for (int i = 0; i < LIMIT; i++) {
            s += "*";
        }
    }

    private static void fast() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < LIMIT; i++) {
            s.append("*");
        }
    }
}

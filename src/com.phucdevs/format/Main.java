package com.phucdevs.format;

public class Main {

    public static void main(String[] args) {
        String name = "Teo";
        String grade = "9A2";
        String school = "Nguyen Trai High School";

        normalOperatorString(name, grade, school);
        greatOperatorString(name, grade, school);
    }

    private static void normalOperatorString(String name, String grade, String school) {
        System.out.println("I'm " + name + "\n is a student at " + grade + "\n\n at " + school);
    }

    private static void greatOperatorString(String name, String grade, String school) {
        String message = """
            I'm %s
            is a student at %s 
            
            at %s
        """.formatted(name, grade, school);
        System.out.println(message);
    }
}

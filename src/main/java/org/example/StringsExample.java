package org.example;

public class StringsExample {
    public static void main(String[] args) {
        String name = "Oskar Wiklund";
        String name2 = "Erik Svensson";
        String role = "Student";
        String role2 = "Teacher";
        String groupName = "Java";
        int groupNumber = 36;

        String sentence = name + " is a " +role+ " in " + groupName + " " + groupNumber;
        String sentence2 = name2 + " is a " + role2 + " in " + groupName + " " + groupNumber;

        System.out.println(sentence);
        System.out.println(sentence2);


        System.out.println(name + " Foo");
        System.out.println(name);
    }
}

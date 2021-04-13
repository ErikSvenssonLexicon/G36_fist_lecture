package org.example;

import org.example.model.Student;

public class ClassAndObject {

    public static void main(String[] args) {

        String name = "Oskar Wiklund";

        String role = "Student";

        String groupName = "Java";
        int groupNumber = 36;

        Student oskar = new Student();
        oskar.setName(name);
        oskar.setRole(role);
        oskar.setGroup(groupName);
        oskar.setGroupNumber(groupNumber);

        Student erik = new Student();
        erik.setName("Erik Svensson");
        erik.setGroup("Java");
        erik.setRole("Teacher");
        erik.setGroupNumber(36);



        System.out.println(erik.getInfo());
        System.out.println(oskar.getInfo());

    }





}


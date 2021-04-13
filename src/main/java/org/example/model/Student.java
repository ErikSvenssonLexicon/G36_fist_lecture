package org.example.model;

public class Student {

    private String name;
    private String role;
    private String group;
    private int groupNumber;

    public void setName(String inName){
        name = inName;
    }

    public void setRole(String inRole){
        role = inRole;
    }

    public void setGroup(String inGroup){
        group = inGroup;
    }

    public void setGroupNumber(int inGroupNumber){
        groupNumber = inGroupNumber;
    }

    public String getInfo(){
        return name + " is a " +role+ " in " + group + " " + groupNumber;
    }



}

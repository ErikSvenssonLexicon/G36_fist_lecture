package org.example;

public class App
{

    //A static method
    public static void main(String[] args)
    {
        byte b = -128;
        short s = 24465;
        int i = 44;
        long l = 3242094535L;

        float f = 345.65F;
        double d = 3424254.4543235;

        char c = '1';
        boolean bool = true;

        s = b; //OK because short are bigger than bytes
        i = s; //OK because ints are bigger than shorts
        l = i; //OK because long are bigger than int

        f = i; //OK because int and float are both 32bit
        d = l; //OK because double and long are both 64bit









    } //Main method ends here


} // App.class ends here

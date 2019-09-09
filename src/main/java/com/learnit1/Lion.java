package com.learnit1;

public class Lion extends Animal implements Loggable,Printable
{
    public void eat()
    {
        System.out.println("Lion is Eating...");
    }
    public void print()
    {
        System.out.println("Printing...");

    }
    public String message()
    {
        return "Return Something";

    }

}

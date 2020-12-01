package dev.alexcolville.aoc.common;

public class Util
{

    public static void Print(String prefix, String output)
    {
        System.out.println(prefix + ": " + output);
    }

    public static void PrintMain(String output)
    {
        Print("Advent of Code", output);
    }

}

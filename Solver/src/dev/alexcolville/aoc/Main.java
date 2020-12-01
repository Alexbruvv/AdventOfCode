package dev.alexcolville.aoc;

import dev.alexcolville.aoc.common.Util;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        Util.PrintMain("Enter a problem number: ");
        int day = scanner.nextInt();

        ProblemType problemType = ProblemType.GetByDay(day);

        if (problemType == null)
        {
            Util.PrintMain("Invalid problem! Try again...");
            main(null);
            return;
        }

        try
        {
            Problem problem = (Problem) problemType.GetProblem().getDeclaredConstructors()[0].newInstance();

            Util.Print(problem.GetTitle() + " - Solution", String.valueOf(problem.Solve()));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e)
        {
            Util.PrintMain("Oops! Something went wrong.. try again");
            main(null);
        }
    }

}

package dev.alexcolville.aoc.problems;

import dev.alexcolville.aoc.Problem;

import java.io.*;
import java.util.ArrayList;

public class ReportRepair extends Problem<Integer>
{

    public ReportRepair()
    {
        super("Report Repair");
    }

    @Override
    public Integer Solve()
    {
        File file = new File("D:/AOC/1/data.txt");
        ArrayList<Integer> values = new ArrayList<>();

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = reader.readLine();

            while (line != null)
            {
                values.add(Integer.parseInt(line));
                line = reader.readLine();
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        int solution = 0;

        for (int x : values)
        {
            for (int y : values)
            {
                for (int z : values)
                {
                    if (x + y + z == 2020)
                        solution = x * y * z;
                }
            }
        }

        return solution;
    }
}

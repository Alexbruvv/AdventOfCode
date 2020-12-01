package dev.alexcolville.aoc;

import dev.alexcolville.aoc.problems.ReportRepair;

public enum ProblemType
{

    REPORT_REPAIR(1, ReportRepair.class);

    public static ProblemType GetByDay(int day)
    {
        for (ProblemType type : values())
        {
            if (type.GetDay() == day)
                return type;
        }

        return null;
    }

    ProblemType(int day, Class<? extends Problem> problem)
    {
        _day = day;
        _problem = problem;
    }

    private int _day;
    private Class<? extends Problem> _problem;

    public Class<? extends Problem> GetProblem()
    {
        return _problem;
    }

    public int GetDay()
    {
        return _day;
    }

}

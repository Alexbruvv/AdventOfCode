package dev.alexcolville.aoc;

public abstract class Problem<ResultType>
{

    private String _title;

    public Problem(String title)
    {
        this._title = title;
    }

    public abstract ResultType Solve();

    public String GetTitle()
    {
        return _title;
    }
}

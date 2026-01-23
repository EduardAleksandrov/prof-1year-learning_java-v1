package org.example.classes;

// Alt + Enter on class field and choose Create test
public class General
{
    public String str;
    public General(String Str)
    {
        this.str = Str;
    }

    public int sumGen(int n)
    {
        int total = 0;
        for(int i = 0; i < n; i++)
        {
            total +=i;
        }
        return total;
    }
}

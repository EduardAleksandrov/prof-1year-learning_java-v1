package org.example.classes;

import org.json.JSONObject;

// Alt + Enter on class field and choose Create test
public class General
{
    public String str;
    public General(String Str)
    {
        this.str = Str;
    }

    /**
     * @param n - value for function
     * @return - total sum
     */
    public int sumGen(int n)
    {
        int total = 0;
        for(int i = 0; i < n; i++)
        {
            total +=i;
        }
        return total;
    }

    public static void pr()
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
    }
    // 2
    public static void JSON()
    {
        JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
        System.out.println(jo);
    }
}

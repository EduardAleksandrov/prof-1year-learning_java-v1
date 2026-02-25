package org.example.book;

public class Calculator {
    void sum(String message, int ...nums){

        System.out.print(message);
        int result = 0;
        for(int n: nums)
            result += n;
        System.out.println(result);
    }
    void check(int ch)
    {
        switch(ch)
        {
            case 1:
                return;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Break");
        }
    }
}

using System;

public class Watermelon
{
    public static void Main() 
    {
        int num = Convert.ToInt32(Console.ReadLine());
        if (num % 2 == 0 && num != 2) 
        {
            Console.WriteLine("YES");
        }
        else
        {
            Console.WriteLine("NO");
        }
    }
}
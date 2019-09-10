using System;
using System.Collections.Generic;
using System.Text;

namespace codeforces
{
    class A_231
    {
        static void Main()
        {
            int n = int.Parse(Console.ReadLine());
            int count = 0;
            for (int i = 0; i < n; i++)
            {
                int a, b, c;
                string[] nums = Console.ReadLine().Split();
                a = int.Parse(nums[0]);
                b = int.Parse(nums[1]);
                c = int.Parse(nums[2]);
                if (a+b+c >= 2)
                {
                    count++;
                }
            }
            Console.WriteLine(count);
            //Console.ReadLine();
        }
    }
}

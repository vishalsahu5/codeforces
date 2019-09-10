using System;
using System.Collections.Generic;
using System.Text;

namespace codeforces
{
    class WayTooLongWords
    {
        static void Main()
        {
            int n = int.Parse(Console.ReadLine());
            for (int i = 0; i < n; i++)
            {
                string s = Console.ReadLine();
                if (s.Length > 10)
                {
                    string ans = "";
                    ans = s[0] + Convert.ToString(s.Length - 2) + s[s.Length - 1];
                    Console.WriteLine(ans);
                }
                else
                {
                    Console.WriteLine(s);
                }
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Text;

namespace codeforces
{
    class A_118
    {
        static void Main()
        {
            string s = Console.ReadLine();
            string ans = "";
            HashSet<char> vowels = new HashSet<char>();
            vowels.Add('A');
            vowels.Add('E');
            vowels.Add('I');
            vowels.Add('O');
            vowels.Add('U');
            vowels.Add('Y');
            for (int i = 0; i < s.Length; i++)
            {
                if (!vowels.Contains(Char.ToUpper(s[i])))
                {
                    ans = ans + "." + Convert.ToString(Char.ToLower(s[i]));
                }
            }
            Console.WriteLine(ans);
        }
    }
}

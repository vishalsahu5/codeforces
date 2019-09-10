using System;
using System.Collections.Generic;
using System.Text;

namespace codeforces
{
    class TheatreSquare
    {
        public static void Main()
        {
            string[] values = Console.ReadLine().Split();
            long n = long.Parse(values[0]);
            long m = long.Parse(values[1]);
            long a = long.Parse(values[2]);
            long vertical = (long)Math.Ceiling((double)n / a);
            long horizontal = (long)Math.Ceiling((double)m / a);
            Console.WriteLine(vertical * horizontal);
        }
    }
}

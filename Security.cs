using System;
using System.Linq;

namespace Security
{
    class Program
    {
        static void Main(string[] args)
        {
            string eingabe = Console.ReadLine();
            int found = 0;
            found = eingabe.IndexOf("$");
            string s = eingabe.Substring(found);
            found = eingabe.IndexOf("T");
            string t = eingabe.Substring(found);

            if (s.StartsWith("$") == true && s.EndsWith("T") == true)
            {
                eingabe = s;
            } else if (t.StartsWith("T") == true && t.EndsWith("$") == true) 
            {   
                eingabe = t;
            }
            char[] charArr = eingabe.ToCharArray();
            char[] specArr = { 'x', '$', 'T', 'G' };
            var different = charArr.Except(specArr).ToList();
            if (different.Count == 0)
            {
                int iS = Array.IndexOf(charArr, '$');
                int iT = Array.IndexOf(charArr, 'T');
                int iG = Array.IndexOf(charArr, 'G');

                if ((iS > iG && iG > iT) || (iS < iG && iG < iT))
                {
                    Console.WriteLine("quiet");
                } else Console.WriteLine("ALARM");
            } else Console.WriteLine("Syntax_Error / Only the following characters are possible for input: 'x, G, T, $'.");
        }
    }       
}
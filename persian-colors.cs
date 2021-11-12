using System;
using System.Collections.Specialized;

namespace persianColors
{
    class Program
    {
        static void Main(string[] args)
        {
            // list of the persian colors
            NameValueCollection persianColors = new NameValueCollection()
            {
                {"red"        , "#c81d11"},
                {"plum"       , "#701c1c"},
                {"pink"       , "#f77fbe"},
                {"rose"       , "#fe28a2"},
                {"green"      , "#00a693"},
                {"orange"     , "#d99058"},
                {"indigo"     , "#32127a"},
                {"blue"       , "#1c39bb"},
                {"mediumBlue" , "#0067a5"}
            };
            
            // print once of the 'persiancolors' value
            Console.WriteLine(persianColors["red"]);

            Console.ReadKey();
        }
    }
}
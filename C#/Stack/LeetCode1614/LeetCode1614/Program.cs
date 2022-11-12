using System;
using System.Collections;

// LeetCode 1614: Maximum Nesting Depth of the Parentheses(Easy)
namespace LeetCode1614
{
    public class Program
    {
        public static void Main(string[] args)
        {                      
            string s1 = "(1+(2*3)+((8)/4))+1";
            Console.WriteLine($"Depth of s1: {MaxDepth(s1)}");

            string s2 = "(1)+((2))+(((3)))";
            Console.WriteLine($"Depth of s2: {MaxDepth(s2)}");
        }

        // My solution
        // Retrospect1: 어차피 depth와 myStack이 같은 역할을 하므로 myStack 변수는 필요 없었다!
        // Retrospect2: String class가 indexer를 정의하고 있기 때문에 굳이 array로 string을 쪼개지 않아도 string를 index로 바로 접근할 수 있다!
        public static int MaxDepth(string s)
        {
            int depth = 0;
            int max = 0;
            char[] arr = s.ToCharArray(0, s.Length);
            Stack myStack = new Stack();

            foreach (char item in arr)
            {
                if (item is '(')
                {
                    myStack.Push(item);
                    depth++;
                    if (depth > max)
                        max = depth;
                }

                if (item is ')' && myStack.Count != 0)
                {
                    myStack.Pop();
                    depth--;
                    if (myStack.Count == 0)
                        depth = 0;
                }               
            }
            return max;
        }

        // Others' solution1
        public static int MaxDepth1(string s)
        {
            int count = 0;
            int max = 0;
            for (int i = 0; i < s.Length; i++)
            {
                if (s[i] == '(')
                    count++;
                if (s[i] == ')')
                {
                    if (count > max)
                        max = count;
                    count--;
                }
            }

            return max;
        }

        // Others' solution2
        public  static int MaxDepth2(string s)
        {
            int count = 0, max = 0;
            for (int i = 0; i < s.Length; i++)
            {
                if (s[i] == '(')
                    count++;
                else if (s[i] == ')')
                    max = Math.Max(max, count--);
            }
            return max;
        }
    }
}

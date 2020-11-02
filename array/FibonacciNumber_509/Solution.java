package codingDrills.array.FibonacciNumber_509;
/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).
 */

public class Solution {

  /*  public int fib(int N) {
        if (N <= 1) {
            return N;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }
   */

   /* Time O(N); Space O(N)
    public int fib(int N) {
        if (N <= 1) {
            return N;
        } else {
            return memoize(N);
        }
    }

    public int memoize(int N) {
        int[] cache = new int [N +1];
        cache[1] = 1;

        for (int i = 2; i <= N; i++)  {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[N];
    }

    */

    //Time O(N); Space O(1)
        public int fib(int N) {
            if (N <= 1) {
                return N;
            }
            if (N == 2) {
                return 1;
            }

            int current = 0;
            int prev1 = 1;
            int prev2 = 1;

            for (int i = 3; i <= N; i++) {
                current = prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }
            return current;
        }
    }


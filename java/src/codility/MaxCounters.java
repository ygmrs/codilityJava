package codility;

public class MaxCounters {

    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int length = A.length, maxOfCounter = 0, lastUpdate = 0;
        int applyMax = N + 1;
        int result[] = new int[N];
        for (int i = 0; i < length; ++i ) {
            if(A[i] == applyMax){
                lastUpdate = maxOfCounter;
            } else if (A[i] <= N)  {
                int position = A[i]-1;
                result[position] = result[position] > lastUpdate
                        ? result[position] + 1 : lastUpdate + 1;
                // updating the max for future use
                if(maxOfCounter <=  result[position]) {
                    maxOfCounter = result[position];
                }
            }
        }
        // updating all the values that are less than the lastUpdate to the max value
        for (int i = 0; i < N; ++i) {
            if(result[i] < lastUpdate) {
                result[i] = lastUpdate;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 4, 6, 1, 4, 4};
        int[] result = solution(5, arr);
        System.out.println(result.length);

    }
}


/*You are given N counters, initially set to 0, and you have two possible operations on them:

    increase(X) − counter X is increased by 1,
    max counter − all counters are set to the maximum value of any counter.
    A non-empty array A of M integers is given. This array represents consecutive operations:

    if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
    if A[K] = N + 1 then operation K is max counter.
    For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
    the values of the counters after each consecutive operation will be:

    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
    The goal is to calculate the value of every counter after all operations.

    Write a function:

class Solution { public int[] solution(int N, int[] A); }

that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.

    Result array should be returned as an array of integers.

    For example, given:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
    the function should return [3, 2, 2, 4, 2], as explained above.

    Write an efficient algorithm for the following assumptions:

    N and M are integers within the range [1..100,000];
    each element of array A is an integer within the range [1..N + 1].
    Copyright 2009–2019 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.*/
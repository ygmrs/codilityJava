package codility;

public class MissingInteger {

    public static int solution(int[] A){
        int len = A.length;
        int[] occurrence = new int[len];
        int negativeCnt = 0;
        for(int a: A){
            if(a<1 || a>len){
                negativeCnt++;
                continue;
            }
            occurrence[a-1] = 1;
        }
        if(negativeCnt == len) return 1;
        for (int i=0; i<len ; i++) {
            if(occurrence[i] == 0){
                return i+1;
            }
        }
        return len+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 4, 1, 2};
        int result = solution(arr);
        System.out.println(result);
    }
}


/*This is a demo task.

    Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

    Given A = [1, 2, 3], the function should return 4.

    Given A = [−1, −3], the function should return 1.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].*/
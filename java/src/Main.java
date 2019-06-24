

public class Main {

    public static int solution (int N){
        if(N<10){
            return 0;
        }else{
            for(int i=1; i<10; i++){
                int smallest = (int) Math.pow(10, i);
                if(smallest == N){
                    return smallest;
                }else if(smallest > N){
                    return (int) Math.pow(10, i-1);
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int k = solution(32);
        System.out.println(k);
    }
}



/*
 // write your code in Java SE 8
        if(N<10){
            return 0;
        }else{
            for(int i=1; i<10; i++){
                int smallest = (int) Math.pow(10, i);
                if(smallest == N){
                    return smallest;
                }else if(smallest > N){
                    return (int) Math.pow(10, i-1);
                }
            }
        }
        return Integer.MAX_VALUE;


        int sro = 0;
        a = (int)Math.ceil(Math.sqrt(a));
        b = (int)Math.floor(Math.sqrt(b));
        while(b >= a) {
            a = (int)Math.ceil(Math.sqrt(a));
            b = (int)Math.floor(Math.sqrt(b));
            sro++;
        }
        return sro;

*/

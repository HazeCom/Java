package JavaPracticeOfDSA;

import java.util.HashMap;

public class DynamicProgramming {
    public static void main(String[] args) {
        // link for dynamic programing :- https://youtu.be/oBt53YbR9Kk  (by :- freeCodeCamp.org);

        //slow the time complexity is O(2^n) and space complexity is O(n);
        System.out.println(fibRecursive(50)); // output:-12586269025

        //Optimization of fib using dynamic programming;
        // Memoization
        System.out.println(fibMemo(50,new HashMap<>()));


    }
    static long fibRecursive(int n){
        if(n<=2)
            return 1;

        return fibRecursive(n-1) + fibRecursive(n-2);
    }

    static long fibMemo(int n , HashMap<Integer, Long> map){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n<=2)
            return 1;
        map.put(n,fibMemo(n-1,map)+fibMemo(n-2,map));
        return map.get(n);
    }

}

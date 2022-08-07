package JavaPracticeOfDSA;

import java.util.HashMap;

public class DynamicProgramming {
    public static void main(String[] args) {
        // link for dynamic programing :- https://youtu.be/oBt53YbR9Kk  (by :- freeCodeCamp.org);

        //slow the time complexity is O(2^n) and space complexity is O(n);
        System.out.printf("%-20d%s\n",Fibonacci.fibRecursive(20) , " //Fibonacci using Recursion");

        //Optimization of fib using dynamic programming;
        // Memoization
        System.out.printf("%-20d%s\n",Fibonacci.fibMemo(50,new HashMap<>()) , " //Fibonacci using Memoization");

        // GridTraveler using recursion
        System.out.printf("%-20d%s\n",GridTraveler.gridTraveler(2,3) , " //Grid Traveler using Recursion");

        // GridTraveler using Memoization
        System.out.printf("%-20d%s\n",GridTraveler.gridTraveler(18,18,new HashMap<>()) , " //Grid Traveler using Memoization");

        //CanSum using recursion
        int[] numbers = {4,5,2,7};
        int[] secoundNumbers = {7,14};
        System.out.printf("%-20b%s\n",CanSum.canSum(7,numbers), " //CanSum using Recursion");

        //CanSum using Memoization
        System.out.printf("%-20b%s\n",CanSum.canSum(300,secoundNumbers,new HashMap<>()), " //CanSum using Memoization");
    }

}


class Fibonacci{
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

class GridTraveler{
    static int gridTraveler(int n, int m){
        if(n<0 || m< 0){
            return 0;
        }
        if(n==1 && m == 1){
            return 1;
        }
        return (gridTraveler(n-1,m) + gridTraveler(n,m-1));
    }
    static long gridTraveler(int n , int m,HashMap<String, Long> map) {
        String key = m+" "+n;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        if(n<0 || m< 0){
            return 0;
        }
        if(n==1 && m == 1){
            return 1;
        }
        map.put (key ,gridTraveler(n-1,m,map) + gridTraveler(n,m-1,map));
        return map.get(key);
    }
}


class CanSum{
    static boolean canSum(int target , int[] numbers){
        if(target==0){
            return true;
        }
        if(target<0){
            return false;
        }
        for(int n : numbers){
            if(canSum(target-n,numbers)){
                return true;
            }
        }
        return false;
    }

    static boolean canSum(int target , int[] numbers,HashMap<Integer, Boolean> map){
        if(map.containsKey(target))
            return map.get(target);
        if(target==0){
            return true;
        }
        if(target<0){
            return false;
        }
        for(int n : numbers){
            if(canSum(target-n,numbers,map)){
                map.put(target,true);
                return true;
            }
        }
        map.put(target,false);
        return false;
    }
}
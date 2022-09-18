package JavaPracticeOfDSA.attempt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

class Main{
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        int output =  fibo(400, new HashMap<>());
        out.println(output);
        out.flush();
    }

    static int fibo(int n, Map<Integer,Integer> memo){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n<=2){
            return 1;
        }
        memo.put(n,fibo(n-1,memo)+fibo(n-2,memo));
        return memo.get(n);
    }

}

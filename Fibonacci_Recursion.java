package Day1_190523;
import java.util.Scanner;

public class Fibonacci_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pos = in.nextInt();
        int ans = fibo(pos);
        System.out.println(ans);
    }
    static int fibo(int x){
        if(x==0)
            return 0;
        if(x==1||x==2)
            return 1;
        int result = fibo(x-2)+fibo(x-1);
        return result;
    }
}
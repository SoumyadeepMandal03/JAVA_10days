package Day1_190523;

import java.util.Scanner;

public class Pascal_Triangle_Recursion {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of line: ");
        int n = in.nextInt();
        int i, j;
        Pascal pt = new Pascal();
        for (i = 0; i <= n; i++) {
            //Inner loop 1 is creation the left space.
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Inner loop-2 is printing the binomial terms and printing right space after each value.
            for (j = 0; j <= i; j++) {
                // nCr formula
                System.out.print( pt.factorial(i) / (pt.factorial(i - j)* pt.factorial(j)) + " ");
            }
            System.out.println(); //Responsible for changing the line.
        }
    }
    static class Pascal {
        public int factorial(int i)
        {
            if (i == 0)
                return 1;
            return i * factorial(i - 1);
        }
    }
}

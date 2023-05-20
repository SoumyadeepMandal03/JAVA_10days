package Day1_190523;

import java.util.Scanner;

public class Pascal_Triangle_Iteration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of lines: ");
        int n = in.nextInt();
        pascalTriangle(n);
    }
    static void pascalTriangle(int n)
    {
        for (int l = 1; l <= n; l++) {
            //Inner loop-1 is creating left space.
            for (int j = 0; j <= n - l; j++) {
                System.out.print(" ");
            }
            // used to represent C(line, i)
            //Next inner loop is responsible for binomial values.
            int C = 1;
            for (int i = 1; i <= l; i++) {
                // The first value in a line is always 1
                System.out.print(C + " "); //printing the binomial value & right space after each value.
                C = C * (l - i) / i;
            }
            System.out.println(); //Responsible for changing the line.
        }
    }
}

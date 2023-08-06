/*Implementing Pow(x, n)  Problem: https://leetcode.com/problems/powx-n/
*/
import java.util.Scanner;

class Solution1 {
    public double myPow(double x, int n) {
        double res = 1d;
        int y = n;
        if (n == Integer.MIN_VALUE)
            return 1.0 / (x * myPow(x, Integer.MAX_VALUE));
        if (n < 0) n = -n;
        for (int i = 0; i < n; i++) {
            res = res * x;
        }
        if (y > 0) return res;
        else return (1 / res);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution1 solution1 = new Solution1();

        System.out.print("Enter the value for double x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the value for int n: ");
        int n = scanner.nextInt();

        double result = solution1.myPow(x, n);
        System.out.println("Result: " + result);
    }
}
import java.util.Scanner;

//70. Climbing Stairs
//https://leetcode.com/problems/climbing-stairs/description/?envType=problem-list-v2&envId=dynamic-programming

public class ClimbingStairs {

    static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        System.out.println(solution(n));
    }


    public static int solution(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;

        }
        return current;
    }
}

public class DivisorGame {

//    1025. Divisor Game
//    https://leetcode.com/problems/divisor-game/description/

    static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }

    static boolean solution(int n){
        if (n%2==0){
            return true;
        }
        return false;
    }
}

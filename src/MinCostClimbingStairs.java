public class MinCostClimbingStairs {

//    746. Min Cost Climbing Stairs
//    https://leetcode.com/problems/min-cost-climbing-stairs/?envType=problem-list-v2&envId=dynamic-programming

    static void main(String[] args) {
       int[] cost = {1,100,1,1,1,100,1,1,100,1};
        //System.out.println(solution(cost));
        System.out.println(5%2);
    }

    public static int solution(int[] cost){
        int first= cost[0];
        int second = cost[1];
        if (cost.length <=2){
            return Math.min(first,second);
        }
      for (int i = 2; i <cost.length ; i++) {
          int current = cost[i] + Math.min(first,second);
          first = second;
          second = current;
        }
      return Math.min(first,second);
    }
}
